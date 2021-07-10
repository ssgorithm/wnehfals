import java.io.*;
import java.util.*;

public class Solution_BOJ_10828_스택 {

	static int N;
	static int num;
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		N = Integer.parseInt(br.readLine());
		
		for(int i=0 ;i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
		
			//push : 정수를 스택에 넣는 연산 
			if(s.equals("push")) {
				num = Integer.parseInt(st.nextToken());
				stack.push(num);
			}
			
			// pop : 스택의 가장 위에 있는 정수 pop, 스택이 비어있는 경우 -1 출력 
			else if(s.equals("pop")) {
				if(stack.isEmpty())System.out.println(-1);
				else System.out.println(stack.pop());
			}
			
			// size : 스택의 사이즈 출력 
			else if(s.equals("size")) {
				System.out.println(stack.size());
			}
			
			// empty : 스택이 비어있는 경우 1, 아닌 경우 0 출력 
			else if(s.equals("empty")) {
				if(stack.isEmpty()) System.out.println(1);
				else System.out.println(0);
			}
			
			// top : 스택의 가장 위에 있는 정수 출력, 스택이 비어있는 경우 -1 출력 
			else if(s.equals("top")) {
				if(stack.isEmpty())System.out.println(-1);
				else System.out.println(stack.peek());
				
			}
			
		}

	}

}
