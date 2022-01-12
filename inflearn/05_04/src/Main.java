import java.util.*;

public class Main {

	public int solution(String s) {
		int answer = 0;
		Stack<String> stack = new Stack<>();
		//후위 계산식 -> 중위 계산식으로 바꾸기
		for(char c : s.toCharArray()) {
			if(!Character.isDigit(c)) {
				int tmp = 0;
				
				int rt = Integer.parseInt(stack.pop());
				int lt = Integer.parseInt(stack.pop());

				switch(c) {
				case '+':
					tmp = lt + rt;
					break;
				case '-':
					tmp = lt - rt;
					break;
				case '*':
					tmp = lt * rt;
					break;
				case '/':
					tmp = lt / rt;
					break;
				}
				stack.push(Integer.toString(tmp));
			}
			else {
				stack.push(Character.toString(c));
			}
		}
		answer = Integer.parseInt(stack.pop());
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