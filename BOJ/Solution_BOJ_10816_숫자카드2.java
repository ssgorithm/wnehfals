import java.util.*;
import java.io.*;

public class Solution_BOJ_10816_숫자카드2 {

	static int N,M;
	static int arr[] = new int [20000000];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken())+10000000;
			arr[num]++;
		}
		
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			int num = Integer.parseInt(st.nextToken())+10000000;
			sb.append(arr[num]+" ");
		}
		System.out.println(sb);
	}

}
