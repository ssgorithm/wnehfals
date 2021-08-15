import java.util.*;
import java.io.*;

public class Solution_BOJ_14502_로봇청소기 {

	static int N,M;
	static int[][]map;
	static int robot_r,robot_c,robot_d; //로봇칸 좌표, 방향 (0:북쪽, 1:동쪽, 2:남쪽, 3:서쪽)
	static int [][]dir = {{-1,0},{0,1},{1,0},{0,-1}};
	static int cnt;
	
public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int [N][M];
		
		
		st = new StringTokenizer(br.readLine());
		robot_r = Integer.parseInt(st.nextToken());
		robot_c = Integer.parseInt(st.nextToken());
		robot_d = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		RobotCleaner(robot_r,robot_c,robot_d);
		System.out.println(cnt);
		
		
		
	}
private static void RobotCleaner(int robot_r, int robot_c, int robot_d) {
	
	if(map[robot_r][robot_c]==0) {
		map[robot_r][robot_c]=2;
		cnt++;
	}
	
	
	boolean flag = false;
	int cur_d = robot_d;
	for(int d=0; d<4; d++) {
		int nd = (robot_d+3)%4;
		int nr = robot_r+dir[nd][0];
		int nc = robot_c+dir[nd][1];
		
		if(nr>0 && nr<N && nc>0 && nc<M) {
			if(map[nr][nc]==0) {
				RobotCleaner(nr,nc,nd);
				flag=true;
				break;
			}
		}
		robot_d=(robot_d+3)%4;
	}
	
	if(!flag) {
		int br = robot_r+dir[(cur_d+2)%4][0];
		int bc = robot_c+dir[(cur_d+2)%4][1];
		
		if(br>0 && br<N && bc>0 && bc<M) {
			if(map[br][bc]!=1) {
				RobotCleaner(br,bc,cur_d);
			}
			
		}
		
	}
	
	
	
	
	
}

}
