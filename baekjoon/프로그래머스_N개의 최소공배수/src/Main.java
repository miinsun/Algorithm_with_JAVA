public class Main {
	// 최소 공배수
	public static int findLCM(int a, int b) {
		if(b == 0) {
			return a;
		}
		return (a * b) / findGCD(a, b);
	}

	// 최대 공약수
	private static int findGCD(int a, int b) {
		if(b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}
		
	public int solution(int[] arr) {
        int answer = 0;
        
        if(arr.length > 1) {
            int lcm = findLCM(arr[0], arr[1]);
        	for(int i = 2; i < arr.length; i++) {
        		lcm = findLCM(lcm, arr[i]);
        	}
        	answer = lcm;
        }
        else {
        	answer = arr[0];
        }
        
        return answer;
    }
	    
	public static void main(String[] args) {
		Main main = new Main();
		
		int[] arr = {2, 6, 8, 14};
		
  		System.out.println(main.solution(arr));
	}
}
