import java.io.*;
import java.util.*;

public class Solution_BOJ_17471_게리멘더링 {

	static int N;
	static int[][]graph;
	static int [] people;
	static ArrayList<Integer>ward1 = new ArrayList<>();
	static ArrayList<Integer>ward2 = new ArrayList<>();
	static Stack<Integer>q = new Stack<>();
	static boolean[] visit;
	static int min;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		people = new int[N+1];
		graph = new int[N+1][N+1];
		visit = new boolean[N+1];
		min = Integer.MAX_VALUE;
		for(int i=1; i<=N; i++) {
			people[i] = sc.nextInt();
		}
		
		for(int i=1; i<=N; i++) {
			int idx = sc.nextInt();
			for(int j=0; j<idx ; j++) {
				int node = sc.nextInt();
				graph[i][node]=1;
				graph[node][i]=1;
			}
		}
		
		
		
		Gerrymandering(1);
		if(min==Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(min);

	}
	
	
	private static void Gerrymandering(int idx) {
		
		
		if(idx>N) {
			if(ward1.isEmpty() || ward2.isEmpty()) return;
			visit = new boolean[N+1];
			Check(0,ward1);
			for(int i=0;i<ward1.size();i++) {
				if(!visit[ward1.get(i)])return;
			}
			visit = new boolean[N+1];
			Check(0,ward2);
			for(int i=0;i<ward2.size();i++) {
				if(!visit[ward2.get(i)])return;
			}
			min = Math.min(min, Calc());
			
			return;
		}
		
		
		ward1.add(idx);
		Gerrymandering(idx+1);
		ward1.remove(ward1.size()-1);
		
		ward2.add(idx);
		Gerrymandering(idx+1);
		ward2.remove(ward2.size()-1);
	}


	


	private static int Calc() {
		int w1 = 0;
		int w2 = 0;
		for(int i=0; i<ward1.size();i++) {
			w1+=people[ward1.get(i)];
		}
		for(int i=0; i<ward2.size();i++) {
			w2+=people[ward2.get(i)];
		}
		return Math.abs(w1-w2);
	}


	private static void Check(int start, ArrayList<Integer> ward ) {
		
		q.push(ward.get(start));
		
		while(!q.isEmpty()) {
			int node = q.pop();
			visit[node]=true;
			for(int i=0;i<ward.size();i++) {
				if(visit[ward.get(i)])continue;
				if(graph[node][ward.get(i)]==0)continue;
				visit[ward.get(i)]=true;
				q.push(ward.get(i));
			}
		}
		
	}
	

}
