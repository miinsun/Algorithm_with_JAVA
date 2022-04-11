/* 백준 브루트 포스 - 1018 :: 체스판 다시 칠하기 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] arr = new boolean [n][m];
		
		// 체스판 입력
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			for(int j = 0; j < m; j++) {
				if(str.charAt(j) == 'W')
					arr[i][j] = true;
				else
					arr[i][j] = false;
			}
		}
		
		int min = 64;
		for(int i = 0; i < n - 7; i++) {
			for(int j = 0; j < m - 7; j++) {
				int end_x = i + 8;
				int end_y = j + 8;
				int count = 0;
				boolean TF = arr[i][j];	// 첫 번째 칸의 색 
		 
				for (int k = i; k < end_x; k++) {
					for (int h = j; h < end_y; h++) {
						if (arr[k][h] != TF) {	
							count++;
						}
						TF = (!TF);
					}
					TF = !TF;
				}
				
				count = Math.min(count, 64 - count);
				min = Math.min(min, count);
			}

		}
		
		System.out.println(min);
		
		sc.close();
	}
}
