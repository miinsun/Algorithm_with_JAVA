/* 백준 문자열 처리 - 10820 :: 문자열 분 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String s = sc.nextLine();
			int sm = 0, bg = 0, i = 0, n = 0; // 순서별로 소문자, 대문자, 숫자, 공백을 저장한다.
			
			for(char c : s.toCharArray()) {
				if(c == ' ') n++;
				else if (Character.isDigit(c)) i++;
				else {
					if(Character.isUpperCase(c)) bg++;
					else sm++;
				}
			}
			
			System.out.println(sm + " " + bg + " " + i + " "+ n);
		}
		
		sc.close();
	}
}
