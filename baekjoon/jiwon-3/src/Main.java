
/* for Jiwon - 3 */
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	static int[] dayData = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static char[] weekDay = { '일', '월', '화', '수', '목', '금', '토' };
	static int[][] progress = new int[13][2];
	static StringBuilder sb = new StringBuilder();

	// 달력의 월, 요일을 표시
	public static void printCalendarFrame(int startMonth) {
		sb.append('\n').append('\n');
		for (int i = startMonth; i <= startMonth + 2; i++) {
			sb.append(i + "월\t\t\t\t");
		}
		sb.append('\n');

		for (int j = 1; j <= 3; j++) {
			if (j >= 2) {
				sb.append('|');
			}
			for (char c : weekDay)
				sb.append(c + "   ");
		}
		sb.append('\n');
	}

	// 해당 년의 월이 몇요일으로 시작하는지 알려줌
	public static int get1stDayWeek(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		String YMD = year + "-" + month + "-01";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			calendar.setTime(formatter.parse(YMD));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 1:일요일, 2:월요일, 3:화요일, 4:수요일, 5:목요일, 6:금요일, 7:토요일, 8:일요일
		int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
		return dayNum;
	}

	// 해당일 부터 일주일간을 출력해줌
	public static int printOneWeek(int day, int month, int blank) {
		int process = 0;
		for (int i = day; i <= dayData[month - 1]; i++) {
			if (i < 10) {// 한 자리 수이면 앞에 공백 한 번 더 추가
				sb.append("  " + i + " ");
			}
			if (i >= 10) {
				sb.append(" " + i + " ");
			}
			
			// 한주를 모두 출력하면 중지
			if ((blank - 1 + i) % 7 == 0) {
				sb.append("    ");
				process = i + 1;
				break;
			}
		}
		
		// 해당일부터의 진척도를 리턴, 모든 날짜를 출력하면 0을 리턴
		return process;
	}

	// startMonth부터 3개의 달의 날짜를 출력
	public static void makeMonth(int startMonth, int year) {
		// firstWeek
		for (int i = startMonth; i <= startMonth + 2; i++) {
			int blank = get1stDayWeek(year, i);
			for (int j = 1; j < blank; j++) {
				sb.append("    ");
			}
			// progress[i][0]에는 진행도를 progress[i][1]에는 공백 갯수를 저장해줌
			progress[i][0] = printOneWeek(1, i, blank);
			progress[i][1] = blank;
		}
		sb.append('\n');

		// secondWeek
		for (int i = startMonth; i <= startMonth + 2; i++) {
			progress[i][0] = printOneWeek(progress[i][0], i, progress[i][1]);
		}
		sb.append('\n');

		// thirdWeek
		for (int i = startMonth; i <= startMonth + 2; i++) {
			progress[i][0] = printOneWeek(progress[i][0], i, progress[i][1]);
		}
		sb.append('\n');

		// fourthWeek
		for (int i = startMonth; i <= startMonth + 2; i++) {
			progress[i][0] = printOneWeek(progress[i][0], i, progress[i][1]);
		}
		sb.append('\n');

		// fifthWeek
		for (int i = startMonth; i <= startMonth + 2; i++) {
			progress[i][0] = printOneWeek(progress[i][0], i, progress[i][1]);
			// 모든 출력을 완료했다면, 공백 출력
			if(progress[i][0] == 0) {
				for(int j = 0; j <= 35 - (dayData[i - 1] + progress[i][1] - 1); j++) {
					sb.append("    ");
				}
			}
		}
		sb.append('\n');
		
		// sixthWeek
		for (int i = startMonth; i <= startMonth + 2; i++) {
			if(progress[i][0] == 0) {	// 이미 모든 출력을 완료했다면, 6번째 열을 모두 공백으로 채운뒤 skip
				sb.append("\t\t\t\t");
				continue;
			}
			
			if(progress[i][0] > 0) {	// 아직 출력할게 남아있을 때,6번째 행 출력
				progress[i][0] = printOneWeek(progress[i][0], i, progress[i][1]);
			}
			
			if(progress[i][0] == 0) {	// 6번째 행 출력 후, 공백이 남아있으면 공백 출력
				for(int j = 0; j <= 42 - (dayData[i - 1] + progress[i][1] - 1); j++) {
					sb.append("    ");
				}
			}
		}
	}

	// 4X3으로 3달씩 set로 출력
	public static void printCalender(int year) {
		for (int i = 1; i <= 10; i += 3) {
			// 월, 요일 출력
			printCalendarFrame(i);
			// 달력 출력
			makeMonth(i, year);
			System.out.println(sb);
			
			// StringBuilder 초기화
			sb.setLength(0);
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("년도를 입력하세요 : ");

		int year = Integer.parseInt(br.readLine());

		printCalender(year);
	}
}
