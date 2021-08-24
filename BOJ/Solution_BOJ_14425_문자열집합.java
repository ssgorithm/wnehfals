import java.util.*;
import java.io.*;

public class Solution_BOJ_14425_문자열집합 {

	static int N, M;
	static ArrayList<String>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			list.add(br.readLine());
		}
		
		int cnt =0;
		for(int i=0; i<M; i++) {
			String word = br.readLine();
			if(list.contains(word))cnt++;
		}
		
		System.out.println(cnt);
	}

}
