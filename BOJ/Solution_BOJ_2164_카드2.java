import java.util.*;
import java.io.*;;

public class Solution_BOJ_2164_카드2 {

	static int N;
	static Deque<Integer>deque = new LinkedList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			deque.add(i);
		}
		
		
		while(deque.size()!=1) {
			deque.pollFirst();
			deque.addLast(deque.pollFirst());
		}
		
		System.out.println(deque.poll());

	}

}
