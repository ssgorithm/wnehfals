import java.util.*;
import java.io.*;

public class Solution_BOJ_17298_오큰수 {

	static int N;
	static Stack<Integer>stack = new Stack<>();
	static int[] arr;
	static int[] ans;
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int [N];
		ans = new int [N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			if(stack.empty()) stack.push(i);
			
			while(!stack.isEmpty()&& arr[stack.peek()]<arr[i]) {
				ans[stack.peek()] = arr[i];
				stack.pop();
			}
			
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			ans[stack.peek()] = -1;
			stack.pop();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(ans[i]+" ");
		}
		System.out.println(sb);
	}

}
