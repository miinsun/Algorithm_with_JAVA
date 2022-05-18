import java.util.*;

public class Main {
	boolean solution(String s) {
		boolean answer = true;
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				stack.add(c);
			}
			else {
				if(!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					stack.add(c);
			}
		}
		
		answer = stack.isEmpty();
		
		return answer;
	}
	    
	public static void main(String[] args) {
		Main main = new Main();
				
  		System.out.println(main.solution("()()"));
	}
}
