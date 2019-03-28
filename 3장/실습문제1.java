package hanar.naver_test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 실행에 필요한 변수 셍성
		double dollar;
		double won;
		Scanner money = new Scanner(System.in);
		
		System.out.println("원화를 입력하세요(단위 원 >>");
		won = money.nextDouble();
		
		// 원화를 달러로 변환
		dollar = won*(0.001);
		
		System.out.println(won + "원은" + dollar + "입니다.");
		
	}
}
