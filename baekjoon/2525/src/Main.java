/* 백준 조건문 - 2525 :: 오븐 시계 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		if(C >= 60) {
			H += C / 60;
			M += C % 60;
		}
		else{
			M += C;
		}
		
		if(M >= 60) {
			H += (M / 60);
			M = M % 60;
		}
		
		if (H >= 24){
			H %= 24;
		}
		
		System.out.println(H + " " + M);
	}
}