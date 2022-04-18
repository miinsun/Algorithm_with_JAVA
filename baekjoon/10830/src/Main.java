/* 백준 분할 정복 - 10830 :: 행렬 제곱 */

import java.util.*;
import java.io.*;

public class Main {	
	static public long count (int[] arr, long mid) {
		long cnt = 0;
		
		// 한 전선을 몇개로 나눌 수 있는지 합을 구한다.
		for(int x : arr) {
			cnt += x / mid;
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); 	// 행렬의 크기
		int B = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i <B; i++) {
			A *= A;
			System.out.println(A);

		}
		
		System.out.println(A);
		br.close();
	}
}