/* 백준 누적 합 - 11660 :: 구간 합 구하기 5 */
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N * N + 1];
        int[] sum = new int[N * N + 1];
        
        int index = 1;
        for(int i = 1; i <= N; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j = 1; j <= N; j++) {
        		arr[index] = Integer.parseInt(st.nextToken());
        		if(index == 1) {
        			sum[index] = arr[index];
        		}
        		else {
        			sum[index] = sum[index - 1] + arr[index];
        		}
        		index++;
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
        	st = new StringTokenizer(br.readLine());
        	int x1 = Integer.parseInt(st.nextToken());
        	int y1 = Integer.parseInt(st.nextToken());
        	int x2 = Integer.parseInt(st.nextToken());
        	int y2 = Integer.parseInt(st.nextToken());
        	
        	int s = N * (x1 - 1) + y1;
        	int e = N * (x2 - 1) + y2;

        	if(s == 1) {
            	sb.append(sum[e]).append('\n');
        	}
        	else {
        		sb.append(sum[e] - sum[s - 1]).append('\n');
        	}
        } 
        System.out.println(sb);
    }
}