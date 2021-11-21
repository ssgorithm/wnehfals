import java.util.*;
import java.io.*;

public class Solution_BOJ_17845_수강과목 {

	static int N,K;
	static int[] ans;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		ans = new int [N+1];
		
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());
			
			for(int j = N; j>=T; j--) {
				ans[j] = Math.max(ans[j], ans[j-T]+I);
			}
		}
		
		System.out.println(ans[N]);

	}

}
