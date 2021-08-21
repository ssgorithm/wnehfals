import java.io.*;
import java.util.*;

public class Solution_BOJ_14499_주사위굴리기 {

	static int N,M,x,y,K;
	static int[][]map;
	static int[]dice = {0,0,0,0,0,0};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new int [N][M];

		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<K; i++) {
			int order = Integer.parseInt(st.nextToken());
			if(!check(order)) continue; 
			rotate(order);
			if(map[x][y]==0) map[x][y] = dice[5];
			else {
				dice[5] = map[x][y];
				map[x][y]=0;
			}
			
			System.out.println(dice[0]);
		}

	}
	private static boolean check(int order) {
		switch(order) {
		case 1: 
			if(y == M-1) return false;
			break;
		case 2: 
			if(y == 0)return false;
			break;
		case 3: 
			if(x == 0) return false;
 			break;
		case 4: 
			if(x == N-1) return false;
			break;		
		}
		return true;
	}
	private static void rotate(int order) {
		int temp = dice[0];
		switch(order) {		
			// 동쪽 
			case 1:
				y++;
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = temp;
				break;
			// 서쪽 
			case 2:
				y--;
				dice[0] = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = temp;
				break;
			// 북쪽  
			case 3:
				x--;
				dice[0] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = temp;
				break;					
			// 남쪽  
			case 4:				
				x++;
				dice[0] = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = temp;
				break;
		}
		
	}

}
