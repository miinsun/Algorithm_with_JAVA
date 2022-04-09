/* 백준 분할정복 - 11728 :: 배열 합치기 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int k = 0; k < n; k++)
			arr1[k] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int k = 0; k < m; k++)
			arr2[k] = Integer.parseInt(st.nextToken());
		
		int i = 0, j = 0;
		StringBuilder sb = new StringBuilder();
		while(i < n && j < m) {
			if(arr1[i] < arr2[j]) {
				sb.append(arr1[i] + " ");
				i++;
			}
			else {
				sb.append(arr2[j] + " ");
				j++;
			}
		}
		
		while(i < n) {
			sb.append(arr1[i] + " ");
			i++;
		}
		
		while(j < m) {
			sb.append(arr2[j] + " ");
			j++;
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
