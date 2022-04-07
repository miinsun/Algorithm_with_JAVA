/* 백준 그래프 - 2110 :: 공유기 설치 */

import java.util.*;
import java.io.*;

public class Main {	
	static public long count (int[] arr, long dist) {
		long cnt = 1;
		// 가장 왼쪽에는 무조건 배치
		int ep = arr[0];

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] - ep >= dist) {
				cnt++;
				ep = arr[i];
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		// 집의 개수
		int n = sc.nextInt();
		// 공유기의 개수
		int c = sc.nextInt();
		
		// 집의 좌표
		int [] arr = new int [n];
 		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
 		
 		// 배열 정렬, lt,rt 초기화
 		Arrays.sort(arr);
 		long lt = 1;
 		long rt = arr[n-1];
 		long answer = 0;
 		
 		// 이분 탐색 (결정 알고리즘)
		while(lt <= rt) {
			// mid값은 가장 인접한 공유기의 거리이다.
			long mid = (lt + rt) / 2;
			// count()는 유효값을 찾는 함수
			if(count(arr, mid) >= c) {
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