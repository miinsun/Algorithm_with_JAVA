/* 백준 분할정복 - 2447 :: 별 찍기 - 10 */
import java.io.*;

public class Main {	
	static char[][] board;
	public static void fillBlank(int x, int y, int size) {
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	public static void makeStar(int i, int j, int size) {
		if(size == 3) {
			board[i][j] = '*';
			board[i+1][j] = '*';
			board[i+2][j] = '*';
			board[i][j+1] = '*';
			board[i+1][j+1] = ' ';
			board[i+2][j+1] = '*';
			board[i][j+2] = '*';
			board[i+1][j+2] = '*';
			board[i+2][j+2] = '*';
			return;
		}
		
		int newSize = size / 3;
		
		// 왼쪽 위
		makeStar(i, j, newSize);
		// 가운데 위
		makeStar(i + newSize, j, newSize);
		// 오른쪽 위
		makeStar(i + (2 * newSize), j, newSize);
		
		// 왼쪽 가운데
		makeStar(i, j + newSize, newSize);
		// 가운데 가운데
		fillBlank(i + newSize, j + newSize, newSize);
		// 오른쪽 가운데
		makeStar(i + (2 * newSize), j + newSize, newSize);
		
		// 왼쪽 아래
		makeStar(i , j + (2 * newSize), newSize);
		// 가운데 아래
		makeStar(i + newSize , j + (2 * newSize), newSize);
		// 오른쪽 아래
		makeStar(i + (2 * newSize), j + (2 * newSize), newSize);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		int n = Integer.parseInt(br.readLine());
		board = new char[n][n];
		
		makeStar(0, 0, n);		
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(board[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
