/* 백준 집합과 맵 - 11478 :: 서로 다른 부분 문자열의 개수 */

import java.io.*;

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
		HashSet<String> set = new HashSet<>();

		for(int i = 1; i <= s.length(); i++) {
			for(int j = 0; j < s.length(); j++) {
				if(j + i > s.length())
					break;
				
				set.add(s.substring(j, j + i));
			}
		}
		
 		System.out.println(set.size());
    }
}
