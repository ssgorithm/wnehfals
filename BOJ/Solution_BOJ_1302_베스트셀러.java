import java.util.*;
import java.io.*;

public class Solution_BOJ_1302_베스트셀러 {

	static int N;
	static Map<String,Integer>word = new HashMap<>();
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			if(word.containsKey(s)) {
				word.replace(s, word.get(s)+1);
			}
			else word.put(s, 1);
		}
		
		
		for(String s: word.keySet()) {
			max = Math.max(max, word.get(s));
		}
		
		 ArrayList<String>list = new ArrayList<>(word.keySet());
		 Collections.sort(list);
		 for(int i=0 ;i<list.size();i++) {
			 if(word.get(list.get(i))==max) {
				 System.out.println(list.get(i));
				 break;
			 }
		 }




	}

}
