/* 결혼 :: 그리디 알고리 */

import java.util.*;

class Time implements Comparable<Time>{
	public int time;
	public char state;
	
	Time(int time, char state){
		this.time = time;
		this.state = state;
	}
	
	@Override
	public int compareTo(Time o) { //object가 더 크면 음수 리턴, this가 더 크면 양수 리턴, 같은 값은 0 리턴
		if(this.time == o.time) return this.state - o.state;
		else return this.time - o.time;
	}
}

public class Main {
	
	public int solution(ArrayList<Time> arr, int n) {
		int max = Integer.MIN_VALUE;
		Collections.sort(arr);
		
		int cnt = 0;
		for(Time o : arr) {
			if(o.state == 's') cnt++;
			else cnt--;
			
			max = Math.max(max, cnt);
		}
		
		return max;
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			arr.add(new Time(x, 's'));
			arr.add(new Time(y, 'e'));
		}
		
		System.out.println(main.solution(arr, n));
		
		sc.close();
		return ;
	}
}
