import java.util.*;

public class Main {
	public String solution(int n, int [] arr) {
		String answer = "U";
		
		for(int i = 0; i < arr.length; i++) {
			int search = arr[i];
			for(int j = 0; j < arr.length; j++) {
				if(i == j)
					continue;
				else {
					if(search == arr[j]) {
						return "D";
					}
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(main.solution(n, arr));
		
		sc.close();
		return ;
	}
}