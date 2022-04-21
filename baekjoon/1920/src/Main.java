/* 백준 이분탐색 - 1920 :: 수 찾기 */
import java.io.*;
import java.util.*;

public class Main {	
	static int[] arr1;

	public static boolean isIn(int target) {
		// lt, rt 초기화
		int lt = 0;
		int rt = arr1.length - 1;
		
		// lt, rt가 같아지면 종료
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(arr1[mid] == target)
				return true;
			
			if(arr1[mid] < target) {	// 찾아야할 값이 mid값보다 크면, lt를 증가한다.
				lt = mid + 1;
			}
			else {
				rt = mid - 1;	// 찾아야할 값이 mid값보다 작으면, rt를 감소한다
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 배열 입력
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr1 = new int[n];
		for(int i = 0; i < n; i++)
			arr1[i] = Integer.parseInt(st.nextToken());
		
		// 배열 정렬
		Arrays.sort(arr1);
		
		int m = Integer.parseInt(br.readLine());	
		st = new StringTokenizer(br.readLine());
		// 입력 값 찾기
		for(int i = 0; i < m; i++) {
			if(isIn(Integer.parseInt(st.nextToken())))	// 입력 값이 배열에 있으면
				sb.append(1).append('\n');
			else	// 없으면
				sb.append(0).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
