package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int oneOf369 = 0;
		int number;
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		number = sc.nextInt();
		
		// number가 3,6,9 중 하나인 경우
		if(number < 10 && number%3 == 0) {
			System.out.println("박수짝");
		} else {
			// 일의 자리 검증
			if((number%10)%3 == 0) {
				if(number%10 == 0) {
					// 일의 자리가 0인 경우를 제외한다.  
				} else {
					oneOf369++;
				}
			}
			// 십의 자리 검증
			if((number/10)%3 == 0) {
				oneOf369++;
			}
			
			// 3,6,9 개수에 따라 결과를 출력한다.
			switch(oneOf369) {
				case 1:
					System.out.println("박수짝");
					break;
				case 2:
					System.out.println("박수짝짝");
					break;
				default:
					break;
			}
		}

		sc.close();
		
	}
}
