/* 백준 브루트 포스 - 1436 :: 영화감독 숌 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		int i = 666;
		while(true) {
			// 666을 포함하고 있으면 cnt 증가
			String s = Integer.toString(i);
			if(s.contains("666"))
				cnt++;
			
			// cnt와 n이 같아지면 종료
			if(cnt == n)
				break;
			
			i++;
		}
		
		System.out.println(i);
		
		sc.close();
	}
}
