
public class Main {
	
	 public int solution(int n) {
	        int answer = 0;
	        
	        int sum = 0;
	        int i = 1, j = 1;
	        
	        while(i <= n || j <= n) {
	        	if(sum <= n) {
	        		sum += i++;
	        	}
	        	else if (sum > n){
	        		sum -= j++;
	        	}	        
	        	
	        	if(sum == n)
        			answer++;
	        }
	        
	        return answer;
	    }
	    
	public static void main(String[] args) {
		Main main = new Main();
  		System.out.println(main.solution(15));
	}
}
