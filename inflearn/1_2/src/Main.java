import java.util.Scanner;
  
public class Main {
	public int solution(String str, char c) {
		int answer = 0;
		str = str.toLowerCase();
		c = Character.toLowerCase(c);
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c)
				answer++;
		}
		return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(main.solution(str, c));
		sc.close();
		return ;
	}
}