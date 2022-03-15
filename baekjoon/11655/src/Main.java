/* 백준 문자열 처리 - 11655 :: ROT13 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		for(char c : s.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				int tmp = 0;
				if(Character.isUpperCase(c)) {
					if(c + 13 > 'Z')	{
						tmp = (12 - ('Z' - c)) + 'A';
						System.out.print((char) tmp);
					}
					else
						System.out.print((char)(c + 13));
				}
				else if(Character.isLowerCase(c)) {
					if(c + 13 > 'z')	{
						tmp = (12 - ('z' - c)) + 'a';
						System.out.print((char)tmp);
					}
					else
						System.out.print((char) (c + 13));
				}
				
			}
			else
				System.out.print(c);
		}
		sc.close();
	}
}
