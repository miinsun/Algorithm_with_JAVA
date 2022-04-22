/* 백준 누적 합 - 2559 :: 수열 */
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N + 1];
        int[] sum = new int[N + 1];
    	st = new StringTokenizer(br.readLine());
    	
    	// 1부터 n까지 누적합 구하기
        for(int i = 1; i <= N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	if(i == 1)
        		sum[i] = arr[i];
        	else
        		sum[i] = sum[i - 1] + arr[i];
        }
        
        int max = Integer.MIN_VALUE;
        // 1~K 까지의 합은 sum[K] - sum[0];
        // 2~K+1 까지의 합은 sum[K + 1] - sum[1];
        for(int i = K; i <= N; i++) {
        	max = Math.max(max, sum[i] - sum[i - K]);
        }        
        
        System.out.println(max);
    }
}