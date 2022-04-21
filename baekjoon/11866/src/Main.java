/* 백준 스택 - 17298 :: 오큰수 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// 수열의 크기
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
				arr[s.pop()] = arr[i];
			}
				
			s.add(i);
		}
		
		while(!s.isEmpty())
			arr[s.pop()] = -1;
		
		for(int i : arr)
			sb.append(i).append(' ');
		
		
		System.out.println(sb);
		
		br.close();
	}
}
