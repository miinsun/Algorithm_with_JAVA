/* 백준 스택 - 10773 :: 제로 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int k = Integer.parseInt(br.readLine());
		for(int i = 0; i < k; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if(tmp == 0) {
				stack.pop();
			}
			else {
				stack.add(tmp);
			}
		}
		
		int answer = 0;
		for(int cost : stack) {
			answer += cost;
		}
		
		System.out.println(answer);
		
		br.close();
	} 
}
