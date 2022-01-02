import java.util.Scanner;
  
public class Main {
	public void solution(int[] arr) {
		for(int i = 1; i < arr.length; i ++) {
			if(arr[i] > arr[i - 1])
				System.out.print(arr[i] + " ");
			
		}
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size + 1];
		
		for(int i = 1; i <= size; i++)
			arr[i] = sc.nextInt();
		
		main.solution(arr);
		
		sc.close();
		return ;
	}
}