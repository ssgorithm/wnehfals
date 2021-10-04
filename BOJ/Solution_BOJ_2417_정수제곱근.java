import java.util.*;
import java.io.*;

public class Solution_BOJ_2417_정수제곱근 {

	static long n;
	static long q;
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Long.parseLong(br.readLine());
		q = (long) Math.ceil(Math.sqrt(n));
		System.out.println(q);
	}

}

