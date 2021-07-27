import java.io.*;
import java.util.*;

public class Solution_BOJ_9012_괄호 {

	static int t;
	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		for(int i=0 ;i<t; i++) {
			Stack<Character>stack = new Stack<>();
			String s = br.readLine();
			
			for(int j=0; j<s.length();j++) {
				char c = s.charAt(j);
				
				//  '(' 인 경우에는 그냥 스택에 넣어주기 
				if(c=='(') stack.push(c);
				
				// ')'인 경우는 '('와 짝을 지을 수 있는지 여부 확인 
				else if(c==')') {
					// '(' 가 스택에 없어서 짝지을 수 없는 경우 -> 스택에 push
					if(!stack.contains('(')) stack.add(c);
					
					// 짝지을 수 있는 경우는 스택에 넣지 않고 pop
					else stack.pop();
				}				
			}
			if(stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");

		}

	}

}
