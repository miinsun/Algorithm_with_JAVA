/* 백준 그리디 - 11399 :: ATM */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc. nextInt();
		
		// 내림차순으로 정렬
		Arrays.sort(arr);
		
		int answer = 0;
		int tmp = 0;
		for(int x : arr) {
			tmp = tmp + x;
			answer += tmp;
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
