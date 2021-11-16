import java.util.*;
import java.io.*;

public class Solution_BOJ_15650_N과M2 {

	static int N,M;
	static int[]arr;
	static int[]ans;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		ans = new int [M];
		
		Combination(1,0);
		

	}
	private static void Combination(int index, int cnt) {
		
		if(cnt==M) {
			for(int i=0;i<ans.length;i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=index; i<=N; i++) {
			ans[cnt]=i;
			Combination(i+1,cnt+1);
		}
		
	}

}
