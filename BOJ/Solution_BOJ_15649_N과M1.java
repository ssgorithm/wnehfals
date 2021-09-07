import java.io.*;
import java.util.*;

public class Solution_BOJ_15649_N과M1 {

	static int N,M;
	static boolean[]visit;
	static int arr[];
	static int ans[];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int [N+1];
		ans = new int [M];
		visit = new boolean[N+1];
		
		for(int i=1; i<=N; i++) {
			arr[i] = i;
		}
		
		Permutation(0);
		
	}

	private static void Permutation(int cnt) {
		
		if(cnt==M) {
			for(int i=0; i<M; i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1; i<=N; i++) {
			if(visit[i])continue;
			ans[cnt] = arr[i];
			visit[i]=true;
			Permutation(cnt+1);
			visit[i]=false;
		}
		
	}
}
