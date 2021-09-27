import java.util.*;
import java.io.*;

public class Solution_BOJ_2467_용액 {

	static int N;
	static int[]liquid;
	static int min = Integer.MAX_VALUE;
	static int ans1, ans2;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		liquid = new int [N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			liquid[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(liquid);
		
		int left = 0;
		int right = N-1;
		
		while(left<right) {
			
			int sum = liquid[left]+liquid[right];
			
			if(min>Math.abs(sum)) {
				min = Math.abs(sum);
				ans1 = liquid[left];
				ans2 = liquid[right];
				
				if(sum==0) break;
			}
			if(sum<0) left++;
			else right--;
			
		}
	
		System.out.println(ans1+" "+ans2);
	}

}

