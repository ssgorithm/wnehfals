import java.util.*;
import java.io.*;

public class Solution_BOJ_11656_접미사배열 {

	static String word;
	static ArrayList<String>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		word = br.readLine();
		
		for(int i=0; i<word.length(); i++) {
			list.add(word.substring(i,word.length()));
		}

		Collections.sort(list);
	
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
