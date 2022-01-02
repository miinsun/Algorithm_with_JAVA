import java.util.Scanner;
  
public class Main {
	public String solution(int n ,String str) {
		String answer = "";
		
		for(int i = 0; i < n ; i ++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char) num;
			str =  str.substring(7); // 7부터 제일 뒤까지 자르기
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(main.solution(n, str));
		sc.close();
		return ;
	}
}