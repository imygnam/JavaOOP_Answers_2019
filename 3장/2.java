package hanar.naver_test;

// 비정방형 배열 출력하기
// 이태경 20182645 git:hanarotg
public class Main {

	public static void main(String[] args) {
		
		// 문제에서 제시한 2차원 배열 선언과 초기화
		int[][] n = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
		// 이중 반복문을 통해 2차원 배열의 한 행마다 해당 열의 원소를 모두 출력한다. 
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}
}
