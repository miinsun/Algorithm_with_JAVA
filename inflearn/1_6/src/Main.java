import java.util.Scanner;
  
public class Main {
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			String ch = String.valueOf(str.charAt(i));
			if(!answer.contains(ch)) {
				answer += ch;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(main.solution(str));
		sc.close();
		return ;
	}
}