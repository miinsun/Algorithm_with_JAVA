import java.util.Scanner;

public class Main {
	public void solution(int[] arr) {
		int[] answer = new int [arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j])
					answer[i]++;
			}
		}
		
		for(int n : answer) {
			System.out.print((n + 1) + " ");
		}
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		main.solution(arr);
		
		sc.close();
		return ;
	}
}