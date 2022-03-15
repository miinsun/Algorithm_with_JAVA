/* 백준 정렬 - 10825 :: 국영수 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Score implements Comparable<Score>{
	public int korean, english, math;
	public String name;
	
	Score(int korean, int english, int math, String name){
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.name = name;
	}
	
	@Override
	public int compareTo(Score o) {
		if(this.korean  == o.korean) {
			if(this.english == o.english) {
				if(this.math == o.math) {
					return this.name.compareTo(o.name);
				}
				return o.math - this.math;
			}
			return this.english - o.english;
		}
		return o.korean - this.korean;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Score> arr = new ArrayList<Score>();
		
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			int korean = sc.nextInt();
			int english = sc.nextInt();
			int math = sc.nextInt();
			
			arr.add(new Score(korean, english, math, name));
		}
		
		Collections.sort(arr);
		
		for(Score p : arr) {
			System.out.println(p.name);
		}
		
		sc.close();
	}
}
