import java.util.*;
import java.io.*;

public class Solution_BOJ_16435_스네이크버드 {

	static int N,L;
	static ArrayList<Integer>fruit = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			fruit.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(fruit);
		
		for(int i=0; i<fruit.size(); i++) {
			if(L>=fruit.get(i)) L++;
			else break;
		}
		System.out.println(L);
	}

}
