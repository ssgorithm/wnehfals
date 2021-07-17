import java.util.*;
import java.io.*;

public class Solution_BOJ_2075_N번째큰수 {

	static int N;
	static List<Integer>num = new LinkedList<>();
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				num.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		// Comparator 사용해서 list 내림차순으로 바로 정렬
		// 배열로 따로 로직 구현할 필요 없음 
		Collections.sort(num, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				return num2-num1;
			}});
		
		System.out.println(num.get(N-1));
		

	}

}
