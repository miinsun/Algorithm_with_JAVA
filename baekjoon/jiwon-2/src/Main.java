
/* for Jiwon - 2 */
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.print("Input : ");
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			List<Integer> arr = new ArrayList<>();

			// 입력 받기 && 보드의 최대 높이 구하기
			int height = 0;
			int len = st.countTokens();
			for (int i = 0; i < len; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				
				if (i == 0) {	// 첫 입력 처리
					if (tmp == 0) {	// 첫 입력이 0이면 종료
						return;
					}
					if (tmp != 1) {	// 시작점은 항상 1이여야하기때문에, 첫 입력 값이 1이아니면 1을 먼저 추가
						arr.add(1);
					}
				}
				arr.add(tmp);

				height = Math.max(tmp, height);
			}
			
			height += 1; // 가장 위쪽은 구름만 있기 때문에 +1로 패딩해준다.

			if (arr.get(arr.size() - 1) != 1)	// 끝점도 항상 1이기 때문에, 마지막 입력 값이 1이 아니면 1을 추가해주기
				arr.add(1);

			// 보드의 최대 넓이 구하기
			int width = arr.get(0);
			for (int i = 1; i < arr.size(); i++) {
				if (arr.get(i - 1) == arr.get(i))
					width += 1;
				else
					width += Math.abs(arr.get(i - 1) - arr.get(i));
			}

			// 보드 생성, true는 산을 false는 하늘을 의미한다
			boolean[][] board = new boolean[height][width];
			int prevPoint = 0;
			int progress = 0;
			for (int point : arr) {
				int dis = Math.abs(point - prevPoint);	// 이전 포인트와 지금 포인트 사이의 간격
				
				if (prevPoint < point) {	//오르막길일
					int cnt = dis - 1;
					for (int i = progress; i < dis + progress; i++) {
						for (int j = height - 1; j >= height - point + cnt; j--) {
							board[j][i] = true;
						}
						cnt--;
					}
				}
				else if (prevPoint > point) {	// 내리막길일때
					int cnt = 1;
					for (int i = progress; i < dis + progress; i++) {
						for (int j = height - 1; j >= height - prevPoint + cnt; j--) {
							board[j][i] = true;
						}
						cnt++;
					}
				}
				else {	// 같은 높이 일때
					for (int i = 1; i <= prevPoint; i++)
						board[height - i][progress] = true;
					progress += 1;
				}
				
				progress += dis;	// 진행도 증가
				prevPoint = point;
			}

			// 보드 출력
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (!board[i][j])
						System.out.print('\'');
					else
						System.out.print('@');

				}
				System.out.println();
			}
		}
	}
}
