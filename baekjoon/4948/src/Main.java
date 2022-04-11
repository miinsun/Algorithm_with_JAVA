/* 백준 기본 수학 2 - 4948 :: 베르트랑 공준 */
import java.io.*;

public class Main {
	public static boolean[] prime;
	
	// 에라토스테네스의 체 : 소수 구하기
	public static void isDecimal() {
		// true = 소수 아님 , false = 소수
		prime[0] = prime[1] = true;
		
		// 제곱근까지 반복
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		prime = new boolean[(123456 * 2) + 1];
		
		// 전범위의 소수 유무 구하기
		isDecimal();
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			// 0이 입력되면 종료
			if(n == 0) break;
			
			int cnt = 0;
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) cnt++;
			}
			
			sb.append(cnt).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
