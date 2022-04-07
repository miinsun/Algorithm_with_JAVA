/* 백준 그래프 - 10816 :: 숫자 카드 2 _ 이분탐색*/

import java.util.*;
import java.io.*;

public class Main {		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 상근이 카드정보 입력
		int n = Integer.parseInt(br.readLine());		
		int [] arr = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
 		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
 		
 		// 배열 정렬, lt,rt 초기화
 		Arrays.sort(arr);
 		
 		// 상근이가 갖고 있는 카드 유무
 		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
 		for(int i = 0; i < m; i++) {
 			int find = Integer.parseInt(st.nextToken());
 	 		int lt = 0;
 	 		int rt = n - 1;
 	 		int cnt = 0;
 	 		
 			while(lt <= rt) {
 				int mid = (lt + rt) / 2;
 				if(find == arr[mid]) {
 					for(int j = lt; j <= rt; j++) {
 						if(find == arr[j])
 							cnt++;
 					}
 					break;
 				}
 				else if(find > arr[mid]) {
 					lt = mid + 1;
 				}
 				else
 					rt = mid - 1;
 			}
 			
 			sb.append(cnt).append(' ');
 		}

 		System.out.println(sb);
		br.close();
	}
}