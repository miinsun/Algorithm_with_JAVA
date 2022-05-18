import java.util.*;

public class Main {
	
	public String solution(String s) {
        String answer = "";
        
        String[] sArr = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String tmp : sArr) {
        	list.add(Integer.parseInt(tmp));
        }
        
        answer = Collections.min(list) + " ";
        answer += Collections.max(list);
        
        return answer;
    }
	    
	public static void main(String[] args) {
		Main main = new Main();
  		System.out.println(main.solution("1 2 3 4"));
	}
}
