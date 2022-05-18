import java.util.*;
public class Main {
	
	public int solution(int []A, int []B)
	{
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i = 0; i < A.length; i++) {
			answer += (A[i] * B[B.length - 1 - i]);
		}
		return answer;
    }
	    
	public static void main(String[] args) {
		Main main = new Main();
		
		int[] A = {1, 4, 2};
		int[] B = {5, 4, 4};
		
  		System.out.println(main.solution(A, B));
	}
}
