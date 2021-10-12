import java.util.*;
import java.io.*;

public class Solution_BOJ_2822_점수계산 {

	static int N; 
	static ArrayList<Score>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=1; i<=8; i++) {
			list.add(new Score(i,Integer.parseInt(br.readLine())));
		}
		
		Collections.sort(list);
		
		int total = 0;
		ArrayList<Integer> anslist = new ArrayList<>();
		for(int i=0; i<5;i++) {
			total += list.get(i).scoreNum;
			anslist.add(list.get(i).problem);
		}
		Collections.sort(anslist);
		System.out.println(total);
		for(int i=0; i<anslist.size();i++) {
			System.out.print(anslist.get(i)+" ");
		}
	}
	
	public static class Score implements Comparable<Score>{

		int problem;
		int scoreNum;
		
		public Score(int problem, int scoreNum) {
			this.problem = problem;
			this.scoreNum = scoreNum;
		}
		@Override
		public int compareTo(Score o) {
			
			return o.scoreNum-this.scoreNum;
		}
		
	}

}
