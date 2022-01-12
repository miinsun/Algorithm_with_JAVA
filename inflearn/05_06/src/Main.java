import java.util.*;

public class Main {

	public int solution(int n, int k) {
		int answer = 0;
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {
			for(int i = 0; i < k; i++) {
				if(i == k - 1)
					answer = q.poll();
				else
					q.add(q.poll());
			}
		}
		
        return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(main.solution(n,k));
		
		sc.close();
		return ;
	}
}

