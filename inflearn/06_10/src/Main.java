import java.util.*;

public class Main {
	
	public boolean isOptimial(int m, int mid, int[] arr) {
		int tmp = 0;
		int cnt = 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(tmp + arr[i] > mid) {
				cnt++;
				tmp = arr[i];
			}
			else tmp += arr[i];
		}
		
		if(cnt > m)
			return false;
		else
			return true;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();

        
        while(lt <= rt){
        	int mid = (lt + rt) / 2;

            if(isOptimial(m, mid, arr)) {
            	answer = mid;
            	rt = mid - 1;
            }
            else {
            	lt = mid + 1;
            }
        }
		
		return answer;
	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, m, arr));
		
		sc.close();
		return ;
	}
}
