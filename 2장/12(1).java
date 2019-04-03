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
		
    // if문을 이용하여 프로그램 작성
		if(s.equals("+")) {
			System.out.println(a + "+" + b + "의 계산 결과는 " + (a+b) + "입니다.");
		} else if(s.equals("-")) {
			System.out.println(a + "-" + b + "의 계산 결과는 " + (a-b) + "입니다.");
		} else if(s.equals("*")){
			System.out.println(a + "*" + b + "의 계산 결과는 " + (a*b) + "입니다.");
		} else if(s.equals("/")) {
			// b가 0일때 0으로 나눌 수 없으므로
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.println(a + "/" + b + "의 계산 결과는 " + (a/b) + "입니다.");
			}
		}
		
		sc.close();
		
	}
}
