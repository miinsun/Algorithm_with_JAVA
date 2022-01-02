import java.util.Scanner;
  
public class Main {
	public String solution(String str) {
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return "NO";
			}
		}
		return "YES";
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