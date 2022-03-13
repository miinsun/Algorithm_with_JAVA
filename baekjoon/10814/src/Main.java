/* 백준 정렬 - 10814 :: 나이순 정렬 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person>{
	public int age, order;
	public String name;
	
	Person(int age, int order, String name){
		this.age = age;
		this.order = order;
		this.name = name;
	}
	
	@Override
	public int compareTo(Person o) {
		if(this.age  == o.age) return this.order - o.order;
		return this.age - o.age;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Person> arr = new ArrayList<Person>();
		
		for(int i = 0; i < n; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			arr.add(new Person(age, i + 1, name));
		}
		
		Collections.sort(arr);
		
		for(Person p : arr) {
			System.out.println(p.age + " " + p.name);
		}
		
		sc.close();
	}
}
