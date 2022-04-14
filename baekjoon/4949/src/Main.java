/* 백준 스택 - 4949 :: 균형잡힌 세상 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			Stack<Character> stack = new Stack<>();

			String s = br.readLine();
			if(s.equals("."))
				break;
			
			for(char c : s.toCharArray()) {
				// 여는 괄호이면 더해주기
				if(c == '(' || c == '[') {
					stack.add(c);
				}
				else { // 닫는 괄호면
					if(c == ')') {
						if(!stack.isEmpty() && stack.peek() == '(') {
							stack.pop();
						}
						else stack.add(c);
					}
					else if(c == ']') {
						if(!stack.isEmpty() && stack.peek() == '[') {
							stack.pop();
						}
						else stack.add(c);
					}
				}
			
			}
			
			// 스택이 비어있으면 모든 쌍을 소비한것
			if(stack.isEmpty()) 
				System.out.println("yes"); 
			else 
				System.out.println("no");
			
		}
				
		br.close();
	} 
}
