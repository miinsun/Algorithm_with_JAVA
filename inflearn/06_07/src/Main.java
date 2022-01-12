import java.util.*;

public class Main {
	public ArrayList<Integer> solution(int n, int [] arr) {	
		ArrayList<Integer> answer = new ArrayList<>();
		int[]tmp = arr.clone();
		Arrays.sort(tmp);
		for(int i = 0; i < n; i++) {
			if(arr[i] != tmp[i]) answer.add(i+1);
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
		
		for(int x : main.solution(n, arr)) System.out.print(x+" ");
		
		sc.close();
		return ;
	}
}