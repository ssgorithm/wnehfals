import java.util.*;
import java.io.*;
public class Solution_BOJ_15651_N과M3 {

	static int N,M;
	static int[]ans;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		ans = new int [M];
		
		Permutation(0);
		System.out.println(sb);
	}
	private static void Permutation(int cnt) {
		if(cnt==M) {
			for(int i=0; i<ans.length; i++) {
				sb.append(ans[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=N; i++) {
			ans[cnt]=i;
			Permutation(cnt+1);
		}
		
	}

}
