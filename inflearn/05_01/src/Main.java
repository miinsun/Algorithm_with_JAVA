import java.util.*;

public class Main {

	public String solution(String s) {
		String answer = "NO";
	
		Stack<String> st = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == ')') {
				if(st.contains("("))
					st.pop();
				else
					st.push(")");
			}
			else {
				st.push("(");
			}
		}
		
		if(st.isEmpty())
			answer = "YES";
		
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