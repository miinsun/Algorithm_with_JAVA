/* 백준 그래프 - 10815 :: 숫자 카드 */

import java.util.*;
import java.io.*;

public class Main {		
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		// 상근이 카드정보 입력
		int n = sc.nextInt();		
		int [] arr = new int [n];
 		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
 		
 		// 배열 정렬, lt,rt 초기화
 		Arrays.sort(arr);
 		
 		// 상근이가 갖고 있는 카드 유무 검사
 		int m = sc.nextInt();		
 		for(int i = 0; i < m; i++) {
 			int find = sc.nextInt();
 	 		int lt = 0;
 	 		int rt = n-1;
 	 		boolean flag = false;
 	 		
 			while(lt <= rt) {
 				int mid = (lt + rt) / 2;
 				if(find == arr[mid]) {
 					flag = true;
 					break;
 				}
 				else if(find > arr[mid]) {
 					lt = mid + 1;
 				}
 				else
 					rt = mid - 1;
 			}
 			
 			if(flag)
 				System.out.print(1 + " ");
 			else
 				System.out.print(0 + " ");
 		}

		sc.close();
	}
}