import java.util.*;
import java.io.*;

public class Solution_BOJ_1181_단어정렬 {

	static int N;
	static String[] words;
	static LinkedList<String> ans = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		words = new String [N];
		
		
		for(int i=0;i<N;i++) {
			words[i] = br.readLine();
		}
		
		Arrays.sort(words, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length()==o2.length()) return o1.compareTo(o2);
				else return o1.length()-o2.length();
			}
			
		});
		
		for(int i=0; i<N; i++) {
			if(!ans.contains(words[i])) ans.add(words[i]);
		}
		while(!ans.isEmpty()) {
			System.out.println(ans.poll());
		}
		
		

		
		
	}
	
	
	
}




