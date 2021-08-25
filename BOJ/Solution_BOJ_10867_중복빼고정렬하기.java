import java.io.*;
import java.util.*;

public class Solution_BOJ_10867_중복빼고정렬하기 {

	static int N;
	static ArrayList<Integer>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(!list.contains(num)) list.add(num);
		}
		
		Collections.sort(list);
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
