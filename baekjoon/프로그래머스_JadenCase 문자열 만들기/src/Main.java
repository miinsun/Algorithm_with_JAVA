
public class Main {
	
	public String solution(String s) {
        String answer = "";
        char[] arr = s.toLowerCase().toCharArray();
        
        boolean isBlank = true;
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == ' ') {
    			answer += arr[i];
        		isBlank = true;
        	}
        	else {
        		if(isBlank) {
        			answer += Character.toUpperCase(arr[i]);
        			isBlank = false;
        		}
        		else {
        			answer += arr[i];
        		}
        	}

        }
        
        return answer;
    }
	    
	public static void main(String[] args) {
		Main main = new Main();
  		System.out.println(main.solution("3people unFollowed me"));
	}
}
