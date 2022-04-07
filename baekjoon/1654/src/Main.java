/* 백준 그래프 - 1654 :: 랜선 자르기 */

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
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		// 랜선 값 입력
		int [] arr = new int [k];
 		for(int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
 		
 		// 배열 정렬, lt,rt 초기화
 		Arrays.sort(arr);
 		long lt = 1;
 		long rt = arr[k-1];
 		long answer = 0;
 		
 		// 이분 탐색 (결정 알고리즘)
		while(lt <= rt) {
			long mid = (lt + rt) / 2;
			// count()는 유효값을 찾는 함수
			if(count(arr, mid) >= n) {
				answer = mid;
				// 최대값을 찾기 때문에 유효값을 찾으면 범위를 넓혀준다.
				lt = mid + 1;
			}
			else
				rt = mid - 1;
		}
		
		System.out.println(answer);
		sc.close();
	}
}