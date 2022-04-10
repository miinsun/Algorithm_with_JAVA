/* 백준 분할정복 - 2448 :: 별 찍기 - 11 */
import java.io.*;

public class Main {	
	static char[][] board;
	
	public static void makeStar(int i, int j, int size) {
		if(size == 3) {
			board[i][j] = '*';
			board[i+1][j-1] = '*';
			board[i+1][j] = ' ';
			board[i+1][j+1] = '*';
			board[i+2][j-2] = '*';
			board[i+2][j-1] = '*';
			board[i+2][j] = '*';
			board[i+2][j+1] = '*';
			board[i+2][j+2] = '*';
			return;
		}
		
		int newSize = size / 2;
		
		// 위 가운데
		makeStar(i, j, newSize);
		
		// 아래 왼쪽
		makeStar(i + newSize, j - newSize, newSize);

		// 아래 오른쪽
		makeStar(i + newSize, j + newSize, newSize);
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		int n = Integer.parseInt(br.readLine());
		board = new char[n][(n * 2) - 1];
		
		// 배열 초기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n * 2) - 1; j++) {
				board[i][j] = ' ';
			}
		}
		
		makeStar(0, n - 1, n);		
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n * 2) - 1; j++) {
				sb.append(board[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
