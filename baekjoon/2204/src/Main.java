import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		while(size != 0) {
			ArrayList<String> arr = new ArrayList<String>();
			String[] tmp = new String[size];
			for(int i = 0; i < size; i++) {
				arr.add(sc.next());
				tmp[i] = arr.get(i).toLowerCase();
			}
			
			Arrays.sort(tmp);

			for(int i = 0; i < arr.size(); i++) {
				if(arr.get(i).toLowerCase().equals(tmp[0])) {
					System.out.println(arr.get(i));
				}
			}
			
			size = sc.nextInt();
		}
		sc.close();
	}
}
