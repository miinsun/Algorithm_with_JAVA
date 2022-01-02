import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testNum = sc.nextInt();
		
		for(int i = 0; i < testNum; i++) {
			int len = sc.nextInt();
			int[] student = new int[len];
			
			for(int j = 0; j < student.length; j++) {
				student[i] = sc.nextInt();
			}
			
			System.out.println(easyNum(student));
		}
		
		sc.close();
	}
	
	public static int easyNum(int[] student) {
		String list = "";
		int cnt = 0;
		for(int i = 1; i <= 300; i++) {
			for(int j = 0; j < student.length; j++) {
				double num = student[j] % i;
				
				if(list.contains(Double.toString(num))){
					list = "";
					cnt = 0;
					break;
				}
				else {
					list += " " + num;
					cnt++;
					System.out.println("i(" + i + ")"+ list);
				}
				
				if(cnt == student.length)
					return i;
			}
		}
		
		return -1;
		
	}
}
