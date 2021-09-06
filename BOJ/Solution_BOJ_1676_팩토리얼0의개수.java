import java.util.*;
import java.io.*;

public class Solution_BOJ_1676_팩토리얼0의개수 {

	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		if(N==0) {
			System.out.println(0); 
			System.exit(0);
		}
		
		int ans = (N/5)+(N/25)+(N/125);
		System.out.println(ans);
		}
	

}
