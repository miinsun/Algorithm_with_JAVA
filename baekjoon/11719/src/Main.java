/* 백준 입출력 - 11719 :: 그대로 출력하기 2 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(s);
		}
		
		sc.close();
	}
}
