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
		
		System.out.print("직사각형을 이루는 첫번째 점의 좌표를 입력하세요>>");
		int rectX1 = sc.nextInt();
		int rectY1 = sc.nextInt();
		
		System.out.print("직사각형을 이루는 두번째 점의 좌표를 입력하세요>>");
		int rectX2 = sc.nextInt();
		int rectY2 = sc.nextInt();
		
		// 해당 입력한 두 점으로 이루어진 직사각형을 이루는 4개의 꼭짓점이 제공된 직사각형 내에 있는지 여부를 검사한다.
		if(inRect(rectX1, rectY1, 100, 100, 200, 200)) {
			flag++;
		}
		if(inRect(rectX2, rectY2, 100, 100, 200, 200)) {
			flag++;
		}
		if(inRect(rectX1, rectY2, 100, 100, 200, 200)) {
			flag++;
		}
		if(inRect(rectX2, rectY1, 100, 100, 200, 200)) {
			flag++;
		}
		
		if(flag != 0) {
			System.out.println("두 직사각형은 충돌합니다.");
		} else {
			System.out.println("두 직사각형은 충돌하지 않습니다.");
		}
		
		sc.close();
		
	}
}
