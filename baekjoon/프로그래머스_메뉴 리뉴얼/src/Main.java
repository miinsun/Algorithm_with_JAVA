import java.util.*;

public class Main {

	// 메뉴의 조합 구하기
	public void combi(String order, String others, int cnt, HashMap<String, Integer> map) {
		if(cnt == 0) {
			// 이미 있는 조합이면 + 1, 새로운 조합이면 1로 지정
			map.put(order, map.getOrDefault(order, 0) + 1);
			return;
		}
		else {
			for(int i = 0; i < others.length(); i++) {
				combi(order + others.charAt(i), others.substring(i + 1), cnt - 1, map);
			}
		}
	}
	
	public String[] solution(String[] orders, int[] course) {	    
	    // 단품메뉴 조합 오름차순 정렬하기
	    for(int i = 0 ; i < orders.length; i++) {
	    	char[] arr = orders[i].toCharArray();
	    	Arrays.sort(arr);
	    	orders[i] = String.valueOf(arr);
	    }
	    
	    // 정답을 저장해줄 리스트 생성
	    ArrayList<String> result = new ArrayList<>();
	    
	    for(int i : course) {
	    	HashMap <String, Integer> map = new HashMap<>();
	    	
	    	// 코스 길이별 메뉴 생성
	    	for(String order : orders) {
	    		combi("", order, i, map);
	    	}
	    	
	    	// 제일 많이 선택 된 코스 탐색
	    	Collection<Integer> orderCnt = map.values();
	    	int max = Collections.max(orderCnt);
	    	
	    	// 1번 이상 주문된 메뉴일때만 지정 가능
	    	if(max > 1) {
	    		for(String key : map.keySet()) {
	    			// 가장 많이 선택된 메뉴를 발견하면 정답리스트에 추가
		    		if(map.get(key) == max)
		    			result.add(key);
		    	}
	    	}
	    }
	    
	    // 정답리스트 정렬
	    Collections.sort(result);
	    
	    String[] answer = new String[result.size()];
	    for(int i = 0; i < answer.length; i++) {
	    	answer[i] = result.get(i);
	    }
	    
	    return answer;
	}
	    
	public static void main(String[] args) {
		Main main = new Main();
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2, 3, 4};
  		System.out.println(main.solution(orders, course));
	}
}
