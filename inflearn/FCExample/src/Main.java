import java.util.Arrays;
import java.util.Scanner;
  
public class Main {
	public static void main(String[] args){
		int index = 0, num = 100;
		String s = "Hello World";
		char c = 'y';
		
		/* Array 함수 */
		Arrays.sort(s.toCharArray()); // 오름차순 정렬
		
		/* String 함수 정리 */
		s = s.toLowerCase();	// 소문자 변환
		s = s.toUpperCase();	// 대문자 변환
		
		for(char x : s.toCharArray()) System.out.print(x); // 문자열 하나씩 적용
		c = s.charAt(index);	// 문자열에서 index 지정
		
		int len = s.length();	// 문자열 길이 리턴
		s.split(" ");	// 띄어쓰기를 기준으로 split
		s.substring(0, 7); // s를 0 ~ 7 까지 자르기
		s.replace('#', '1'); // #을 1로 대체
		s.contains(s);	// string 포함 유무 확인
		
		
		/* Char 함수 정리 */
		Character.isLowerCase(c);	// 소문자 확인
		Character.isUpperCase(c);	// 대문자 확인
		
		Character.toUpperCase(c);	// 소문자 변환
		Character.toLowerCase(c);	// 대문자 변환
		
		Character.isAlphabetic(c);	// 알파벳 확인
		Character.isDigit(c);	// 숫자 확인
		
		/* Integer 함수 정리 */
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		max = Integer.max(num, max); // 더 큰 수 저장
		min = Integer.min(num, min); // 더 작은 수 저장
		
		num = Integer.parseInt(s); // String을 Int로 변환
		s = Integer.toString(num); // Int를 String으로 변환
		num = Integer.parseInt(s, 2); // 이진수로 변환

	}
}