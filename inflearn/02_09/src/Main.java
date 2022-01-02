import java.util.Scanner;

public class Main {
	public int solution(int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		
		for(int i = 0; i < arr.length; i++) {
			sum1 = sum2 = 0;
			for(int j = 0; j < arr.length; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1 = sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][arr.length - i - 1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(main.solution(arr));
		
		sc.close();
		return ;
	}
}