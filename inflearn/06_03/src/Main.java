import java.util.*;

public class Main {
	public void solution(int n, int [] arr) {
		int i, j = 0;
		for(i = 1; i < n; i++) {
			int tmp = arr[i];
			for(j = i - 1; j >= 0; j--) {
				if(arr[j] > tmp) {
					arr[j + 1] = arr[j];
				}
				else break;
			}
			arr[j + 1] = tmp;
		}
	
		for(int num : arr) {
			System.out.print(num + " ");
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