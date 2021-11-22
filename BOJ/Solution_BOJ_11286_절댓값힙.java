import java.util.*;
import java.io.*;

public class Solution_BOJ_11286_절댓값힙 {

	static int N;
	public static void main(String[] args) throws Exception{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer>pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int a = Math.abs(o1);
				int b = Math.abs(o2);
				
				if(a==b) return o1-o2;
				else return a-b;
			}
		});
		
		N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				if(!pq.isEmpty()) {
					System.out.println(pq.poll());
				}
				else {
					System.out.println("0");
				}
			}
			else pq.add(num);
		}

	}

}
