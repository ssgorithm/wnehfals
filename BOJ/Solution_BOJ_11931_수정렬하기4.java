import java.util.*;
import java.io.*;
public class Solution_BOJ_11931_수정렬하기4 {

	static int N;
	static ArrayList<Integer>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list,Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i)+"\n");
			
		}
		System.out.println(sb);

	}

}
