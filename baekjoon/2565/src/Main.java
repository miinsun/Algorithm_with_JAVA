/* 백준 동적 계획법 1 - 2565 :: 전깃줄 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 전깃줄의 수
	
		int [][] arr = new int[n][2];
		int [] dy = new int [n];

		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare (int[] o1, int[]o2) {
				return o1[0] - o2[0];
			}
		});
		

		int max = 0;
		for(int i = 0; i < dy.length; i++) {
			
			dy[i] = 1;

			for(int j = 0; j < i; j++) {
				if(arr[i][1] > arr[j][1]) {
					dy[i] = Math.max(dy[i], dy[j] + 1);
				}
			}
			max = Math.max(max, dy[i]);
		}
		
		
		System.out.println(n - max);
		
		br.close();
	} 
}
