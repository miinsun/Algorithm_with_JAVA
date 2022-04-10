/* 백준 분할정복 - 11729 :: 하노이 탑 이동 순서 */
import java.io.*;

public class Main {	
	public static StringBuilder sb = new StringBuilder();

	public static void hanoi(int s, int m, int e, int size) {
		if(size == 1) {
			sb.append(s + " " + e).append("\n");
			return;
		}
		
		hanoi(s, e, m, size - 1);

		sb.append(s + " " + e).append("\n");
		
		hanoi(m, s, e, size - 1);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		int n = Integer.parseInt(br.readLine());
		
		sb.append((int)Math.pow(2,  n) - 1).append("\n");
		hanoi(1, 2, 3, n);		
		
		System.out.println(sb);
		br.close();
	}
}
