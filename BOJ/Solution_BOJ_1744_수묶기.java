import java.util.*;
import java.io.*;

public class Solution_BOJ_1744_수묶기 {

	static int[]arr;
	static int N;
	static int minusFlag;
	static int ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int [N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]<=0) minusFlag++;
		}
		Arrays.sort(arr);
		
		// 음수인 경우 
		if(minusFlag%2==1) {
			ans+=arr[minusFlag-1];
		}
		for(int i=1; i<minusFlag; i+=2) {
			ans+=arr[i]*arr[i-1];
		}
		
		// 양수인 경우 
		if((N-minusFlag)%2==1) {
			ans+=arr[minusFlag];
		}
		for(int i= N-1; i>minusFlag; i-=2) {
			int sum = arr[i]+arr[i-1];
			int mul = arr[i]*arr[i-1];
			
			ans+=Math.max(sum, mul);
		}
		
		System.out.println(ans);		
	}
}
