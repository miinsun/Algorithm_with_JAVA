/* 회의실 배정 :: 그리디 알고리 */

import java.util.*;
class Time implements Comparable<Time>{
	public int s, e;
	Time(int s, int e){
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Time o) { //object가 더 크면 음수 리턴, this가 더 크면 양수 리턴, 같은 값은 0 리턴
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
}

public class Main {
	
	public int solution(ArrayList<Time> arr, int n) {
		int cnt = 0;
		
		Collections.sort(arr);
		int et = 0;
		for(Time ob : arr) {
			if(ob.s >= et) {
				cnt++;
				et=ob.e;
			}
		}
		return cnt;
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Time(x, y));
		}
		
		System.out.println(main.solution(arr, n));
		
		sc.close();
		return ;
	}
}
