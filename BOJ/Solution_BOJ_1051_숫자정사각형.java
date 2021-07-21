import java.io.*;
import java.util.*;

public class Solution_BOJ_1051_숫자정사각형 {

	static int N,M;
	static int[][]board;
	static int ans = Integer.MIN_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		board = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			for(int j=0; j<M; j++) {
				board[i][j] = s.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				for(int cnt=0; cnt<Math.min(M, N); cnt++) {
					Square(i,j,cnt);
				}
			}
		}
		
		
		System.out.println(ans);
		
		
	}
	
	private static void Square(int sr, int sc, int cnt) {
		/* (sr+cnt, sc) : 좌측하단 (sr, sc+cnt): 우측상단 (sr+cnt, sc+cnt) : 우측하단 */
		if(sr+cnt<0 || sr+cnt>=N || sc+cnt<0 || sc+cnt>=M) return;
		else {
			int num = board[sr][sc];
			if((board[sr+cnt][sc]==num) && (board[sr][sc+cnt]==num) && (board[sr+cnt][sc+cnt]==num)) {
				ans = Math.max(ans, (cnt+1)*(cnt+1));
			}
					
		}
		
	}

}
