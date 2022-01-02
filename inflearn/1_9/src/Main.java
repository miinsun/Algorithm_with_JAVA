import java.util.Scanner;
  
public class Main {
	public int[] solution(String str, char ch) {
		int[] answer = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			int cr = 1000;
			if(i < str.length() - 1) {
				cr = 0;
				for(int j = i; j < str.length(); j++) {
					if(str.charAt(j) == ch)
						break;
					cr++;
				}
			}
			int cl = 1000;
			if(i > 0) {
				cl = 0;
				for(int j = i; j >= 0 ; j--) {
					if(str.charAt(j) == ch)
						break;
					cl++;
				}
			}
			
			answer[i] = Math.min(cl, cr);
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		char ch = sc.next().charAt(0);
		
		for(int n : main.solution(str, ch)) {
			System.out.print(n + " ");
		}
		
		sc.close();
		return ;
	}
}