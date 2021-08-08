import java.util.*;
import java.io.*;

public class Solution_BOJ_1941_소문난칠공주 {

	static char[][]sit = new char [5][5];
	static boolean[][] svisit;
	
	static int[]dr = {0,0,1,-1};
	static int[]dc = {-1,1,0,0};
	
	static boolean cvisit[] = new boolean[25];
	static int[] arr = new int[7];
	
	static int ans;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<5; i++) {
			String s = br.readLine();
			for(int j=0; j<5; j++) {
				sit[i][j] = s.charAt(j);
			}
		}
		Combination(0,0);
		System.out.println(ans);
	}
	public static void Combination(int start, int cnt) {
		if(cnt==7) {
			int[][]sit_temp = new int [5][5];
			int som = 0;
			int x = 0; int y = 0;
			
			for(int i=0; i<7; i++) {
				sit_temp[arr[i]/5][arr[i]%5]=1;
				
				x = arr[i]/5;
				y = arr[i]%5;
				
				if(sit[arr[i]/5][arr[i]%5]=='S')som++;
			}
			if(som>=4) {
				Princess(sit_temp,x,y,1);
				return;
			}
			
			return;
		}
		for(int i=start; i<25; i++) {
			if(cvisit[i])continue;
			cvisit[i] = true;
			arr[cnt] = i;
			Combination(i+1,cnt+1);
			cvisit[i] = false;
		
		}
		
	}
	

	private static void Princess(int[][] sit_temp, int sr, int sc, int cnt) {
		
		svisit = new boolean[5][5];
		Queue<Point>queue = new LinkedList<>();
		queue.offer(new Point(sr,sc));
		svisit[sr][sc] = true;
		
		while(!queue.isEmpty()) {
			
			Point cur = queue.poll();
			for(int d=0; d<4; d++) {
				int nr = cur.r+dr[d];
				int nc = cur.c+dc[d];
					
				if(nr<0 || nr>=5 || nc<0 || nc>=5) continue;				
				if (!svisit[nr][nc] && sit_temp[nr][nc]==1) {
					svisit[nr][nc] = true;
					queue.offer(new Point(nr,nc));
					cnt++;
				}
			}
		}
		if(cnt==7) ans++;
		
	}


	static class Point {
		int r; int c; 
		public Point(int r, int c) {
			this.r = r;
			this.c = c;
		}
		
	}
	

}
