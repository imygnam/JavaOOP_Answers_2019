package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double r = sc.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();
		
		// 변수 x에 두 원의 중심 x좌표의 차를 저장 
		if(x > x2){
			x = x - x2;
		} else {
			x = x2 - x;
		}
		
		// 변수 y에 두 원의 중심 y좌표의 차를 저장
		if(y > y2){
			y = y - y2;
		} else {
			y = y2 - y;
		}
		
		// 두 원의 중심사이의 거리와 두 원의 반지름 합의 크기를 비교한다.
		if(Math.sqrt(Math.pow(x ,2) + Math.pow(y ,2)) > (r + r2)){
			System.out.println("두 원은 서로 겹치지 않는다.");
		} else {
			System.out.println("두 원은 서로 겹친다.");
		}
		
		sc.close();
		
	}
}
