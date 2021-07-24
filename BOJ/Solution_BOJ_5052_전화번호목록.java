import java.io.*;
import java.util.*;

public class Solution_BOJ_5052_전화번호목록 {

	static int t,n;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=t; tc++) {
			
			n = Integer.parseInt(br.readLine());
			
			String[] phoneNum = new String[n];
			
			for(int i=0; i<n; i++) {
				phoneNum[i] = br.readLine();
			}
			
			Arrays.sort(phoneNum);
			
			boolean flag = false;
			for(int i=0; i<n-1; i++) {
				if(phoneNum[i+1].startsWith(phoneNum[i])) flag=true;
				
			}
			
			if(flag)System.out.println("NO");
			else System.out.println("YES");
			
		}

	}

}
