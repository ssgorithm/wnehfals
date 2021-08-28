import java.util.*;
import java.io.*;

public class Solution_BOJ_13459_구슬탈출 {
	
	static int N,M;
	static int[][]board;
	static boolean[][]visit;
	static int dr[] = {0,0,-1,1};
	static int dc[] = {-1,1,0,0};
	
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		board = new int [N][M];
		
		Point red = null;
		Point blue = null;
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			for(int j=0; j<M; j++) {
				char c = s.charAt(j);
				if(c=='R') red = new Point(i,j);
				else if(c=='B') blue = new Point(i,j);
				board[i][j] = c;
			}
		}
		
		for(int d=0; d<4; d++) {
			Escape(d,red,blue,0);
		}
		System.out.println("0");
	}
	
	

	private static void Escape(int d, Point rp, Point bp, int cnt) {
		
		//10번 이상인 경우 
		if(cnt>=10) return;
		
		int rx = rp.x;
		int ry = rp.y;
		boolean flag = false;
		
		//계속 한방향으로 구슬이 굴러가므로 while 사용
		//빨간 구슬 이동 
		while(rx>=0 && rx<N && ry>=0 && ry<M) {
			rx += dr[d];
			ry += dc[d]; 
			
			if(board[rx][ry]=='O') {
				flag = true;
				break;
			}
			
			else if(board[rx][ry]=='#') {
				rx -= dr[d];
				ry -= dc[d];
				break;
			}			
		}
		
		int bx = bp.x;
		int by = bp.y;
		
		//파란 구슬 이동 
		while(bx>=0 && bx<N && by>=0 && by<M) {
			bx += dr[d];
			by += dc[d];
			
			if(board[bx][by]=='O') return;
			else if((board[bx][by]=='#')) {
				bx -= dr[d];
				by -= dc[d];
				break;
			}
		}
		
		// 빨간 구슬만 O에 들어간 경우 -> 정답 처리 
		if(flag) {
			System.out.println("1");
			System.exit(0);
		}
		
		// 두 구슬이 겹치는 경우 : 방향에 따라 구슬 위치 조정 
		if(rx==bx && ry==by) {
			switch(d) {
			case 0:
				if(rp.y>bp.y) {
					ry++;
					break;
				}
				else {
					by++;
					break;
				}
			case 1:
				if(rp.y>bp.y) {
					by--;
					break;
				}
				else {
					ry--;
					break;
				}
			case 2:
				if(rp.x>bp.x) {
					rx++;
					break;
				}
				else {
					bx++;
					break;
				}
			case 3:
				if(rp.x>bp.x) {
					bx--;
					break;
				}
				else {
					rx--;
					break;
				}
			}
		}
		
		for(int i=0; i<4; i++) {
			Escape(i,new Point(rx,ry), new Point(bx,by),cnt+1);
		}
		
	}


	public static class Point{
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
			
		}
	}

}
