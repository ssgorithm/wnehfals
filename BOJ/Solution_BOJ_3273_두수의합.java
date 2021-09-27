import java.util.*;
import java.io.*;

public class Solution_BOJ_3273_두수의합 {

	static int n,x;
	static int []arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		arr = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		x = Integer.parseInt(br.readLine());
		
		int left = 0;
		int right = n-1;
		int cnt = 0;
		
		while(left<right) {
			
			int sum = arr[left]+arr[right];
			
			if(sum==x) {
				cnt++;
			}
			
			if(sum<x) left++;
			else right--;
		}
		
		System.out.println(cnt);
	}

}
