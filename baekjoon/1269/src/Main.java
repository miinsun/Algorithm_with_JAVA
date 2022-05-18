/* 백준 집합과 맵 - 1269 :: 대칭 차집합 */

import java.io.*;

import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
		HashSet<Integer> set = new HashSet<>();

		// 그룹 A 입력
		st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	set.add(Integer.parseInt(st.nextToken()));
        }
        
        // 그룹 B 입력
 		st = new StringTokenizer(br.readLine());
 		for(int i = 0; i < m; i++) {
 			int tmp = Integer.parseInt(st.nextToken());
 			if(set.contains(tmp))
 				set.remove(tmp);
 			else
 				set.add(tmp);
 		}
 		
 		System.out.println(set.size());
    }
}
