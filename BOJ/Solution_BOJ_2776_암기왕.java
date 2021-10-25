import java.io.*;
import java.util.*;

public class Solution_BOJ_2776_암기왕 {

	static int T;
	static int N,M;
    
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		T = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			Set<Integer>list1 = new HashSet<>();
			
			N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				list1.add(Integer.parseInt(st.nextToken()));
			}
			
			
			M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<M; i++) {
				if(list1.contains(Integer.parseInt(st.nextToken()))) sb.append("1\n");
				else sb.append("0\n");
			}
			
		}
        System.out.println(sb);

	}

}

