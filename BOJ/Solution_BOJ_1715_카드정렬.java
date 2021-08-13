import java.util.*;
import java.io.*;

public class Solution_BOJ_1715_카드정렬 {

	static int N;
	static PriorityQueue<Integer>queue = new PriorityQueue<>();
	static int ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			queue.offer(Integer.parseInt(br.readLine()));
		}
	
		
		while(queue.size()>1) {
			int num1 = queue.poll();
			int num2 = queue.poll();
			
			
			ans += num1+num2;
			queue.offer(num1+num2);
		}
		System.out.println(ans);
	}

}
