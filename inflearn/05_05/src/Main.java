import java.util.*;

public class Main {

	public int solution(String s) {
		int answer = 0;
		
		s = s.replace("()", "*");
		Stack<Character> stack = new Stack<>();
		
		int lazer = 0;
		for(char c : s.toCharArray()) {
			if (c == ')') {		
				answer++;
				while(stack.peek() != '(') {
					answer++;
					if(stack.peek() == '*') {
						lazer++;
					}
					stack.pop();
				}
				stack.pop();
				
				for(int i = 0; i < lazer; i++)
					stack.push('*');
				lazer = 0;
			}
			else {
				stack.push(c);
			}
		}
        return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(main.solution(s));
		
		sc.close();
		return ;
	}
}