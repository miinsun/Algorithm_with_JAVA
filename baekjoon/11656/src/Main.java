/* 백준 문자열 처리 - 11656 :: 접미사 배열 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = new String[s.length()];
		
		for(int i = 0; i < arr.length; i++) 
			arr[i] = s.substring(i);
		
		Arrays.sort(arr);
		for(String tmp : arr)
			System.out.println(tmp);
		
		sc.close();
	}
}
