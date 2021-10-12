import java.util.*;
import java.io.*;

public class Solution_BOJ_1431_시리얼번호 {

	static int N;
	static ArrayList<Number>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			list.add(new Number(str));
		}
		
		Collections.sort(list);

		for(int i=0; i<N; i++) {
			System.out.println(list.get(i).serialNum);
		}
	}

	public static class Number implements Comparable<Number>{
		String serialNum;

		public Number(String serialNum) {
			this.serialNum = serialNum;
		}

		@Override
		public int compareTo(Number o) {
			if(this.serialNum.length()==o.serialNum.length()) {
				int thisCnt=0;
				int oCnt=0;
				
				for(int i=0; i<this.serialNum.length();i++) {
					int n = this.serialNum.charAt(i)-'0';
					if(n<10) thisCnt+=n;
					else continue;
				}
				
				for(int i=0; i<o.serialNum.length();i++) {
					int n = o.serialNum.charAt(i)-'0';
					if(n<10) oCnt+=n;
					else continue;
				}
				 
				 if(thisCnt==oCnt) {
					return this.serialNum.compareTo(o.serialNum);
				 }
				 else return thisCnt-oCnt;
				
			}
			return this.serialNum.length()-o.serialNum.length();
		}

	}
}
