import java.util.*;
import java.io.*;

public class Solution_BOJ_9084_동전 {

	static int T,N,M;
	static int[]coins, ans;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc<T; tc++) {
			
			N = Integer.parseInt(br.readLine());
			coins = new int [N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				coins[i] = Integer.parseInt(st.nextToken());
			}
			M = Integer.parseInt(br.readLine());
			
			ans = new int[M+1];
			ans[0] = 1;
			
			for(int i=0; i<coins.length; i++) {
				for(int j=coins[i]; j<=M; j++) {
					ans[j]+= ans[j-coins[i]];
				}
			}
			System.out.println(ans[M]);
		}

	}

}
