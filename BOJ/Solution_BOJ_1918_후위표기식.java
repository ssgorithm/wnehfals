import java.io.*;
import java.util.*;

public class Solution_BOJ_1918_후위표기식 {

	static String s;
	static Stack<Character> stack = new Stack<>();
	static Stack<Character> alphabet = new Stack<>();
	static Stack<Character> operator = new Stack<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			// 피연산자인 경우 
			if(c>='A' && c<='Z') sb.append(c);
			
			// 연산자인 경우 
			else {
				// ()먼저 처리 
				if(c=='(') stack.push(c);
				else if(c==')') {
					while(!stack.isEmpty() && stack.peek()!='(') {
						sb.append(stack.pop());
					}
					if(!stack.isEmpty())stack.pop();
				}
				
				// + - / * 인 경우 
				else {
					while(!stack.isEmpty() && Priority(stack.peek())>=Priority(c)) {
						sb.append(stack.pop());
					}
					stack.push(c);
				}				
			}			
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
		
		

	}

	private static int Priority(Character ch) {
		if(ch=='*' || ch=='/') return 2;
		else if(ch=='+' || ch=='-') return 1;
		else return 0;
	}

}
