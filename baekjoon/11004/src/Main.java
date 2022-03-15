/* 백준 정렬 - 11004 :: K번째 수 */
import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		boolean [] cnt = new boolean[2000000001];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			cnt[Integer.parseInt(st.nextToken()) + 1000000000] = true;
		}
		
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i]) k--;
			if(k == 0) {
				System.out.println(i - 1000000000);
				break;
			}
		}
	}
}
