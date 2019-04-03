package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		double circleX = sc.nextDouble();
		double circleY = sc.nextDouble();
		double circleR = sc.nextDouble();
		
		System.out.print("점의 좌표 입력하세요>>");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		// 원의 중심과 점 사이의 거리와 원의 반지름 길이를 비교한다.
		if(Math.sqrt((Math.pow(Math.abs(circleX-x), 2) +
				Math.pow(Math.abs(circleY - y), 2))) < circleR) {
			System.out.printf("(%.1f, %.1f) 은 원 안에 있습니다.", x, y);
		} else {
			System.out.printf("(%.1f, %.1f) 은 원 밖에 있습니다.", x, y);
		}
		
		sc.close();
		
	}
}
