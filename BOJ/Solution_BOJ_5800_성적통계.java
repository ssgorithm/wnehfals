import java.util.*;
import java.io.*;
public class Solution_BOJ_5800_성적통계 {

	static int K,N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=K; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			ArrayList<Integer>score = new ArrayList<>();
			
			int max=0; int min=0; int lGap=Integer.MIN_VALUE;
			
			for(int i=0 ;i<N; i++) {
				score.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(score,Collections.reverseOrder());
			max = score.get(0);
			min = score.get(score.size()-1);
			
			for(int i=0; i<score.size()-1; i++) {
				lGap = Math.max(lGap, score.get(i)-score.get(i+1));
			}
			
			System.out.println("Class "+t);
			System.out.println("Max "+max+", Min "+min+", Largest gap "+lGap);
		}
	}

}
