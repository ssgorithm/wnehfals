import java.util.*;
import java.io.*;

public class Solution_BOJ_12904_A와B {

	static String S, T;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = br.readLine();
		T = br.readLine();
		
		MakeWord(T);
		System.out.println(0);
		
	}
	private static void MakeWord(String str) {
		
		// 종료조건 
		if(str.length()==S.length()) {
			if(str.equals(S)) {
				System.out.println(1);
				System.exit(1);
			}
			return;
		}
		
		StringBuilder sb = new StringBuilder(str);
		char c = str.charAt(str.length()-1);
		
		// 연산1 : 끝자리가 A인 경우 -> A제거 
		if(c=='A') {
			MakeWord(sb.deleteCharAt(str.length()-1).toString());
		}
		
		// 연산2 : 끝자리가 B인 경우 -> B 제거하고 역순으로 뒤집는다 
		else if(c=='B') {
			MakeWord(sb.deleteCharAt(str.length()-1).reverse().toString());
		}
		
		
		
		
	}

}
