import java.util.*;
import java.io.*;

public class Solution_BOJ_9251_LCS {

	static char[] A;
	static char[] B;
	static int[][] LCS;
	static int ans;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		char A[] = new char[str1.length()+1];
		char B[] = new char[str2.length()+1];
		int LCS[][] = new int [str1.length()+1][str2.length()+1];
		
		for(int i=0; i<str1.length();i++) {
			A[i+1] = str1.charAt(i);
		}
		
		for(int i=0; i<str2.length();i++) {
			B[i+1] = str2.charAt(i);
		}
		
		for(int i=1; i<A.length; i++) {
			for(int j=1; j<B.length; j++) {
				if(A[i]== B[j]) LCS[i][j] = LCS[i-1][j-1]+1;
				else LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
			}
		}
		
		for(int i=0; i<A.length;i++) {
			for(int j=0; j<B.length; j++) {
				ans = Math.max(ans, LCS[i][j]);
			}
		}
		
		System.out.println(ans);
	}

}
