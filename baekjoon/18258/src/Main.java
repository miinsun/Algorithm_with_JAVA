
/* 백준 자료구조 - 18258 :: 큐 2 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> queue = new LinkedList<>();

		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			switch (command) {
			case "push": {
				int input = Integer.parseInt(st.nextToken());
				queue.add(input);
				break;
			}
			case "pop": {
				if (!queue.isEmpty())
					sb.append(queue.poll()).append('\n');
				else
					sb.append(-1).append('\n');
				break;
			}
			case "size": {
				sb.append(queue.size()).append('\n');
				break;
			}
			case "empty": {
				if (!queue.isEmpty())
					sb.append(0).append('\n');
				else
					sb.append(1).append('\n');
				break;
			}
			case "front": {
				if (!queue.isEmpty())
					sb.append(queue.peekFirst()).append('\n');

				else
					sb.append(-1).append('\n');
				break;
			}
			case "back": {
				if (!queue.isEmpty())
					sb.append(queue.peekLast()).append('\n');
				else
					sb.append(-1).append('\n');
				break;
			}

			}
		}
		System.out.println(sb);

		br.close();
	}
}
