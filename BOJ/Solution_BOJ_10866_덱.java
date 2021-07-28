import java.io.*;
import java.util.*;

public class Solution_BOJ_10866_덱 {

	static int n;
	static Deque<Integer>deque = new LinkedList<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if(s.equals("push_front")) deque.addFirst(Integer.parseInt(st.nextToken()));
			else if(s.equals("push_back")) deque.addLast(Integer.parseInt(st.nextToken()));
			else if(s.equals("pop_front")) {
				if(deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.pollFirst());
			}
			else if(s.equals("pop_back")) {
				if(deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.pollLast());
			}
			else if(s.equals("size")) System.out.println(deque.size());
			else if(s.equals("empty")) {
				if(deque.isEmpty()) System.out.println(1);
				else System.out.println(0);
			}
			else if(s.equals("front")) {
				if(deque.isEmpty())System.out.println(-1);
				else System.out.println(deque.peekFirst());
			}
			else if(s.equals("back")) {
				if(deque.isEmpty()) System.out.println(-1);
				else System.out.println(deque.peekLast());
			}
		}
		

	}

}
