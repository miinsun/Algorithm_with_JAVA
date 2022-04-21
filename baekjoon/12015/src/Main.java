/* 백준 이분탐색 - 12015 :: 가장 긴 증가하는 부분 수열 2 */
import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		list = new ArrayList<Integer> ();
		list.add(0);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			if(list.get(list.size() - 1) < A[i]) {
				list.add(A[i]);
			}
			else {
				int target = BinarySearch(A[i]);
				list.set(target, A[i]);
			}
		}
		
		System.out.println(list.size() - 1);
		
		br.close();
	}
	
	private static int BinarySearch(int n) {
		int left = 0;
		int right = list.size() - 1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (n <= list.get(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		// 최종 mid값
		return (left + right) / 2;
	}
}
