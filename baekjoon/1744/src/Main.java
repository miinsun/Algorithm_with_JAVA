/* 백준 그리디 - 11399 :: ATM */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		int minus = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] <= 0)
				minus++;
		}
		
		Arrays.sort(arr);
		
		int answer = 0;
		for(int i = 0; i < minus - 1; i += 2)
			answer += (arr[i] * arr[i + 1]);
		
		if(minus % 2 != 0)
			answer += arr[minus - 1];
		
		if((n - minus) % 2 == 1)
			answer += arr[minus];
		
		for(int i = n - 1; i > minus; i -= 2) {
			answer += Math.max(arr[i] + arr[i - 1], arr[i] * arr[i - 1]);
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
