package hanar.naver_test;
import java.util.Scanner;

// git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		// 스캐너 및 변수 생성
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.print("두자리 수 정수를 입력하세요 >>>");
		
		i = sc.nextInt();
		
		// 각 자릿수 숫자가 동일한지를 판단
		if(i%10 == i/10) {
			System.out.print("yes");
		} else {
			System.out.print("No!");
		}
		
		sc.close();
		
	}
}
