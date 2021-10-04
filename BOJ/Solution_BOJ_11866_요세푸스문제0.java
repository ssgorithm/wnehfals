import java.util.*;
import java.io.*;

public class Solution_BOJ_11866_요세푸스문제0 {

	static int N, K;
	static ArrayList<Integer>list = new ArrayList<>();
	static ArrayList<Integer>ans = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		
		for(int i=0; i<N; i++) {
			list.add(i+1);
		}
		
		
		int index = 0;
		while(ans.size()!=N) {
			index = (index+K-1)% list.size();
			ans.add(list.remove(index));
		}
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i=0; i<ans.size()-1; i++) {
			sb.append(ans.get(i)+", ");
		}
		sb.append(ans.get(ans.size()-1));
		sb.append(">");
		
		System.out.println(sb);
		
		
		
		
		

	}

}
