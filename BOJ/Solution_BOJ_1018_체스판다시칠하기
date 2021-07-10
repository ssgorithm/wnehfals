import java.io.*;
import java.util.*;


public class Solution_BOJ_1018_체스판다시칠하기 {

	static int n,m;
	static char[][]board;
	static char[][]start_black = new char[8][8]; // 검정색으로 시작하는 체스판  
	static char[][]start_white = new char[8][8]; // 흰색으로 시작하는 체스판 
	static int ans = Integer.MAX_VALUE;
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new char[n][m];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				board[i][j] = s.charAt(j);
			}
		}
		
		// 체스판 만들기  
		for(int i=0; i<8; i++) {
			for(int j=0; j<8 ;j++) {
				if(i%2==0 && j%2==0) {
					start_black[i][j]='B';
					start_white[i][j]='W';
				}
				else if(i%2 ==1 && j%2==1) {
					start_black[i][j]='B';
					start_white[i][j]='W';
				}
				else {
					start_black[i][j]='W';
					start_white[i][j]='B';
				}
			}
		}
		
		// 체스판 비교 로직 시작 
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(i+8>n || j+8>m) continue;
				
				paintChess(i,j);
			}
		}
		System.out.println(ans);
		
	}

	// 체스판 칠하기 
	private static void paintChess(int r, int c) {
		
		int bcnt = 0;
		int wcnt = 0;
		
		for(int i= r; i<r+8; i++) {
			for(int j=c; j<c+8; j++) {
				if(board[i][j]!=start_black[i-r][j-c]) bcnt++;
				else if(board[i][j]!=start_white[i-r][j-c]) wcnt++;
			}
		}
		ans = Math.min(ans, Math.min(wcnt, bcnt));
		
	}


}
