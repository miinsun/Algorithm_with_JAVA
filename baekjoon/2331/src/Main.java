/* 백준 그래프 - 2331 :: 반복수열 */
import java.util.*;

public class Main {
	static int answer = 0;
	static ArrayList<Integer> list = new ArrayList<>();
	
	static void DFS(String A, int P) {
		// D[n-1]의 각 자리의 숫자를 p번 곱한 수들의 합 구하기
		int total = 0;
		for(char c : A.toCharArray()) {
			int tmp = 1;
			for(int i = 0; i < P; i++) {
				tmp *=  c - '0';
			}
			total += tmp;
		}
		
		// 반복 수열을 발견하면
		if(list.contains(total)) {
			// 반복 수열의 처음 인덱스 값 리턴
			answer = list.indexOf(total);
		}
		else {
			list.add(total);
			DFS(String.valueOf(total), P);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		int P = sc.nextInt();
		
		list.add(Integer.parseInt(A));
		DFS(A, P);
		System.out.println(answer);
		sc.close();
	}
}
