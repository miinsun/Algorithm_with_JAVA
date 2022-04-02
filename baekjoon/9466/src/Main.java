/* 백준 그래프 - 9466 :: 텀 프로젝트 */
import java.util.*;
import java.io.*;

public class Main {
	static int n;
	
	static void DFS(int s, int[] arr, boolean[] check, boolean[] isThere) {
		check[s] = true;
		
		if(s != arr[s])
			isThere[s] = true;
		
		if(!check[arr[s]])
			DFS(arr[s], arr, check, isThere);
		
		// 혼자 선호하는 사람 제외, 그룹 참여 표시
		if(!isThere[arr[s]])
			isThere[s] = false;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			int sum = 0;

			int[] arr = new int[n + 1];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int alone = 0;
			for(int j = 1; j <= n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				if(j == arr[j]) alone++;
			}

			for(int j = 1; j <= n; j++) {
				boolean[] check = new boolean[n + 1];
				boolean[] isThere = new boolean[n+1];				
				DFS(j, arr, check, isThere);
				if(isThere[arr[j]]) sum++;
			}
			
			System.out.println(n - sum - alone);
		}

		br.close();
	}
}
