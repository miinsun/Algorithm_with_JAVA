/* 백준 동적 계획법 2 단계 - 11066 :: 파일 합치기 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		int t = Integer.parseInt(br.readLine());
 		
 		// t개의 테스트 진행
 		for(int i = 0; i < t; i++) {
 			int k = Integer.parseInt(br.readLine());
 			int[] dy = new int[k];
 			
 			int min = Integer.MAX_VALUE;
 			for(int j = 1; j <= k; j++) {
 				if(j == k) {
 					min = Math.min(min, dy[k - 1]);
 					break;
 				}
 				else {
 					
 				}
 			}
 			
 		}
	}
}
