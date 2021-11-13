import java.util.*;
import java.io.*;

public class Solution_BOJ_14728_벼락치기 {

	static int N,T;
	static int[]time;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		time = new int[T+1];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			
			for(int j = T; j>=K; j--) {
				time[j] = Math.max(time[j], time[j-K]+S);
			}
		}

		System.out.println(time[T]);
		
	}
	
	

}
