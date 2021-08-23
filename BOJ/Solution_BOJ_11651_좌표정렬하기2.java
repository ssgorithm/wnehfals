import java.util.*;
import java.io.*;

public class Solution_BOJ_11651_좌표정렬하기2 {

	static int N;
	static ArrayList<Point>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list.add(new Point(x,y));
		}
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).x+" "+list.get(i).y);
		}
		
	}
	
	public static class Point implements Comparable<Point>{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Point o) {
			if(this.y==o.y)return this.x-o.x;
			return this.y-o.y;
		}
	}

}
