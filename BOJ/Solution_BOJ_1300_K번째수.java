import java.util.*;
import java.io.*;

public class Solution_BOJ_1300_K번째수 {

	static int N;
	static int k;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		
		int l = 1;
		int r = k;
		int ans = 0;
		
		while(l<=r) {
			int mid = (l+r)/2;
			int cnt = 0;
			
			for(int i=1; i<=N; i++) {
				cnt+= Math.min(mid/i, N);
				
			}
			if(cnt<k) {
				l = mid+1;
			}
			else {
				ans = mid;
				r = mid-1;
			}
		}
		
	System.out.println(ans);

	}

}
