import java.util.*;
import java.io.*;

public class Solution_BOJ_11557_YangjojangofTheYear {

	static int T, N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
	
		for(int tc = 0; tc<T; tc++) {
			N = Integer.parseInt(br.readLine());
			ArrayList<Univ>list = new ArrayList<>();
			
			for(int i=0; i<N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				int l = Integer.parseInt(st.nextToken());
				list.add(new Univ(s,l));
			}
			
			Collections.sort(list);
			System.out.println(list.get(0).name);
		}
		

	}
	
	public static class Univ implements Comparable<Univ>{
		String name;
		int liquid;
		public Univ(String name, int liquid) {
			this.name = name;
			this.liquid = liquid;
		}
		@Override
		public int compareTo(Univ o) {
			return o.liquid-this.liquid;
		}
	}

}
