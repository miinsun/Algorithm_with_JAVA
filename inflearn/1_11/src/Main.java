import java.util.Scanner;
  
public class Main {
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			int cnt = 1;
			int next = i + 1;
			
			if(next < str.length()) {
				while(str.charAt(i) == str.charAt(next)) {
					cnt++;
					next++;
					if(next > str.length() - 1)
						break;
				}
			}
			
			if(cnt == 1) {
				answer += str.charAt(i);
			}
			else
				answer += str.charAt(i) + Integer.toString(cnt);
			
			i = i + cnt - 1;
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