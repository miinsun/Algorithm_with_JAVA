import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testNum = sc.nextInt();
		for(int i = 0; i < testNum; i++) {
			int[] student = new int[sc.nextInt()];
			
			double sum = 0;
			for(int j = 0; j < student.length; j++) {
				int score = sc.nextInt();
				student[j] = score;
				sum += score;
			}
			
			double m = sum / student.length;
			double cnt = 0;
			for(int j = 0; j < student.length; j++) {
				if(student[j] > m)
					cnt++;
			}
			
			System.out.printf("%.3f%%\n",(cnt / student.length) * 100);
		}
		
		sc.close();
	}
}
