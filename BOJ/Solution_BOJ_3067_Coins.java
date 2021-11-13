import java.util.*;
import java.io.*;

public class Solution_BOJ_3067_Coins {

	static int T,N,M;
	static int[] coin;
	static int[] dp;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc<T; tc++) {
			N = Integer.parseInt(br.readLine());
			coin = new int [N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<N; i++){
				coin[i] = Integer.parseInt(st.nextToken());
			}
			
			M = Integer.parseInt(br.readLine());
			dp = new int [M+1];
			dp[0] = 1;
			
			for(int i=0; i<coin.length; i++) {
				for(int j=coin[i]; j<=M; j++) {
					dp[j] += dp[j-coin[i]];
				}
			}
			System.out.println(dp[M]);
			
		}
	}

}
