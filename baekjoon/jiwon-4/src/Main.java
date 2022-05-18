/* for Jiwon - 4 */
import java.io.*;
import java.util.*;

class Member{
	private String name;
	private int age;
	private int salary;
	
	Member(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object object) {
		Member member = (Member) object;
		if(member.name.equals(this.name) && member.age == this.age) {
			return true;
		}
		return false;
	}
}

public class Main {
	static ArrayList<Member> arr = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	static Scanner sc;

	public static void printCMD() {
		sb = new StringBuilder();
		sb.append('\n');
		sb.append("=======================================================================").append('\n');
		sb.append("1. Load   2.Insert   3.Delete   4.Update   5.Sort   6.Save").append('\n');
		sb.append("=======================================================================").append('\n');
		System.out.println(sb);
	}
	
	// 명령어 입력받기
	public static boolean inputCMD() {	
		sc = new Scanner(System.in);
		System.out.print("Select Method: ");
		int method = sc.nextInt();
		
		switch(method) {
			case 1:{	// Load
				loadMember();
				break;
			}
			case 2:{	// Insert
				insertMember(arr);
				break;
			}
			case 3:{	// Delete
				deleteMember(arr);
				break;
			}
			case 4:{	// Update
				updateMember(arr);
				break;
			}
			case 5:{	// Sort
				sortMember(arr);
				break;
			}
			case 6:{	// Save
				saveMember(arr);
				sc.close();
				return false;	// 프로그램 종료
			}
		}
		return true;
	}
	
	// 배열에 있는 멤버 출력
	public static void printMember(ArrayList<Member> arr) {
		sb = new StringBuilder();
		for(Member member : arr) {
			sb.append(member.getName() + " / ");
			sb.append(member.getAge() + " / ");
			sb.append(member.getSalary()).append('\n');
		}
		
		System.out.println(sb);
	}
	
	// Salary.txt에 배열 저장
	public static void saveMember(ArrayList<Member> arr) {
		try {
		    FileWriter fw = new FileWriter("Salaries.txt");
			sb = new StringBuilder();
			
			for(Member member : arr) {
				sb.append(member.getName() + ",");
				sb.append(member.getAge() + ",");
				sb.append(member.getSalary()).append('\n');
			}
			fw.write(sb.toString());
			fw.close();
			System.out.println("Save success");
			System.out.println("Program terminate");
		} catch (Exception e) {
	            e.getStackTrace();
		}
	}
	
	// 멤버 삽입
	public static void insertMember(ArrayList<Member> arr) {
		System.out.print("이름 입력 : ");
		String EName = sc.next();
		System.out.print("나이 입력 : ");
		int EAge = sc.nextInt();
		
		// 이미 같은 값이 있으면
		if(arr.contains(new Member(EName, EAge)))
			System.out.println("Already exist");
		else {	// 새로운 값이 들어오면
			System.out.print("연봉 입력 : ");
			int ESalary = sc.nextInt();
			arr.add(new Member(EName, EAge, ESalary));
			
			// 배열 출력
			printMember(arr);
			
		}
	}
	
	// 멤버 갱신
	public static void updateMember(ArrayList<Member> arr) {
		System.out.print("이름 입력 : ");
		String EName = sc.next();
		System.out.print("나이 입력 : ");
		int EAge = sc.nextInt();
		Member member = new Member(EName, EAge);
		
		if(arr.contains(member)) {	// 해당 값이 있을 때만 수정 가능
			System.out.print("새로운 연봉 입력 : ");
			int ESalary = sc.nextInt();
			member.setSalary(ESalary);
			
			int index = arr.indexOf(member);
			arr.set(index, member);

			printMember(arr);	// 배열 출력
		}
		else {	// 없는 값은 수정 불가능
			System.out.print("Not exist");
		}
	}
	
	// 멤버 정렬
	public static void sortMember(ArrayList<Member> arr) {
		System.out.print("1.Name 2.Salary : ");
		int orderBy = sc.nextInt();
		
		if(orderBy == 1) {	// Name 내림차순
		    Collections.sort(arr, (o1, o2) -> {
		    	if(o1.getName().equals(o2.getName())){	//	이름이 같으면 연봉 내림차순 
					return o2.getSalary() - o1.getSalary();
				}
				else {
					return o2.getName().compareTo(o1.getName());
				}
		    });
		}
		else {	// Salary 오름차순
			Collections.sort(arr, (o1, o2) -> {
				if(o1.getSalary() == o2.getSalary()){	// 연봉이 같으면 이름 오름차순
					return o1.getName().compareTo(o2.getName());
				}
				else {
					return o1.getSalary() - o2.getSalary();
				}
		    });
		}
		
		printMember(arr);	// 배열 출력
	}
	
	// 멤버 삭제
	public static void deleteMember(ArrayList<Member> arr) {
		System.out.print("이름 입력 : ");
		String EName = sc.next();
		System.out.print("나이 입력 : ");
		int EAge = sc.nextInt();
		Member member = new Member(EName, EAge);

		// 해당 값이 있을 때만 삭제 가능
		if(arr.contains(new Member(EName, EAge))) {
			int index = arr.indexOf(member);
			arr.remove(index);

			printMember(arr);	// 배열 출력
		}
		else {	// 없는 값은 삭제 불가능
			System.out.print("Not exist");
		}
	}
	
	// Salary.txt 파일 로딩
	public static void loadMember() {
		File file = new File("Salaries.txt");
		
		try {
			sc= new Scanner(file);
			while(sc.hasNext()) {
				StringTokenizer st = new StringTokenizer(sc.next(), ",");
				
				String EName = st.nextToken();
				int EAge = Integer.parseInt(st.nextToken());
				int ESalary = Integer.parseInt(st.nextToken());

				arr.add(new Member(EName, EAge, ESalary));
			}
			System.out.println("Load success");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not exist");
		}
	}
	
	public static void main(String[] args) throws IOException {
		boolean keepGoing = true;
		
		while(keepGoing) {
			printCMD();
			keepGoing = inputCMD();
		}
	}
}
