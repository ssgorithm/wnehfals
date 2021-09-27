import java.util.*;
import java.io.*;

public class Solution_BOJ_11653_소인수분해 {

	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		
		for(int i=2; i<=N; i++) {
			
			while(N%i==0) {
				N/=i;
				System.out.println(i);
			}
		}
	}

}
