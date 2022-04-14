/* 백준 그리디 알고리즘 - 13305 :: 주유소 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 도시의 개수
		
		// 도로의 길이
		long[] roads = new long[n - 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n - 1; i++) {
			roads[i] = Integer.parseInt(st.nextToken());
		}

		// 주유소의 기름 가격
		long[] oils = new long[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			oils[i] = Integer.parseInt(st.nextToken());

		}
		
		long answer = 0;
		long min = oils[0];
		for(int i = 0; i < n - 1; i++) {
			min = Math.min(min, oils[i]);
			
			answer += (min * roads[i]);
		}
		
		System.out.println(answer);
		br.close();
	} 
}
