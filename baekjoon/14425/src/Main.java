/* 백준 집합과 맵 - 14425 :: 문자열 집합  */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] sArr = new String [n];
        for(int i = 0; i < n; i++) {
        	sArr[i] = br.readLine();
        }
        
        int answer = 0;
        for(int i = 0; i < m; i++) {
        	String tmp = br.readLine();
        	
        	for(String s : sArr) {
        		if(s.equals(tmp))
        			answer++;
        	}
        }
        
        System.out.println(answer);
    }
}
