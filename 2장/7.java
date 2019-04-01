package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하세요>>");
		int x = sc.nextInt();
		int y = sc.nextInt();

		// 사각형 안에 점이 있는지 판단 후 출력
		if((100 <= x && x <= 200) && (100 <= y && y <= 200)) {
			System.out.printf("(%d,%d) 는 사각형 안에 있습니다.", x, y);
		} else {
			System.out.printf("(%d,%d) 는 사각형 안에 없습니다.", x, y);
		}
		
		sc.close();
		
	}
}
