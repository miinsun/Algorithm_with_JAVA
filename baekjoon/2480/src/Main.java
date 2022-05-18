/* 백준 조건문 - 2480 :: 주사위 세개 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int answer = 0;
		if(A == B && A == C ) {
			answer = 10000 + A * 1000;
		}
		else if(A != B && A == C) {
			answer = 1000 + A * 100;
		}
		else if(A == B && A != C) {
			answer = 1000 + A * 100;
		}
		else if(B == C && B != A) {
			answer = 1000 + C * 100;
		}
		else {
			int max = Math.max(A, Math.max(B, C));
			answer = max * 100;
		}
		
		System.out.println(answer);
	}
}