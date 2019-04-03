package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>>");
		double a = sc.nextDouble();
		String s = sc.next();
		double b = sc.nextDouble();
		
		// 스위치문을 이용하여 프로그램 작성
		// java 7부터 Expression 에 String 값을 사용할 수 있음.
		switch(s) {
			case "+":
				System.out.println(a + "+" + b + "의 계산 결과는 " + (a+b) + "입니다.");
				break;
			case "-":
				System.out.println(a + "-" + b + "의 계산 결과는 " + (a-b) + "입니다.");
				break;
			case "*":
				System.out.println(a + "*" + b + "의 계산 결과는 " + (a*b) + "입니다.");
				break;
			case "/":
				if(b == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				} else {
					System.out.println(a + "/" + b + "의 계산 결과는 " + (a/b) + "입니다.");
				}
				break;
			default : 
				System.out.println("올바르지 않은 수식을 입력하셨습니다.");
				break;
		}
		
		sc.close();
		
	}
}
