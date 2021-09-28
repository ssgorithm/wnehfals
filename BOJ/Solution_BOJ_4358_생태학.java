import java.util.*;
import java.io.*;

public class Solution_BOJ_4358_생태학 {

	static Map<String,Integer> tree = new HashMap<>();
	static int total=0;
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = "";

		//EOF처리 
		while((name = br.readLine()) != null) {
			tree.put(name, tree.getOrDefault(name, 0) + 1);
			total++;
		}
		
		Object[] keyArr = tree.keySet().toArray(); 
        Arrays.sort(keyArr); 
        
        for(int i = 0; i < keyArr.length; i++) {
        	int num = tree.get(keyArr[i]);
        	double per = ((double)num/(double)total)*100;
        	
        	System.out.print(keyArr[i]+" ");
        	System.out.printf("%.4f \n",per);
        }     		

	}

}
