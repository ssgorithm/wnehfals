import java.util.*;
import java.io.*;

public class Solution_BOJ_10610_30 {

	static String S;
	static ArrayList<Integer>list = new ArrayList<>();
	static String ans="";
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = br.readLine();
		
		int zeroCnt=0;
		for(int i=0; i<S.length(); i++) {
			list.add(S.charAt(i)-'0');
			if(S.charAt(i)-'0'==0) zeroCnt++;
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		
		if(zeroCnt==0) ans = "-1";
		else {
			int sum=0;
			for(int i=0; i<list.size(); i++) {
				sum+=list.get(i);
			}
			
			if(sum%3!=0) ans="-1";
			else {
				for(int i=0; i<list.size();i++) {
					ans+=Integer.toString(list.get(i));
				}
			}
		}
		
		System.out.println(ans);
	}

}
