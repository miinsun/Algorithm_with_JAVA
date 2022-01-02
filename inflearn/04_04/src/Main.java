import java.util.*;

public class Main {

	public int solution(String a, String b) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		for(char x: b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);
		
		int L = b.length() - 1;
		for(int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		int lt =0;
		for(int rt = L; rt < a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)  + 1);
			if(am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
			if(am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
			lt++;
		}
        return answer;
	}
	
	public static void main(String[] args){
		Main main  = new Main();
		Scanner sc =new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		System.out.println(main.solution(s, t));
		
		sc.close();
		return ;
	}
}