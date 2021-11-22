import java.util.*;
import java.io.*;

public class Solution_BOJ_1927_최소힙 {

	static int N;
	static PriorityQueue<Integer>pq = new  PriorityQueue<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
