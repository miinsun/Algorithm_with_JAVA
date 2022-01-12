import java.util.*;

public class Main {
	public void solution(int n, int [] arr) {
		for(int i = 0; i < n; i++) {
			int idx = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[idx] > arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
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

