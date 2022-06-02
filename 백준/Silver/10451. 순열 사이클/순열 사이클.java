/* 백준 그래프 - 10451 :: 순열 사이클 */
import java.util.*;
import java.io.*;

public class Main {
	static int answer = 0;
	
	public void DFS(int s, int initial, int[] arr, boolean[] check) {	
		check[s] = true;

		if(initial == arr[s])
			answer++;
		
		if(!check[arr[s]]) {
			DFS(arr[s], initial, arr, check);
		}		
	}

	public static void main(String[] args) throws IOException{
		Main main = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			int[] arr = new int [n + 1];
			boolean[] check = new boolean [n + 1];

			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				int x = Integer.parseInt(st.nextToken());
				arr[j] = x;
			}
			
			for(int j = 1; j <= n; j++) {
				if(!check[j])
					main.DFS(j, j, arr, check);
			}
			
			System.out.println(answer);
			answer = 0;
		}
		
        br.close();
	}
}