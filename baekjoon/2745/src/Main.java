/* 백준 기초 수학 - 2745 :: 진법 변환 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        
        int answer = 0;
        for(int i = 0; i < n.length(); i++) {
        	char c = n.charAt(i);
        	if('A' <= c && c <= 'Z')
        		answer = (answer * b) + ((c - 'A') + 10);
        	else
        		answer = (answer * b) + (c - '0');
        }
        
        System.out.println(answer);
    
        br.close();
	}
}