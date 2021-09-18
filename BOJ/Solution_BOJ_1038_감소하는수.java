import java.util.*;
import java.io.*;

public class Solution_BOJ_1038_감소하는수 {

	static int X;
	static ArrayList<Integer>list = new ArrayList<>();
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		X = Integer.parseInt(br.readLine());
		if(X>1022) {
			System.out.println(-1);
			System.exit(0);
		}
		else{
			System.out.println(Decrease(X));
		}
		
	}
	private static String Decrease(int num) {
		
		if(num<10) return String.valueOf(num);
		
		Queue<String>queue = new LinkedList<>();
		for(int i=0; i<10; i++) {
			queue.add(String.valueOf(i));
		}
		
		int result = 9;
		while(!queue.isEmpty()) {
			String str = queue.poll();
			for(int i=0; i < (str.charAt(str.length()-1)-'0'); i++) {
				queue.add(str+i);
				result++;
				if(result==X) return str+i;
			}
		}
		
		return ("-1");
		
		
	}

}
