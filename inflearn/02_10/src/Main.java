import java.util.Scanner;

public class Main {
	public int solution(int[][] arr) {
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		int answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx >= 0 && nx < arr.length && ny >= 0 && ny < arr.length &&arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				
				if(flag) answer++;
			}
		}
		
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