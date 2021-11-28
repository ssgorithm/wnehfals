import java.util.*;
import java.io.*;

public class Solution_BOJ_11687_팩토리얼0의개수 {

	static int M;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		M = Integer.parseInt(br.readLine());
		
		int sum =0;
		for(int i=1; i<100000000; i++) {
			int num = i;
			int cnt = 1;
			
			while(num%5==0){
				cnt++;
				num /= 5;
			}
			
			sum+=cnt;
			if(sum == M) {
				System.out.println(5*i);
				return;
			}
			else if(sum > M) {
				System.out.println(-1);
				return;
			}
		}
	

	}

}
