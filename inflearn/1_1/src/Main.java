import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Point{
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }   
}

class Result {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] board;
    static int[][] memo;
    static int W;
    static int H;
    
    public static void BFS(int x, int y){
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y] = '#';
        
        while(!Q.isEmpty()){
            Point tmp = Q.poll();
            for(int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                
                if(nx >= 0 && nx < W)
                    if(ny >= 0 && ny < H)
                        if(board[nx][ny] == '.'){
                        	System.out.println("nx: "+ nx + ", ny: " + ny + "size:" + Q.size());
                            board[nx][ny] = '#';
                            Q.offer(new Point(nx, ny));
                            memo[nx][ny] = memo[tmp.x][tmp.y] + 1;
                        }
            }
        }
    }
    
    public static String reachTheEnd(List<String> grid, int maxTime) {
     H = grid.size();
     W = grid.get(0).length();
     board = new char[H][W];
     memo = new int[H][W];
     
     for(int i = 0; i < grid.size(); i++){
         for(int j = 0; j < W; j++){
             board[i][j] = grid.get(i).charAt(j);
         }
     }
     
     BFS(0, 0);
     System.out.println(memo[H - 1][W - 1]);
     
     if(memo[H - 1][W - 1] == 0){
        if(H == 1 && W == 1)
            return "YES";
        return "NO";
     }
    else if(memo[H - 1][W - 1] > maxTime)
        return "NO";
    else
        return "YES";
    }
    
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gridCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, gridCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int maxTime = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.reachTheEnd(grid, maxTime);
        System.out.println(result);
    }
}