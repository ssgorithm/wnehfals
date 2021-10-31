import java.util.*;
import java.io.*;

public class Solution_BOJ_1374_강의실 {

	static int N;
	static ArrayList<Class>list = new ArrayList<>();
	static PriorityQueue<Integer>pq = new PriorityQueue<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			list.add(new Class(num,start,end));
		}
		
		Collections.sort(list);
		
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<list.size(); i++) {
			while(!pq.isEmpty() && pq.peek()<=list.get(i).start) {
				pq.poll();
			}
			pq.add(list.get(i).end);
			ans = Math.max(ans, pq.size());
		}
		System.out.println(ans);
	}
	
	public static class Class implements Comparable<Class> {
		int num;
		int start;
		int end;
		
		public Class(int num, int start, int end) {
			this.num = num;
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Class o) {
			if(o.start == this.start) return this.end-o.end;
			return this.start-o.start;
		}
	}

}
