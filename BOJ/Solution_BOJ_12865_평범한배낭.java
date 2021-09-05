import java.util.*;
import java.io.*;

public class Solution_BOJ_12865_평범한배낭 {

	static int N,W;
	static int knapsack[][];
	static int weight[];
	static int value[];
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		
		knapsack = new int [N+1][W+1];
		weight = new int [N+1];
		value = new int [N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=W; j++) {
				if(weight[i]<=j) {
					knapsack[i][j] = Math.max(value[i]+knapsack[i-1][j-weight[i]],knapsack[i-1][j]);
				}
				else knapsack[i][j] = knapsack[i-1][j];
				max = Math.max(max, knapsack[i][j]);
			}
		}
		System.out.println(max);
	}
}
