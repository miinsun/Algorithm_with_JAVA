import java.util.*;

public class Main {
	//���� Ǭ�� ����, 2�� for���� �ð� ���⵵�� ���� ����
//	public int solution(int n, int m, int[] arr) {
//		int answer = 0, sum = 0;
//		
//
//		for(int i = 1; i <= n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(j + i > n)
//					break;
//				for(int k = j; k < j + i; k++) {
//					sum += arr[k];
//				}
//				System.out.println();
//				if(sum == m)
//					answer++;
//				
//				sum = 0;
//
//			}
//		}
//		
//        return answer;
//	}
	
	//��� two�����ͷ� �ð����⵵ O(n)���� �ذ�
	public int solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0; 
		int lt = 0;
		
		for(int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if(sum == m) answer++;
			
			while(sum >= m) {
				sum -= arr[lt++];
				if(sum == m) answer++;
			}
		}
		
        return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, m, arr));
		
		sc.close();
		return ;
	}
}