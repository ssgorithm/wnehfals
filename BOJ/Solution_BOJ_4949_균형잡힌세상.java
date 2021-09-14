import java.util.*;
import java.io.*;

public class Solution_BOJ_4949_균형잡힌세상 {

	static String st=" ";
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			Stack<Character>stack = new Stack<>();
			st = br.readLine();
			if(st.equals("."))break;
			for(int i=0; i<st.length();i++) {
				char c = st.charAt(i);
				if(c=='(') stack.push(c);
				else if(c==')') {
					if(stack.isEmpty()) {
						stack.push(c);
						continue;
					}
					else if(stack.peek()=='(') stack.pop();
					else if(stack.peek()!='(') stack.push(c);
					
				}
				else if(c=='[') stack.push(c);
				else if(c==']') {
					if(stack.isEmpty()) {
						stack.push(c);
						continue;
					}
					if(stack.peek()=='[') stack.pop();
					else if(stack.peek()!='[') stack.push(c);
				}
				
			}
			if(stack.isEmpty()) System.out.println("yes");
			else System.out.println("no");
		}
		

	}

}
