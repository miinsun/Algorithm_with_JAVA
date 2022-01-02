import java.util.Scanner;
  
public class Main {
	public int solution(String str) {
		int answer = 0;
		
		String tmp = "";
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c))
				tmp += c;
		}
		answer = Integer.parseInt(tmp);
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