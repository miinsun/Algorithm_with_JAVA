import java.util.*;

public class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = 0, sum = 0;
		
		for(int i = 0; i < k; i++) sum += arr[i]; //Ã¹¹øÂ° window
		answer = sum;
		for(int i = k; i < n; i++) {
			sum += arr[i] - arr[i - k];
			answer = Math.max(answer, sum);
		}
		
        return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, k, arr));
		
		sc.close();
		return ;
	}
}