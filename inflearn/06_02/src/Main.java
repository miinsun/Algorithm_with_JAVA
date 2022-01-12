
import java.util.*;

public class Main {
	public void solution(int n, int [] arr) {
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n - i; j++) {
				if(arr[j - 1] > arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	
		for(int i : arr) {
			System.out.print(i + " ");
		}
		return;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		main.solution(n, arr);
		
		sc.close();
		return ;
	}
}