import java.util.*;
import java.io.*;

public class Solution_BOJ_1789_수들의합 {

	static long N,S;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = Long.parseLong(br.readLine());
		
		solve(1,0,0);
	}
	private static void solve(long cur, long cnt, long sum) {
		
		if(sum>S) {
			System.out.println(cnt-1);
			return;
		}
		
		
		solve(cur+1, cnt+1, sum+cur);
		
	}

}
