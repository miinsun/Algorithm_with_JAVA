/* 백준 큐, 덱 - 1021 :: 회전하는 큐 */
import java.util.*;
import java.io.*;

/*
 * 1번 연산 :: 첫 번째 원소를 뽑아낸다.
 * 2번 연산 :: 왼쪽으로 한 칸 이동시킨다.
 * 3번 연산 :: 오른쪽으로 한 칸 이동시킨다.
 */

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> q = new LinkedList<>();
		
		int N = sc.nextInt();	// 큐의 크기
		int M = sc.nextInt();	// 뽑으려는 수의 개수
		
		int[] arr = new int[M]; // 뽑으려고 하는 수의 인덱스
		for(int i = 0; i < M; i++)
			arr[i] = sc.nextInt();
		
 		for(int i = 1; i <= N; i++) {
			q.add(i);
		}
		
 		int answer = 0;
 		for(int i = 0; i < M; i++) {
 			int target = q.indexOf(arr[i]);
 			int mid;
 			
 			if(q.size() % 2 == 0) {
 				mid = (q.size() / 2) - 1;
 			}
 			else {
 				mid = q.size() / 2;
 			}
 			
 			if(target <= mid) {
 				for(int j = 0; j < target; j++) {
 					q.addLast(q.pollFirst());
 					answer++;
 				}
 			}
 			else {
 				for(int j = 0; j < q.size() - target; j++) {
 					q.offerFirst(q.pollLast());
 					answer++;
 				}
 			}
 			q.poll();

 		}
 		
 		System.out.println(answer);
		
		sc.close();
	}
}
