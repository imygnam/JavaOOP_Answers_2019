package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i; // 각 동전, 지폐의 갯수를 저장하는 변수
		
		System.out.print("금액을 입력하세요 >>");
		int money = sc.nextInt();
		
		// 오만원권 갯수 세기
		for(i=0; (money/50000) > 0; i++) {
			money = money - 50000;
		}
		System.out.println("오만원권 " + i + "매");
		
		// 만원권 갯수 세기
		for(i=0; (money/10000) > 0; i++) {
			money = money - 10000;
		}
		System.out.println("만원권 " + i + "매");
		
		// 천원권 갯수 세기
		for(i=0; (money/1000) > 0; i++) {
			money = money - 1000;
		}
		System.out.println("천원권 " + i + "매");
	
		// 백원 갯수 세기
		for(i=0; (money/100) > 0; i++) {
			money = money - 100;
		}
		System.out.println("백원 " + i + "개");
	
		// 오십원 갯수 세기
		for(i=0; (money/50) > 0; i++) {
			money = money - 50;
		}
		System.out.println("오십원 " + i + "개");

		// 십원 갯수 세기
		for(i=0; (money/10) > 0; i++) {
			money = money - 10;
		}
		System.out.println("십원 " + i + "개");

		// 일원 갯수 세기
		System.out.println("일원 " + money + "개");
		
		sc.close();
	}
}
