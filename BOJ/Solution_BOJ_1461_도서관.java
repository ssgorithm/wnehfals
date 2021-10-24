import java.util.*;
import java.io.*;

public class Solution_BOJ_1461_도서관 {

	static int N,M;
	static ArrayList<Integer>plusBook = new ArrayList<>();
	static ArrayList<Integer>minusBook = new ArrayList<>();
	static int ans;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int book = Integer.parseInt(st.nextToken());
			if(book<0) minusBook.add(book);
			else plusBook.add(book);
		}
		Collections.sort(minusBook);
		Collections.sort(plusBook);
		
		// 음수 좌표의 책 
		for(int i=0; i<minusBook.size(); i+=M) {
			ans+=Math.abs(minusBook.get(i)*2);
		}
		
		// 양수 좌표의 책 
		for(int i=plusBook.size()-1; i>=0; i-=M) {
			ans+=Math.abs(plusBook.get(i)*2);
		}
		
		// 마지막에 둘 책 선정 
		if(!minusBook.isEmpty() && !plusBook.isEmpty()) {
			ans-= Math.max(Math.abs(minusBook.get(0)), plusBook.get(plusBook.size()-1));
		}
		else if(minusBook.isEmpty() && !plusBook.isEmpty()) {
			ans-= plusBook.get(plusBook.size()-1);
		}
		else if(!minusBook.isEmpty() && plusBook.isEmpty()) {
			ans-= Math.abs(minusBook.get(0));
		}
		
		System.out.println(ans);
	}

}
