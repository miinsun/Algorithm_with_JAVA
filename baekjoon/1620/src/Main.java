/* 백준 집합과 맵 - 1620 :: 나는야 포켓몬 마스터 이다솜 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] sArr = new String [n];
		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++) {
        	String name= br.readLine();
        	sArr[i] = name;
        	nameMap.put(name, i + 1);
        }
        
        for(int i = 0; i < m; i++) {
        	String tmp = br.readLine();
        	
        	try {	// 숫자를 입력 받았을 때
        		System.out.println(sArr[Integer.parseInt(tmp) - 1]);
            } catch (NumberFormatException e) {	// 문자열을 입력 받았을 때
            		System.out.println(nameMap.get(tmp));
            }
            
        }
        
    }
}
