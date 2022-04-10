/* 백준 분할정복 - 2630 :: 색종이 만들기 */
import java.util.*;
import java.io.*;

public class Main {
	static int[][] arr;
	static int BLUE = 0;	// 1에 해당
	static int WHITE = 0;	// 0에 해당
	
	public static void partition(int x, int y, int size) {
		// 만약 같은 색상으로 이루어져있다면 해당 색상 카운트를 증가시킨다.
		if (check(x, y, size)) {
			if(arr[x][y] == 1) { 
				BLUE++;
			}
			else if(arr[x][y] == 0) {
				WHITE++;
			}
 
			return;
		}
 
		int newSize = size / 2;
		
		partition(x, y, newSize);						// 왼쪽 위
		partition(x, y + newSize, newSize);				// 오른쪽 위
		
		partition(x + newSize, y, newSize);				// 왼쪽 아래
		partition(x + newSize, y + newSize, newSize);	// 오른쪽 아래
 
	}
	
	static boolean check(int x, int y, int size) {
		int base = arr[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(base != arr[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		partition(0, 0, n);
		
		System.out.println(WHITE);	// 0
		System.out.println(BLUE);	// 1
		
		br.close();
	}
}
