import java.util.*;
import java.io.*;

public class Soluiton_BOJ_1764_듣보잡 {

	static int N,M;
	//arraylist -> hashset으로 변경했을때 시간 감소! 
	static HashSet<String>see = new HashSet<>();
	static ArrayList<String>ans = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			see.add(br.readLine());
		}
		
		for(int i=0; i<M; i++) {
			String s = br.readLine();
			if(see.contains(s)) ans.add(s);
		}
		
		
		Collections.sort(ans);
		StringBuffer sb = new StringBuffer();
		System.out.println(ans.size());
		for(int i=0; i<ans.size(); i++) {
			sb.append(ans.get(i)+"\n");
		}
		System.out.println(sb);
		
		

	}

}
