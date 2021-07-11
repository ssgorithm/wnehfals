import java.io.*;
import java.util.*;

public class Solution_BOJ_1107_리모컨 {

	static int n,m;
	static LinkedList<Integer>brokenNum =  new LinkedList<>();
	static int ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		// 고장난 버튼이 1개 이상 있는 경우 
		if(m!=0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<m; i++){
				brokenNum.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		// 시작 채널에서 +,- 만을 사용하여 이동하는 경우 
		ans = Math.abs(n -100);
		
		// 가장 가까운 채널을 먼저 누르고 +,- 로 이동하는 경우 
		// 9를 제외하고 모든 버튼이 고장난 경우를 고려해줘야 함 -> 최댓값 : 999999
		for(int i=0 ; i<1000000; i++) {
			remoteControl(i);
		}
		System.out.println(ans);

	}
	private static boolean remoteControl(int num) {
		
		String channel = String.valueOf(num);
		
		// 고장난 버튼이 있는 경우 
		if(m !=0) {
			// 해당 채널에 고장난 버튼이 포함되어 있는가 확인 
			for(int i=0 ;i<channel.length();i++ ) {
				if(brokenNum.contains(channel.charAt(i)-'0')) return false;
			}
		}		
		
		ans = Math.min(ans,channel.length()+Math.abs(num-n));
		return true;
		
	}

}
