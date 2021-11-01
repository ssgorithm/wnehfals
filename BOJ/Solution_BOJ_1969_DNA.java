import java.util.*;
import java.io.*;

public class Solution_BOJ_1969_DNA {

	static int N,M;
	static int[][]arr;
	static String[] strArr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int [M][4];
		strArr = new String[N];
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			strArr[i] = str;
			
			for(int j=0; j<M; j++) {
				char c = str.charAt(j);
				if(c=='A') arr[j][0]++;
				else if(c=='C') arr[j][1]++;
				else if(c == 'G') arr[j][2]++;
				else if(c == 'T') arr[j][3]++;
			}
		}
		
		String str = "";
		for(int i=0; i<M; i++) {
			int max = Integer.MIN_VALUE;
			int cnt = 0;
			for(int j=0; j<4; j++) {
				if(max< arr[i][j]) {
					cnt=j;
					max = arr[i][j];
				}
			}
			if(cnt==0) str+="A";
			else if(cnt==1) str+="C";
			else if (cnt==2) str+="G";
			else if(cnt==3) str+="T";
		}
		int ans=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(str.charAt(j)!= strArr[i].charAt(j))ans++;
				
			}
		}
		System.out.println(str);
		System.out.println(ans);		
	}

}
