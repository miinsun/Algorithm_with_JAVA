/* 백준 동적 계획법 1 - 1904 :: 01타일 */
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 삼각형의 크기
		int n = Integer.parseInt(br.readLine());
		int []dy = new int [n + 1];
		
		if(n >= 1)
			dy[1] = 1;
		
		if(n >= 2)
			dy[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			dy[i] = (dy[i - 2] + dy[i - 1]) % 15746;
		}
		
		System.out.println(dy[n]);
		br.close();
	} 
}
