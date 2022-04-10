/* 백준 분할정복 - 1517 :: 버블 소트 */
import java.io.*;
import java.util.*;

public class Main {	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		int n = Integer.parseInt(br.readLine());
		
		long[] arr = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		long answer = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					long tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		br.close();
	}
}
