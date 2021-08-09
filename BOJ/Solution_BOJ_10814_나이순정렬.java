import java.util.*;
import java.io.*;

public class Solution_BOJ_10814_나이순정렬 {

	static int N;
	static ArrayList<Member>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			list.add(new Member(age,name,i));
		}
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).age+" "+list.get(i).name);
		}
		

	}
	
	public static class Member implements Comparable<Member>{
		int age;
		String name;
		int index;
		
		public Member(int age, String name, int index) {
			this.age = age;
			this.name = name;
			this.index = index;
		}

		@Override
		public int compareTo(Member o) {
			if(o.age==this.age) {
				return this.index-o.index;
			}
			return this.age-o.age;
		}

		
		

		

		
	}

}
