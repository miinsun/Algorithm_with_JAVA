/* 백준 그리디 - 1931 :: 회의실 배정 */
import java.util.*;

class Time implements Comparable<Time>{
	int start;
	int end;
	
	Time(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	public int compareTo(Time o) {
		if(this.end == o.end) {
			return this.start - o.start;
		}
		return this.end - o.end;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Time> list = new ArrayList<>();
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
			list.add(new Time(sc.nextInt(), sc.nextInt()));
		
		Collections.sort(list);
		
		Time t = list.get(0);
		int answer = 1;
		for(int i = 1; i < n; i++) {
			if(t.end <= list.get(i).start) {
				answer++;
				t = list.get(i);
			}
		}
		System.out.println(answer);
		
		sc.close();
	}
}
