import java.util.*;
import java.io.*;

public class Solution_BOJ_2212_센서 {

	static int N,K;
	static int[]sensor;
	static ArrayList<Integer>distance = new ArrayList<>();
	static int ans;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		
		sensor = new int [N]; 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			sensor[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sensor);
		for(int i=0; i<N-1; i++) {
			distance.add(sensor[i+1]-sensor[i]);
		}
		Collections.sort(distance,Collections.reverseOrder());
		
		for(int i=K-1; i<distance.size();i++) {
			ans+=distance.get(i);
		}
		System.out.println(ans);
		
		

	}

}
