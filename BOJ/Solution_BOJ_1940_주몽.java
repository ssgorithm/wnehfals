import java.util.*;
import java.io.*;

public class Solution_BOJ_1940_주몽 {

	static int N,M;
	static int arr[];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		arr = new int [N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int left= 0; 
		int right = N-1;
		int cnt = 0;
		
		while(left<right) {
			int sum = arr[left]+arr[right];
			if(sum==M)cnt++;
			
			if(sum<M)left++;
			else right--;
		}
		
		System.out.println(cnt);
	}

}
