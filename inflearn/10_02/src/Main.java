/* 돌다리 건너기 :: Dynamic Programming */
import java.util.*;

public class Main {
	static int [] dy;

	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		
		for(int i = 3; i <= n + 1; i++) {
			dy[i] = dy[i - 2] + dy[i - 1];
		}
		return dy[n + 1];
			
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		dy = new int[n + 2];
		
		System.out.println(main.solution(n));
		
		sc.close();
		return ;
	}
}
