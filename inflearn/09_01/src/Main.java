import java.util.*;

public class Main {
	
	public void solution(int n, int[][] arr) {
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int height = arr[i][0];
			int weight = arr[i][1];
			
			boolean flag = true;
			for(int j = 0; j < n; j++) {
				if(height < arr[j][0] && weight < arr[j][1]) {
					flag = false;
					break;
				}
			}
			
			if(flag == true)
				cnt++;
		}
		
		System.out.println(cnt);
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		main.solution(n, arr);
		
		sc.close();
		return ;
	}
}
