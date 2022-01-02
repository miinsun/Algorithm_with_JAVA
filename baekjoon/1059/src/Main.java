import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int n = sc.nextInt();
		int A = 0, B = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] >= n) {
				A = arr[i - 1];
				B = arr[i];
				break;
			}
		}
		
		int cnt = 0;
		for(int i = A + 1; i <= n; i++) {
			for(int j = n; j < B; j++) {
				if(i == j)
					continue;
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
