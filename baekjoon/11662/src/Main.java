/* 백준 삼분탐색 - 11662 :: 민호와 강호 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double aX1 = sc.nextDouble();
        double aY1 = sc.nextDouble();
        double aX2 = sc.nextDouble();
        double aY2 = sc.nextDouble();

        double cX1 = sc.nextDouble();
        double cY1 = sc.nextDouble();
        double cX2 = sc.nextDouble();
        double cY2 = sc.nextDouble();
		
        // 오차가 10의 -6승까지
        int interval = 1000000;
        double aDX = (aX2-aX1)/interval;
        double aDY = (aY2-aY1)/interval;
        double cDX = (cX2-cX1)/interval;
        double cDY = (cY2-cY1)/interval;
        
        //시작점의 거리
        double min = Math.sqrt(Math.pow(cX1-aX1, 2) + Math.pow(cY1-aY1, 2));
        
        for(int i = 1; i <= interval; i++) {
        	double tmp = Math.sqrt(Math.pow((cX1 + cDX * i) - (aX1 + aDX * i), 2) + Math.pow((cY1 + cDY * i) - (aY1 + aDY * i), 2));
        	min = Math.min(min, tmp);
        }
        System.out.println(String.format("%.10f", min));
        
		sc.close();
	}
}
