import java.util.*;

public class Main {

	public String solution(String s) {
		String answer = "";
	
		Stack<String> st = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == ')') {
				if(st.contains("(")) {
					while(!st.lastElement().equals("(")) {
						st.pop();
					}
					st.pop();
					
				}
				else
					st.push(")");
				
			}
			else {
				st.push(Character.toString(c));
			}
			
			System.out.println(st.toString());
		}
		
		for(int i = 0; i < st.size(); i++) {
			answer += st.get(i);
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