import java.util.*;
import java.io.*;

public class Solution_BOJ_10773_제로 {

	static int K;
	static Stack<Integer>stack = new Stack<>();
	static int ans;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		
		for(int i=0 ;i<K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0)stack.pop();
			else stack.push(num);
		}
		
		while(!stack.isEmpty()) {
			ans+=stack.pop();
		}
		System.out.println(ans);

	}

}
