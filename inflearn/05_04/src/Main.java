import java.util.*;

public class Main {

	public int solution(String s) {
		int answer = 0;
		Stack<String> stack = new Stack<>();
		String midform = "";
		boolean isfirst = true;
		//후위 계산식 -> 중위 계산식으로 바꾸기
		for(char c : s.toCharArray()) {
			if(!Character.isDigit(c)) {
				if(isfirst) {
					answer = Integer.parseInt(stack.pop());
					isfirst = false;
				}
				
				switch(c) {
				case '+':
					answer += Integer.parseInt(stack.pop());
					break;
				case '-':
					answer -= Integer.parseInt(stack.pop());
					break;
				case '*':
					answer *= Integer.parseInt(stack.pop());
					break;
				case '/':
					answer /= Integer.parseInt(stack.pop());
					break;
				}
			}
			else {
				stack.push(Character.toString(c));
			}
			System.out.println(stack.toString());
			System.out.println("Answer is " + answer);

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