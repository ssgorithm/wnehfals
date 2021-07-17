import java.util.*;
import java.io.*;

public class Solution_BOJ_2589_보물섬 {
	
	static int w,h;
	static char[][]map;
	
	static int[]dr = {0,0,-1,1};
	static int[]dc = {-1,1,0,0};
	
	static int max = Integer.MIN_VALUE;
	static int result = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		
		map = new char [h][w];
		
		for(int i=0; i<h; i++) {
			String s = br.readLine();
			for(int j=0; j<w; j++) {
				map[i][j] = s.charAt(j);
				
			}
		}
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if(map[i][j]=='L') {
					bfs(i,j);
					result  = Math.max(result, max);
				}
			}
		}
		
		System.out.println(result);
	
	}
	
	private static void bfs(int sx, int sy) {
		Queue<Point>queue = new LinkedList<>();
		boolean[][]visit = new boolean[h][w];
		
		queue.add(new Point(sx,sy,0));
		
		while(!queue.isEmpty()) {
			Point cur = queue.poll();
			visit[cur.x][cur.y] = true;
			

			for(int d = 0; d<4; d++) {
				int nx = cur.x+dr[d];
				int ny = cur.y+dc[d];
				
				if(nx<0 || ny<0 || nx>=h || ny>=w) continue;
				if(visit[nx][ny])continue;
				if(map[nx][ny]=='W')continue;
				if(map[nx][ny]=='L') {
					visit[nx][ny]=true;
					queue.offer(new Point(nx,ny,cur.dis+1));
					max = Math.max(max, cur.dis+1);
				}
			}
		}
	}

	public static class Point{
		int x;
		int y;
		int dis;
		
		Point(int x, int y, int dis) {
			this.x = x;
			this.y = y;
			this.dis = dis;
		}
	}

}
