/* 백준 DP - 15486 :: 퇴사 2 */

import java.io.*;
import java.util.*;


class Time{ 
	public int s, e, price; 
	
	Time(int s, int e, int price){ 
		this.s = s; 
		this.e = e; 
		this.price = price;
	} 
}


public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// N일 후 퇴사
		ArrayList<Time> arr = new ArrayList<>();
		// 1부터 N+1까지 배열
		int[] dp = new int[N + 2];
		
		// N일까지의 일정 저장
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr.add(new Time(i, Integer.parseInt(st.nextToken()) + i, Integer.parseInt(st.nextToken())));
		}
		
		int max = 0;
		for(int i = 1; i <= N + 1; i++) {
			
			if(max < dp[i])
				max = dp[i];
			
			if(i <= N) {
				Time tmp = arr.get(i - 1);

				if(tmp.e <= N + 1) {
					dp[tmp.e] = Math.max(dp[tmp.e], max + tmp.price);
				}
			}

		}
		
		System.out.println(max);
		br.close();
	}
}
