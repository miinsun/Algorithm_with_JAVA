/* 백준 자료구조 - 1874 :: 스택 수열 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		Stack<Integer> s = new Stack<>();
		
		int tmp = sc.nextInt();	// 첫 번째로 구해야 하는 수 입력
		int limit = 1;	// 만들어야하는 수열 수 cnt
		for(int i = 1; i <= N; i++) {
			s.add(i);	// 1~N까지 수열 추가
			sb.append('+').append('\n');
			
			while(!s.isEmpty() && s.peek() == tmp) {	// 구해야 하는 수를 만나면
				s.pop();
				sb.append('-').append('\n');
				if(limit < N) {	// limit안에 들때만 새로운 입력받기
					tmp = sc.nextInt();
					limit++;
				}
			}

		}
		
		if(limit == N)	// 모든 입력을 받고 수열을 완성하면 성공
			System.out.println(sb);
		else	// 모든 입력을 받지 못하고 수열을 완성하면 실패
			System.out.println("NO");
		sc.close();
	}
}
