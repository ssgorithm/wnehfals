import java.util.*;
import java.io.*;

public class Solution_BOJ_17219_비밀번호찾기 {
	static Map<String, String>password = new HashMap<>();
	static int N,M;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String url = st.nextToken();
			String pw = st.nextToken();
			password.put(url, pw);
		}
		
		for(int i=0; i<M; i++) {
			String s = br.readLine();
			System.out.println(password.get(s));
		}
	}

}
