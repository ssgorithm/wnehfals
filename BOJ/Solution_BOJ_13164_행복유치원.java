import java.util.*;
import java.io.*;

public class Solution_BOJ_13164_행복유치원 {

	static int N, K, ans;
	static int[]height;
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		height = new int [N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			height[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=N-1; i>=1; i--) {
			list.add(height[i]-height[i-1]);
		}
		Collections.sort(list);
		
		for(int i=0; i<K-1;i++) {
			ans+=list.get(i);
		}
		System.out.println(ans);
		
		
	}

}
