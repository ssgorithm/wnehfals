import java.util.*;
import java.io.*;

public class Solution_BOJ_15652_N과M4 {

	static int N,M;
	static int[] ans;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		ans = new int [M];
		
		Combination(1,0);
		System.out.println(sb);

	}
	private static void Combination(int index, int cnt) {
		if(cnt==M) {
			for(int i=0; i<ans.length; i++) {
				sb.append(ans[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=index; i<=N; i++) {
			ans[cnt]=i;
			Combination(i,cnt+1);
		}
	}

}
