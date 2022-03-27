/* 백준 덱  - 10866 :: 덱 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		Deque<Integer> stack = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			switch(st.nextToken()) {
				case "push_front":{
					stack.addFirst(Integer.parseInt(st.nextToken()));
					break;
				}
				case "push_back":{
					stack.addLast(Integer.parseInt(st.nextToken()));
					break;
				}
				case "pop_front":{
					Integer tmp = stack.pollFirst();
					if(tmp == null)
						System.out.println(-1);
					else
						System.out.println(tmp);
					break;
				}
				case "pop_back":{
					Integer tmp = stack.pollLast();
					if(tmp == null)
						System.out.println(-1);
					else
						System.out.println(tmp);
					break;
				}
				case "size":{
					System.out.println(stack.size());
					break;
				}
				case "empty":{
					if(stack.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				}
				case "front":{
					Integer tmp = stack.peekFirst();
					if(tmp == null)
						System.out.println(-1);
					else
						System.out.println(tmp);
					break;
				}
				case "back":{
					Integer tmp = stack.peekLast();
					if(tmp == null)
						System.out.println(-1);
					else
						System.out.println(tmp);
					break;
				}
			}
		}
		br.close();
	}
}
