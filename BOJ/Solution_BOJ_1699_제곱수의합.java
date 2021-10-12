import java.util.*;
import java.io.*;

public class Solution_BOJ_1699_제곱수의합 {
	static int N;
	static int dp[] = new int [100001];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		dp[1] = 1;
		
		for(int i=1; i<=N; i++) {
			dp[i] = i;
			for(int j=1; j*j<=i; j++) {
				dp[i] = Math.min(dp[i-(j*j)]+1, dp[i]);
			}
		}
		
		System.out.println(dp[N]);
		
	}
	

}
