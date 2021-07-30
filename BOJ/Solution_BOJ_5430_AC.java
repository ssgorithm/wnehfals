import java.util.*;
import java.io.*;

public class Solution_BOJ_5430_AC {

	static int tc;
	static String p;
	static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		tc = Integer.parseInt(br.readLine());
		
		for(int t=0; t<tc; t++) {
			p = br.readLine();
			n = Integer.parseInt(br.readLine());
			
			Deque<Integer>deque = new LinkedList<>();
			
			String s = br.readLine();
			String[] s1 = s.split("[\\[\\]\\,]");
			
			for(int i=1; i<s1.length; i++) {
				deque.add(Integer.parseInt(s1[i]));
			}
					
			// true : 앞에서 빼기 / false : 뒤에서 빼기 
			// check : error 판별 변수 
			boolean flag = true;
			boolean check = true;
			
			for(int i=0; i<p.length(); i++) {
				char c = p.charAt(i);
				if(c=='R') {
					flag = !flag;
				}
				if(c=='D') {
					if(deque.isEmpty()) {
						check=false;
						break;
					}
					else {
						if(flag)deque.pollFirst();
						else deque.pollLast();
					}
				}				
			}
			
			StringBuilder sb = new StringBuilder();
			if(!check) System.out.print("error");
		
			else {
				sb.append("[");
				// 덱에 들어있는 원소가 없는 경우 
				if(!deque.isEmpty()) {
					if(flag) {
						while(!(deque.size()==1)) {
							sb.append(deque.pollFirst());
							sb.append(",");
						}
					}
					else {
						while(!(deque.size()==1)) {
							sb.append(deque.pollLast());
							sb.append(",");
						}						
					}
					sb.append(deque.poll());
				}
				sb.append("]");
			}
			System.out.println(sb);			
			
		}
	}
}
