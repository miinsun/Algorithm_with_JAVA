/* for Jiwon - 1 */
import java.io.*;

public class Main {
	// 최소 공배수
	public static int findLCM(int a, int b) {
		if(b == 0) {
			return a;
		}
		return (a * b) / findGCD(a, b);
	}

	// 최대 공약수
	private static int findGCD(int a, int b) {
		if(b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		
		int prevL = 0, prevG = 0;
		String inputString = "";
		
		while(true) {
			System.out.print("Input : ");
			int num = Integer.parseInt(br.readLine());
			
			// 입력 받은 값이 0이면 종료
			if(num == 0) break;

			// 기존에 입력 받은 정수들 출력
			StringBuilder sb = new StringBuilder();
			inputString += num;
			sb.append("Input Numbers : " + inputString).append('\n');
		
			// 기존의 수와 입력 받은 값에서 최소 공배수 구하기
			int lcm = findLCM(num, prevL);
			sb.append("LCM : " + lcm).append('\n');

			// 기존의 수와 입력 받은 값에서 최대 공약수 구하기
			int gcd = findGCD(num, prevG);
			sb.append("GCD : " + gcd).append('\n');

			// lcm, gcd 출력
			System.out.println(sb);
			
			// 기존 최대 공약수, 최소 공배수 저장
			prevL = lcm;
			prevG = gcd;
			
			inputString += ",";
		}
	}
}
