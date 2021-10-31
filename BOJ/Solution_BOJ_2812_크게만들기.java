import java.util.*;
import java.io.*;

public class Solution_BOJ_2812_크게만들기 {
	static int N,K;
	static Stack<Integer>stack = new Stack<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		String str = br.readLine();
		int cnt =0;
		for(int i=0; i<N; i++) {
			int num = str.charAt(i)-'0';
			while(cnt<K && !stack.isEmpty() && stack.peek()<num) {
				stack.pop();
				cnt++;
			}
			stack.push(num);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N-K;i++) {
			sb.append(stack.get(i));
		}
		System.out.println(sb);
	}

}
