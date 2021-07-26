import java.util.*;
import java.io.*;

public class Solution_BOJ_10845_큐 {

	static int n;
	static int num;
	static Queue<Integer>queue = new LinkedList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("push")) {
				num = Integer.parseInt(st.nextToken());
				queue.add(num);
			}
			else if(s.equals("pop")) {
				if(queue.size()==0) System.out.println(-1);
				else System.out.println(queue.poll());
			}
			else if(s.equals("size")) {
				System.out.println(queue.size());
			}
			else if(s.equals("empty")) {
				if(queue.isEmpty())System.out.println(1);
				else System.out.println(0);
			}
			else if (s.equals("front")) {
				if(queue.size()==0) System.out.println(-1);
				else System.out.println(queue.peek());
			}
			else if (s.equals("back")) {
				if(queue.size()==0) System.out.println(-1);
				else System.out.println(num);
			}
		}
		

	}

}
