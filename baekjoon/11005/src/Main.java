/* 백준 기초 수학 - 11005 :: 진법 변환 2 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = scan.nextInt();
        List<Character> list = new ArrayList<>();
        while(n>0) {
            if(n%b<10)
                list.add((char)(n%b+'0'));
            else
                list.add((char)(n%b-10+'A'));
            n/=b;
        }
        for(int i=list.size()-1; i>=0; i--)
            System.out.print(list.get(i));
        
        scan.close();
    }
}