import java.util.*;
import java.io.*;

public class Solution_BOJ_1769_3의배수 {

	static String X;
	static int n;
	
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		X = br.readLine();
		
		MakeNum(X,0);
	}

	private static void MakeNum(String x, int cnt) {
		
		if(x.length()==1) {
			System.out.println(cnt);
			if(Integer.parseInt(String.valueOf(x))%3==0) System.out.println("YES");
			else System.out.println("NO");
			return;
		}
		
		int num=0;
		for(int i=0; i<x.length();i++) {
			num += Integer.parseInt(String.valueOf(x.charAt(i)));
	
		}
		MakeNum(Integer.toString(num),cnt+1);
	}

}
