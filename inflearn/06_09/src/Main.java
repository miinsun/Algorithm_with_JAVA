import java.util.*;

public class Main {
	
	public int solution(int n, int key, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0, rt = n - 1;
        
        while(lt <= rt){
        	int mid = (lt + rt) / 2;
            if (arr[mid] == key){
            	answer = mid + 1;
                break;
            }
            if(arr[mid] > key) rt = mid - 1;
            else lt = mid + 1;
        }
		
		return answer;
	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int key = sc.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, key, arr));
		
		sc.close();
		return ;
	}
}