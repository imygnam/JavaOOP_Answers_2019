package hanar.naver_test;
import java.util.Scanner;

// 이태경 20182645, git:hanarotg
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		boolean flag = true; // 삼각형 성립 유무
		
		System.out.print("정수 3개를 입력하세요>>");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		if(arr[0] + arr[1] <= arr[2])
			flag = false;
		
		if(arr[0] + arr[2] <= arr[1])
			flag = false;
		
		if(arr[1] + arr[2] <= arr[0])
			flag = false;
		
		// 삼각형 유무 여부를 판단하여 출력
		if(flag == true)
			System.out.println("삼각형이 됩니다.");
		else {
			System.out.println("삼각형이 안됩니다.");
		}
		
		sc.close();
		
	}
}
