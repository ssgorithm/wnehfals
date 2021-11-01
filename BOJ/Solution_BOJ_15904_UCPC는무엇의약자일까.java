import java.util.*;
import java.io.*;

public class Solution_BOJ_15904_UCPC는무엇의약자일까 {

	static char[] ucpc = {'U', 'C', 'P', 'C'};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int index = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ucpc[index]) {
				index++;
			}
			if(index==4) {
				System.out.println("I love UCPC");
				System.exit(0);
			}
		}
		
		System.out.println("I hate UCPC");
	}

}
