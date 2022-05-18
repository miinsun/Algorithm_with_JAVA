import java.util.*;

public class Main {
	static public int getWeightOnBridge(Queue<Integer> q){
        int size = q.size();
        int weight = 0;
        
        for(int i = 0; i < size; i++){
            weight += q.peek();
            q.add(q.poll());
        }
        
        return weight;
    }
    
    static public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        // q에 현재 다리에 있는 트럭의 무게를 올린다.
        Queue<Integer> q = new LinkedList<>();
        
        // 첫번째 트럭 출발
        int num = 0;    // 트럭의 번호

        while(num < truck_weights.length){
        	if(q.isEmpty()) {
        		q.add(truck_weights[num++]);
        	}
        	else if(getWeightOnBridge(q) + truck_weights[num] <= weight && 
               q.size() <= bridge_length){ // 무게를 초과하지 않고, 사이즈를 넘기지 않을 때
                q.add(truck_weights[num++]);
            }else {
                q.poll();

            }
            answer++;
        }
        
        //마지막 트럭 처리
        answer++;
        
        return answer;
    }
	    
	public static void main(String[] args) {
		int bridge_length	= 100;
		int weight	=100;
		int[] truck_weights = {10};
 		System.out.println(solution(bridge_length, weight, truck_weights));
	}
}
