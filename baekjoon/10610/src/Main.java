/* 백준 그리디 - 10610 :: 30 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		
		for(char c : s.toCharArray()) {
			sum += c - '0';
			list.add(c - '0');
		}

		Collections.sort(list);
		
		if(list.get(0) == 0 && sum % 3 == 0)
			for(int i = list.size() - 1; i >= 0; i--)
                System.out.print(list.get(i));
		else
			System.out.println(-1);

		sc.close();
	}
}
