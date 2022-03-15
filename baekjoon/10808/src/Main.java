/* 백준 문자열 처리 - 10808 :: 알파벳 개수 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int [] answer = new int [26];
		Arrays.fill(answer, -1);

		char [] arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(answer[(int) arr[i] - 'a'] == -1) {
				answer[(int) arr[i] - 'a'] = i;
			}
		}
		
		 for(int i : answer) System.out.print(i + " "); 
		sc.close();
	}
}
