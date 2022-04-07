/* 백준 그래프 - 10816 :: 숫자 카드 2 _ 메모이제이션 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cnt = new int[20_000_001];
        
        for(int i = 0; i < n; i++) {
            cnt[Integer.parseInt(st.nextToken()) + 10_000_000]++;
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < m; i++) {
            sb.append(cnt[Integer.parseInt(st.nextToken()) + 10_000_000] + " ");
        }
        
        System.out.println(sb);
    }
}
