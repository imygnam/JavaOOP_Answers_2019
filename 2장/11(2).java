package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("달을 입력하세요>>");
		month = sc.nextInt();
		
		switch(month){
			case 0:
				System.out.println("겨울");
				break;
			case 1:
				System.out.println("겨울");
				break;
			case 3:
				System.out.println("봄");
				break;
			case 4:
				System.out.println("봄");
				break;
			case 5:
				System.out.println("봄");
				break;
			case 6:
				System.out.println("여름");
				break;
			case 7:
				System.out.println("여름");
				break;
			case 8:
				System.out.println("여름");
				break;
			case 9:
				System.out.println("가을");
				break;
			case 10:
				System.out.println("가을");
				break;
			case 11:
				System.out.println("가을");
				break;
			case 12:
				System.out.println("겨울");
				break;
			default:
				System.out.println("잘못입력");
				break;
		}
		
		sc.close();
		
	}
}
