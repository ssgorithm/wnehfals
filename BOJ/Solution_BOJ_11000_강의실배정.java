import java.util.*;
import java.io.*;

public class Solution_BOJ_11000_강의실배정 {

	static int S,T,N;
	static ArrayList<ClassRoom> list = new ArrayList<>();
	static PriorityQueue<Integer>pq = new PriorityQueue<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			S = Integer.parseInt(st.nextToken());
			T = Integer.parseInt(st.nextToken());
			
			list.add(new ClassRoom(S,T));
		}
		Collections.sort(list);
		
		pq.add(list.get(0).t);
		
		for(int i=1; i<list.size();i++) {
			
			if(pq.peek() <= list.get(i).s)pq.poll();
			pq.add(list.get(i).t);
		}
	
		System.out.println(pq.size());

	}

	public static class ClassRoom implements Comparable<ClassRoom>{
		int s;
		int t;
		public ClassRoom(int s, int t) {
			this.s = s;
			this.t = t;
		}
		@Override
		public int compareTo(ClassRoom o) {
			if(o.s==this.s) return this.t-o.t;
			return this.s-o.s;
		}
	}
}
