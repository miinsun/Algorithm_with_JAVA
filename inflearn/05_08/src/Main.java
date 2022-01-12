import java.util.*;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Main {
	public int solution(int n, int m, int [] arr) {
		int answer = 1;
		Queue<Person> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			q.offer(new Person(i, arr[i]));
		}
		
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person x : q) {
				if(x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}	
			}
			
			if(tmp != null) {
				if(tmp.id == m) return answer;
				else answer++;
			}
		}
        return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, m, arr));
		
		sc.close();
		return ;
	}
}