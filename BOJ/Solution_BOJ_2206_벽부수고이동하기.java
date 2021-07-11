import java.io.*;
import java.util.*;

public class Solution_BOJ_2206_벽부수고이동하기 {

	
	static int n,m;
	static int[][]map;
	static boolean[][][]visit;
	
	static int[]dr = {0,0,-1,1};
	static int[]dc = {-1,1,0,0};
	
	static LinkedList<Point>queue = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int [n+1][m+1];
		visit = new boolean[n+1][m+1][2];
		
		
		for(int i=1;i<=n;i++) {
			String s = br.readLine();
			for(int j=1;j<=m;j++) {
				map[i][j] = s.charAt(j-1)-'0';
			}
		}
		
		move(1,1);
		
	}
	
	
	private static void move(int r, int c) {

		queue.push(new Point(r,c,0,1));
		visit[r][c][0]=true;
		visit[r][c][1]=true;
		
		
		while(!queue.isEmpty()) {
			Point cur = queue.poll();
			
			if(cur.x==n && cur.y==m) {
				System.out.println(cur.distance);
				return;
			}
			
			for(int d = 0; d<4; d++) {
				int nr = cur.x+dr[d];
				int nc = cur.y+dc[d];
				
				if(!check(nr,nc))continue;
				
				
				
				// 벽인 경우 - 벽을 부순 횟수 & 이미 부셔진 벽인지를 체크해준다 
				if(map[nr][nc]==1) {
					if(cur.wall==0 && !visit[nr][nc][1]) {
						visit[nr][nc][1]=true;
						queue.add(new Point(nr,nc, 1,cur.distance+1));
					}
				}
				
				// 벽이 아닌 경우 - 방문한 좌표인지만 체크 
				else {
					if(!visit[nr][nc][cur.wall]) {
						queue.add(new Point(nr,nc,cur.wall,cur.distance+1));
						visit[nr][nc][cur.wall]=true;
					}
					
				}
			}
		}
		
		System.out.println(-1);
		
		
		
		
	}


	private static boolean check(int r, int c) {
		if(r <= 0 || c <= 0 || r > n || c > m) return false;
		return true;
	}


	
	public static class Point{
		int x; 
		int y;
		int wall;
		int distance;
		
		Point(int x, int y, int wall, int distance){
			this.x = x;
			this.y = y;
			this.wall = wall;
			this.distance = distance;
		}
	}

}

