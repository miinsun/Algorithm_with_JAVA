/* 백준 입출력 - 2522 :: 별찍기 - 12 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 for(int i=1;i<n;i++){
				for(int j=0;j<i;j++)
					System.out.print("*");
				for(int j=0;j<2*n-2*i;j++)
					System.out.print(" ");
				for(int j=0;j<i;j++)
					System.out.print("*");
				System.out.println();
		    }

			for(int i=n;i>0;i--){
				for(int j=0;j<i;j++)
					System.out.print("*");
				for(int j=0;j<2*n-2*i;j++)
					System.out.print(" ");
				for(int j=0;j<i;j++)
					System.out.print("*");
				System.out.println();
		    }
		
		sc.close();
	}
}
