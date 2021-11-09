import java.util.*;
import java.io.*;

public class Solution_BOJ_2535_아시아정보올림피아드 {

	static int N;
	static ArrayList<Student>list = new ArrayList<>();
	static int countryArr[] = new int [101];
	static Set<Integer>ans = new HashSet<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int country = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			int score = Integer.parseInt(st.nextToken());
			
			list.add(new Student(country,num,score));
		}
		
		Collections.sort(list);
		
		
		int cnt=0;
		for(int i=0; i<list.size(); i++) {
			if(cnt==3)break;
			int cur = list.get(i).country;
			if(countryArr[cur]>=2)continue;
			else {
				System.out.println(list.get(i).country+" "+list.get(i).num);
				countryArr[cur]++;
				cnt++;
			}
		}	

	}

	public static class Student implements Comparable<Student>{
		int country;
		int num;
		int score;
		
		public Student(int country, int num, int score) {
			this.country = country;
			this.num = num;
			this.score = score;
		}

		@Override
		public int compareTo(Student o) {
			
			return o.score-this.score;
		}
	}
}
