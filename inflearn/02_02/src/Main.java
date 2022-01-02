import java.util.Scanner;
  
public class Main {
	public int solution(int[] arr) {
		int cnt = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 1; i < arr.length; i ++) {
			if(arr[i] > max) {
				max = arr[i];
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size + 1];
		
		for(int i = 1; i <= size; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(main.solution(arr));
		
		sc.close();
		return ;
	}
}