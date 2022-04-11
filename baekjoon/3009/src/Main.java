/* 백준 기본 수학 2 - 3009 :: 네 번째 점 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int[] map1 = {sc.nextInt(), sc.nextInt()};
		int[] map2 = {sc.nextInt(), sc.nextInt()};
		int[] map3 = {sc.nextInt(), sc.nextInt()};

		
		int x = 0, y = 0;
		if(map1[0] == map2[0])
			x = map3[0];
		else if(map1[0] == map3[0])
			x = map2[0];
		else
			x = map1[0];
		
		if(map1[1] == map2[1])
			y = map3[1];
		else if(map1[1] == map3[1])
			y = map2[1];
		else
			y = map1[1];
		
		
		System.out.println(x + " " + y);
		sc.close();
	}
}
