/* 백준 분할정복 - 1992 :: 쿼드트리 */
import java.io.*;

public class Main {
	static int[][] arr;
	static String answer = "";
	public static void partition(int x, int y, int size) {
		if (check(x, y, size)) {
			if(arr[x][y] == 1) { 
				answer += "1";
			}
			else if(arr[x][y] == 0) {
				answer += "0";
			}
 
			return;
		}
 
		int newSize = size / 2;
		
		answer += "(";

		partition(x, y, newSize);						// 왼쪽 위
		partition(x, y + newSize, newSize);				// 오른쪽 위
		
		partition(x + newSize, y, newSize);				// 왼쪽 아래
		partition(x + newSize, y + newSize, newSize);	// 오른쪽 아래
		
		answer += ")";
 
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
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			char[] tmp = br.readLine().toCharArray();
			for(int j = 0; j < n; j++)
				arr[i][j] = tmp[j] - '0';
		}
		
		partition(0, 0, n);
		
		System.out.println(answer);
		
		br.close();
	}
}
