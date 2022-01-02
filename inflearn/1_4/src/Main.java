import java.util.Scanner;
  
public class Main {
	public void solution(int len, String[] strArr) {
		
		for(String s : strArr) {
			String tmp = "";
			for(int i = s.length() - 1; i >= 0; i--) {
				tmp += s.charAt(i);
			}
			System.out.println(tmp);
		}
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		int len = sc.nextInt();
		String[] strArr = new String[len];
		
		for(int i = 0; i < len; i++) {
			strArr[i] = sc.next();
		}
		
		main.solution(len, strArr);
		sc.close();
		return ;
	}
}