import java.util.Arrays;
import java.util.Scanner;
  
public class Main {
	public static void main(String[] args){
		int index = 0, num = 100;
		String s = "Hello World";
		char c = 'y';
		
		/* Array �Լ� */
		Arrays.sort(s.toCharArray()); // �������� ����
		
		/* String �Լ� ���� */
		s = s.toLowerCase();	// �ҹ��� ��ȯ
		s = s.toUpperCase();	// �빮�� ��ȯ
		
		for(char x : s.toCharArray()) System.out.print(x); // ���ڿ� �ϳ��� ����
		c = s.charAt(index);	// ���ڿ����� index ����
		
		int len = s.length();	// ���ڿ� ���� ����
		s.split(" ");	// ���⸦ �������� split
		s.substring(0, 7); // s�� 0 ~ 7 ���� �ڸ���
		s.replace('#', '1'); // #�� 1�� ��ü
		s.contains(s);	// string ���� ���� Ȯ��
		
		
		/* Char �Լ� ���� */
		Character.isLowerCase(c);	// �ҹ��� Ȯ��
		Character.isUpperCase(c);	// �빮�� Ȯ��
		
		Character.toUpperCase(c);	// �ҹ��� ��ȯ
		Character.toLowerCase(c);	// �빮�� ��ȯ
		
		Character.isAlphabetic(c);	// ���ĺ� Ȯ��
		Character.isDigit(c);	// ���� Ȯ��
		
		/* Integer �Լ� ���� */
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		max = Integer.max(num, max); // �� ū �� ����
		min = Integer.min(num, min); // �� ���� �� ����
		
		num = Integer.parseInt(s); // String�� Int�� ��ȯ
		s = Integer.toString(num); // Int�� String���� ��ȯ
		num = Integer.parseInt(s, 2); // �������� ��ȯ

	}
}