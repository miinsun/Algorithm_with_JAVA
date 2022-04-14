/* 백준 그리디 알고리즘 - 1541 :: 잃어버린 괄호 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int answer = 0;

		boolean isMinus = false;
		String tmp = "";
		for(char c : s.toCharArray()) {
			// 숫자면 tmp에 담아서 저장
			if(Character.isDigit(c)) {
				tmp += c;
			}
			else {
				// 기호를 만나면, answer에 tmp를 더하거나 빼준다.
				if(isMinus)
					answer -= Integer.parseInt(tmp);
				else
					answer += Integer.parseInt(tmp);
				
				// - 이후의 모든 수는 빼준다.
				if(c == '-') {
					isMinus = true;
				}
				
				// tmp 초기화
				tmp = "";
			}
		}
		
		// 마지막 숫자도 계산해준다
		if(isMinus)
			answer -= Integer.parseInt(tmp);
		else
			answer += Integer.parseInt(tmp);
		
		System.out.println(answer);
		br.close();
	} 
}
