import java.util.Scanner;
  
public class Main {
	public void solution(int[] arr) {
		for(int n : arr) {
			String tmp = new StringBuilder(Integer.toString(n)).reverse().toString();
			int revN = Integer.parseInt(tmp);
			
			int isSosu = 1; //1이면 소수이다
			for(int i = 2; i < revN; i++) {
				if(revN % i == 0) {
					isSosu = 0;
					break;
				}
			}
			
			if(revN != 1) {
				if(isSosu == 1)
					System.out.print(revN + " ");
			}
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