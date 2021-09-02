import java.util.*;
import java.io.*;

public class Solution_BOJ_1475_방번호 {

	static String roomNum;
	static int num[] = new int [10];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		roomNum = br.readLine();
		
		for(int i=0; i<roomNum.length(); i++) {
			num[roomNum.charAt(i)-'0']++;
		}
		
		int set = 0;
		
		for(int i=0; i<num.length; i++) {
			if(i!=6 && i!=9) set = Math.max(set, num[i]);
		}
		float dNum = (float) ((num[6]+num[9])/2.0);
		set = Math.max(set, (int)Math.ceil(dNum));
		
		
		System.out.println(set);
		
	}

}
