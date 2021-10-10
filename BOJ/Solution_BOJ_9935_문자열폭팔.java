import java.util.*;
import java.io.*;

public class Solution_BOJ_9935_문자열폭팔 {

	static Stack<Character>stack = new Stack<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bomb = br.readLine();
		
		
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
			
			if(stack.size()>=bomb.length()) {
				boolean flag = true;
				for(int j=0; j<bomb.length(); j++) {
					if(stack.get(stack.size()-bomb.length()+j)!=bomb.charAt(j)) {
						flag = false;
						break;
					}
				}
				if(flag) {
					for(int j=0; j<bomb.length(); j++) stack.pop();
				}
				
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("FRULA");
		}
		else {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<stack.size();i++) {
				sb.append(stack.get(i));
			}
			System.out.println(sb);
		}
	}

}
