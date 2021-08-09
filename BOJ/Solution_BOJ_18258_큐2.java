import java.util.*;
import java.io.*;

public class Solution_BOJ_18258_큐2 {

	static int N;
	static Deque<Integer>deque = new LinkedList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		int num = 0;
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if(s.equals("push")) {
				num = Integer.parseInt(st.nextToken());
				deque.offer(num);
			}
			else if(s.equals("pop")) {
				if(deque.isEmpty()) sb.append(-1+"\n");
				else sb.append(deque.pollFirst()+"\n");
				
			}
			else if(s.equals("size")) {
				sb.append(deque.size()+"\n");
			}
			else if(s.equals("empty")) {
				if(deque.isEmpty()) sb.append(1+"\n");
				else sb.append(0+"\n");
			}
			else if(s.equals("front")) {
				if(deque.isEmpty()) sb.append(-1+"\n");
				else sb.append(deque.peekFirst()+"\n");
			}
			else if(s.equals("back")) {
				if(deque.isEmpty()) sb.append(-1+"\n");
				else sb.append(deque.peekLast()+"\n");
			}
			
			
		}
		System.out.println(sb);

	}

}
