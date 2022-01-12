import java.util.*;

public class Main {

	public String solution(String s, String order) {
		String answer = "NO";
		Queue<Character> q = new LinkedList<>();

		//큐 초기화
		for(char c : order.toCharArray()) {
			q.add(c);
		}
		
		for(char c: s.toCharArray()) {
			if(q.isEmpty()) {
				answer = "YES";		
				break;
			}
			
			if(q.peek() == c) {
				q.poll();
			}
		}
		
        return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		
		String order = sc.next();
		String s = sc.next();
		
		System.out.println(main.solution(s, order));
		
		sc.close();
		return ;
	}
}