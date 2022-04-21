/* 백준 이분탐색 - 1300 :: K번째 수 */
import java.io.*;
import java.util.*;

public class Main {		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		
		long lt = 1;
		long rt = K;
		
		while(lt < rt){
			long mid = (lt + rt) / 2;
			long cnt = 0;
			
			for(int i = 1; i <= N; i++)
				cnt += Math.min(mid / i, N);
			
			if(K <= cnt) {	// K보다 많은 수를 카운트하면, rt범위를 줄여준다.
				rt = mid;
			}
			else {	// K보다 작은수를 카운트하면, lt 범위를 줄여준다
				lt = mid + 1;
			}
		}
		
		System.out.println(lt);
		
		
		br.close();
	}
}
