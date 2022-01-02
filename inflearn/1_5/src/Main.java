import java.util.Scanner;
  
public class Main {
	public String solution(String str) {
		char[] chArr = str.toCharArray();
		
		int lt = 0;
		int rt = str.length() - 1;
		while(lt < rt) {
			if(!Character.isAlphabetic(chArr[lt])) {
				lt++;
			}
			else if(!Character.isAlphabetic(chArr[rt])) {
				rt--;
			}
			else{
				char tmp = chArr[lt];
				chArr[lt] = chArr[rt];
				chArr[rt] = tmp;
				
				lt++;
				rt--;
			}
		}
		
		return String.valueOf(chArr);
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