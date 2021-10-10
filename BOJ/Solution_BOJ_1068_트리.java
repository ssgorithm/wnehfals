import java.util.*;
import java.io.*;

public class Solution_BOJ_1068_트리 {

	static int N,L;
	static int[]parents;
	static Queue<Integer>queue = new LinkedList<>();
	static boolean[] visit;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		parents = new int [N];
		visit = new boolean [N];
		
		for(int node=0; node<N; node++) {
			int parentNode =  Integer.parseInt(st.nextToken());
			parents[node] = parentNode;
		}
		
		L = Integer.parseInt(br.readLine());
		
	
		
		bfs(L);
		
		// 리프노드 찾기 
		int cnt = 0;
		for(int i=0; i<N; i++) {
			boolean flag = false;
			if(!visit[i]) {
				flag = true;
				for(int j=0; j<N; j++) {
					if(!visit[j]&&parents[j]==i) flag= false;
				}
			}
			if(flag) cnt++;
		}
		System.out.println(cnt);
		
	}
	
	// 노드 삭제 로직
	private static void bfs(int start) {
		queue.offer(start);
		visit[start] = true;
		
		while(!queue.isEmpty()) {
			int curNode = queue.poll();
			visit[curNode] = true;
			
			for(int i=0; i<N; i++) {
				if(parents[i]==curNode) queue.offer(i);
			}
		}
		
		
	}

}
