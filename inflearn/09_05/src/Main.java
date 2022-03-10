/* 친구인가? :: Disjoint-Set */

import java.util.*;

class Lecture implements Comparable<Lecture>{
	public int money;
	public int time;
	
	Lecture(int money, int time){
		this.money = money;
		this.time = time;
	}
	
	@Override
	public int compareTo(Lecture o) { //object가 더 크면 음수 리턴, this가 더 크면 양수 리턴, 같은 값은 0 리턴
		return o.time - this.time; // Object에서 지금 값 빼면 내림차 순 
	} 
}

public class Main {
	static int max = Integer.MIN_VALUE, n;

	public int solution(ArrayList<Lecture> arr, int n) {
		int answer = 0;
		// PriorityQueue<Integer> pQ = new PriorityQueue<>(); 제일 작은 값을 우선순위로 정렬 
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // 제일 큰 값을 우선 순위로 정
		Collections.sort(arr);
		
		int j = 0;
		for(int i = max; i >= 1; i--) {
			for(; j < n; j++) {
				if(arr.get(j).time < i) break;
				pQ.offer(arr.get(j).money);
			}
			
			if(!pQ.isEmpty()) answer += pQ.poll(); // 가장 큰 값을 poll
		}
		
		return answer;
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			arr.add(new Lecture(m, d));
			if(d > max) max = d;
		}
		
		System.out.println(main.solution(arr, n));
		
		sc.close();
		return ;
	}
}
