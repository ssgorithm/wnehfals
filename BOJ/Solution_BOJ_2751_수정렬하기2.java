import java.util.*;
import java.io.*;

public class Solution_BOJ_2751_수정렬하기2 {

	static int N;
	static ArrayList<Integer>list = new ArrayList<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i));
			sb.append("\n");
		}
		
		System.out.println(sb);
		

	}
}
