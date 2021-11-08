import java.util.*;
import java.io.*;

public class Solution_BOJ_17828_문자열화폐 {

	static int N, X;
	static boolean flag;
	static Stack<Character>stack = new Stack<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		
		if(N*26 < X || X < N) {
			System.out.println("!");
			System.exit(0);
		}
		else {
			for(int i=0; i<N; i++) {
				int cur = N-i-1;
				if(X-cur>26) {
					stack.push('Z');
					X = X-26;
				}
				else {
					stack.push((char)(X-cur+64));
					X = X-(X-cur);
				}
				
			}
			
		}
		if(stack.isEmpty()) {
			System.out.println("!");
			System.exit(0);
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
		

	}
	

}
