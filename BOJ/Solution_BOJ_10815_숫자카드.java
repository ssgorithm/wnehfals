import java.io.*;
import java.util.*;

public class Solution_BOJ_10815_숫자카드 {

	static int N;
	static int M;
	static int[]check = new int [20000001];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			check[Integer.parseInt(st.nextToken())+10000000]++;
		}
		
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer (br.readLine());
		
		for(int i=0; i<M; i++) {
			int num= Integer.parseInt(st.nextToken());
			if(check[num+10000000]>0) System.out.print(1+" ");
			else System.out.print(0+" ");
		}
		
		

	}

}
