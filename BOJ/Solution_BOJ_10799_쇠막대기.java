import java.util.*;
import java.io.*;

public class Solution_BOJ_10799_쇠막대기 {

	static String s;
	static int cnt = 0;
	static Stack<Character>stack = new Stack<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='(') stack.push(c);
			
			else if(c==')') {
				stack.pop();
				
				if(s.charAt(i-1)=='(') {
					cnt+=stack.size();
					
				}
				else cnt+=1;
				
			}
		}
		System.out.println(cnt);

	}

}
