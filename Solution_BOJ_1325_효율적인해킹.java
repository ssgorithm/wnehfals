import java.util.*;
import java.io.*;

public class Solution_BOJ_1325_효율적인해킹 {

	static int N,M;
	static ArrayList<Integer>[] Node;
	static boolean visit[];
	static int[]ans;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		Node = new ArrayList[N+1]; 
		ans = new int [N+1];
		
		for (int i = 1; i <= N; i++) { 
			Node[i] = new ArrayList<>(); 
		}

		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			Node[A].add(B);
		}
		
		for(int i=1; i<=N; i++) {
			visit = new boolean[N+1];
			Hacking(i);
		}
		
		int max = 0;
		for(int i=1; i<=N; i++) {
			max = Math.max(max, ans[i]);
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=1; i<=N; i++) {
			if(max==ans[i]) sb.append(i+" ");
		}
		System.out.println(sb.toString());


	}
	private static void Hacking(int start) {
		
		Queue<Integer>queue = new LinkedList<Integer>();
		queue.add(start);
		visit[start] = true;
		
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			
			for(int i=0 ;i<Node[cur].size(); i++) {
				int next = Node[cur].get(i);
				if(!visit[next]) {
					visit[next]=true;
					ans[next]++;
					queue.add(next);
					
				}
			}
		}
		
		
		
	}

}
