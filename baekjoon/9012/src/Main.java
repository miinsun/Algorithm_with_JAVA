/* 백준 스택/큐 - 9012 :: 괄호 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			Stack<Character> stack = new Stack<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();

			for(char x : s.toCharArray()) {
				if(stack.isEmpty()) stack.add(x);
				else {
					if(x == '(') stack.add('(');
					else {
						if(stack.peek() == '(') stack.pop();
						else stack.add('(');
					}
				}
			}
			
			if(stack.isEmpty()) System.out.println("YES");
			else	System.out.println("NO");
		}
		
	}
}