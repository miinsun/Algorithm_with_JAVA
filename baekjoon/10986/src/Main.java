/* 백준 누적 합 - 10986 :: 나머지 합 */
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());	// A의 개수
        int M = Integer.parseInt(st.nextToken());	// 나눠지는 수
        int[] arr = new int[N + 1];
        int[] sum = new int[N + 1];
       
        // 배열 정보 입력
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	
        	sum[i] = sum[i - 1] + arr[i];
        }
        
        int answer = 0;
        for(int i = 1; i <= N; i++) {	// 연속된 수 1개부터 N개까지
        	for(int j = i; j <= N; j++) {
        		if((sum[j] - sum[j - i]) % M == 0)
        			answer++;
        	}
        }
        
        System.out.println(answer);
    }
}