import java.util.*;
import java.io.*;

public class Solution_BOJ_2693_N번째큰수 {
	
	static int T;
	static Integer[] A = new Integer [10];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0 ;i<10; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(A,Collections.reverseOrder());
			System.out.println(A[2]);
		}
	}

}
