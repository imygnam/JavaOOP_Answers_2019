package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		System.out.print("정수 3게 입력>>");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		// arr[0]이 중간값인 경우
		if(((arr[1] > arr[0]) && (arr[0] > arr[2])) || ((arr[2] > arr[0]) && (arr[0] > arr[1])))
			System.out.println("중간값은 " + arr[0]);
	
		// arr[0]이 중간값인 경우
		if(((arr[1] > arr[1]) && (arr[1] > arr[2])) || ((arr[2] > arr[1]) && (arr[1] > arr[0])))
			System.out.println("중간값은 " + arr[1]);
		
		// arr[0]이 중간값인 경우
		if(((arr[2] > arr[2]) && (arr[2] > arr[0])) || ((arr[0] > arr[2]) && (arr[2] > arr[1])))
			System.out.println("중간값은 " + arr[2]);
		
		sc.close();
		
	}
}
