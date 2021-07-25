import java.util.*;
import java.io.*;

public class Solution_BOJ_1339_단어수학 {

	static int n;
	static ArrayList<Character>list = new ArrayList<>();
	static String[]word;
	static int[]alphabet = new int[45];
	
	static int[] result;
	static boolean[]visit = new boolean [10];
	
	static int ans;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		word = new String[n];
		
		
		for(int i=0; i<n; i++) {
			word[i] = br.readLine();
			for(int j=0; j<word[i].length();j++) {
				if(!list.contains(word[i].charAt(j))) list.add(word[i].charAt(j));
			}
		}
		
		result = new int[list.size()];
		Permutation(0);
		System.out.println(ans);
	}
	private static void Permutation(int cnt) {
		if(cnt==result.length) {
			
			
			int sum=0;
			
			for(int i=0; i<word.length; i++) {
				int num=0;
				for(int j=0; j<word[i].length(); j++) {
					num*=10;
					num+=result[list.indexOf(word[i].charAt(j))];
				}
				sum+=num;
				
			}
			ans = Math.max(ans, sum);
			
			return;
		}
		
		for(int i=0; i<10; i++) {
			if(visit[i])continue;
			visit[i] = true;
			result[cnt] = i;
			Permutation(cnt+1);
			visit[i]=false;
		}
		
	}

}
