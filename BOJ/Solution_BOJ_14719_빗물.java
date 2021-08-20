import java.io.*;
import java.util.*;

public class Solution_BOJ_14719_빗물 {

	static int H,W;
	static int []map;
	static int ans;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		map = new int [W];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<W; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<W; i++) {
			int index = map[i];
			
			//왼쪽에서 기준점보다 큰 최대높이 기둥 찾기 
			int left = 0;
			for(int l = i; l>=0; l--) {
				left=Math.max(left, map[l]);
			}
			
			//오른쪽에서 기준점보다 큰 최대높이 기둥 찾기 
			int right = 0;
			for(int r=i; r<W; r++) {
				right = Math.max(right, map[r]);
			}
			
			//왼-오 최소 기둥 찾아서 차이 구하기 
			ans+=Math.min(left,right)-index;
		}
		if(ans<0) ans = 0;
		System.out.println(ans);
		
		
	}
	

}
