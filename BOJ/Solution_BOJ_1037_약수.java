import java.util.*;
import java.io.*;

public class Solution_BOJ_1037_약수 {

	static int K, N;
	static ArrayList<Integer>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<K; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		N = list.get(0)* list.get(list.size()-1);
		System.out.println(N);
	}
	

}
