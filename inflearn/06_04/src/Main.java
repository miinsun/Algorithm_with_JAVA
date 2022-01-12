import java.util.*;

public class Main {
	public void solution(int s, int n, int [] arr) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i : arr) {
			if(stack.contains(i)) {
				stack.removeElement(i);
			}
			stack.add(i);
			
			if(stack.size() > s) {
				stack.removeElementAt(0);
			}
		}
		
		for(int i = stack.size() - 1; i >= 0; i-- ) {
			System.out.print(stack.elementAt(i) + " ");
		}
		
		return;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		main.solution(s, n, arr);
		
		sc.close();
		return ;
	}
}