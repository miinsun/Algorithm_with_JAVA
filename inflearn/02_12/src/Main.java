import java.util.Scanner;

public class Main {
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < 5; j++) {
				for(int k = 0; k < 5; k++) {
					
					if(j == k)
						continue;
					else {
						if(arr[j][i] == arr[k][i]) {
							answerArr[j]++;
							
						}
					}
				}
			}
		}
		
		int maxIndex = -1;
		int max = -1;
		for(int i = 0; i < answerArr.length; i++) {
			if(answerArr[i] > max) {
				max = answerArr[i];
				maxIndex = i;
			}
				
		}
		return maxIndex + 1;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(main.solution(n , m, arr));
		
		sc.close();
		return ;
	}
}