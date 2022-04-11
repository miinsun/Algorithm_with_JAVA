/* 백준 기본 수학 2 - 9020 :: 골드바흐의 추측 */
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
		prime = new boolean[10001];
		int n = Integer.parseInt(br.readLine());
		
		// 전범위의 소수 유무 구하기
		isDecimal();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			
			// 기준값은 tmp / 2가 된다.
			int a = tmp / 2, b = tmp / 2;
			while(true) {
				if(!prime[a] && !prime[b]) {
					// a, b 두 수 모두 소수면 반복문을 중지한다
					sb.append(a + " " + b).append('\n');
					break;
				}
				else {
					// 기준값에서 한칸씩 벌어지게한다
					a--;
					b++;
				}
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
