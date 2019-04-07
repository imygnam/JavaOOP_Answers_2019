package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {
	
	// 점 (x,y) 가 직사각형 내부에 있을 경우 true 를 리턴하는 메소드, 교재 제공
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)){
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int flag = 0;
		// 직사각형 내 임의의 좌표값을 저장하기 위한 변수
		int rectX_tmp = 0;
		int rectY_tmp = 0;
		
		System.out.print("직사각형을 이루는 첫번째 점의 좌표를 입력하세요>>");
		int rectX1 = sc.nextInt();
		int rectY1 = sc.nextInt();
		
		System.out.print("직사각형을 이루는 두번째 점의 좌표를 입력하세요>>");
		int rectX2 = sc.nextInt();
		int rectY2 = sc.nextInt();
		 
		// 해당 입력한 두 점으로 이루어진 직사각형(A) 내부의 점이 제공된 직사각형(B) 내에 있는지 여부를 검사한다.
		for(rectX_tmp = rectX1; rectX2 >= rectX_tmp; rectX_tmp++) {
			for(rectY_tmp = rectY1; rectY2 >= rectY_tmp; rectY_tmp++) {		
				// A직사각형 내 점이 B직사각형 내에 있는 경우 
				if(inRect(rectX_tmp, rectY_tmp, 100, 200, 100, 200)) {
					flag = 1;
					break;
				}
			}
		}
		
		// 직사각형 A,B가 충돌하는 경우
		if(flag != 0) {
			System.out.println("두 직사각형은 충돌합니다.");
		} 
		// 충돌하지 않는 경우
		else {
			System.out.println("두 직사각형은 충돌하지 않습니다.");
		}
		
		sc.close();
		
	}
}
