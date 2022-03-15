/* 백준 정렬 - 11652 :: 카드 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap <Long, Integer> map = new HashMap<>();
		
		// HashMap에 카드 정보 저장
		for(int i = 0; i < n; i++) {
			long tmp = sc.nextLong();
			// 이미 있는 카드 값이 들어오면 원래 값에서 + 1
			map.put(tmp, map.getOrDefault(tmp, 0) + 1);
		}
		
		// HashMap에서 가장 큰 값을 가진 Index 리턴 
		int max = Integer.MIN_VALUE;
		long  answer = 0;
		for(long x: map.keySet()) {
			if(map.get(x) > max) {
				max = map.get(x);
				answer = x;
			} else if(map.get(x) == max) {
				answer = Math.min(answer, x);
			}	
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
