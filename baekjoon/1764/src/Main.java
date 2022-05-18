/* 백준 집합과 맵 - 1764 :: 듣보잡 */

import java.io.*;

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
		HashSet<String> set = new HashSet<>();

		// 듣지 못해본 사람
        for(int i = 0; i < n; i++) {
        	String name= br.readLine();
        	set.add(name);
        }
        
        // 보지 못해본 사람
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < m; i++) {
        	String name= br.readLine();
        	
        	if(set.contains(name)) {
        		result.add(name);
        	}
        }
        
        Collections.sort(result);
        
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
