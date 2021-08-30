import java.util.*;
import java.io.*;

public class Solution_BOJ_14490_백대열 {

	static int n,m;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(":");
		n = Math.max(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		m = Math.min(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		
		int gNum = GCP(n,m);
		System.out.println(Integer.parseInt(s[0])/gNum+":"+Integer.parseInt(s[1])/gNum);
		
	}
	private static int GCP(int n, int m) {
		
		if (m==0) return n;
		else return GCP(m,n%m);
		
	}

}
