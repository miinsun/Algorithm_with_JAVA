import java.util.*;

public class Main {
	
	public int solution(int n) {
        int answer = 0;
        
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        
        for(int i = 2; i <= n; i++) {
        	memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
        }
        
        answer = memo[n] % 1234567;
        return answer;
    }
	    
	public static void main(String[] args) {
		Main main = new Main();
  		System.out.println(main.solution(5));
	}
}
