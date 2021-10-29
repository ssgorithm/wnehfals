import java.util.*;
import java.io.*;
public class Solution_BOJ_5635_생일 {
	static ArrayList<Student>list = new ArrayList<>();
	static int n;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			
			list.add(new Student(name,day,month,year));
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1).name);
		System.out.println(list.get(0).name);
	}
	
	public static class Student implements Comparable<Student>{
		String name;
		int day;
		int month;
		int year;
		
		public Student(String name, int day, int month, int year) {
			this.name = name;
			this.day = day;
			this.month = month;
			this.year = year;
		}

		@Override
		public int compareTo(Student o) {
			if(this.year==o.year) {
				if(this.month==o.month) return this.day-o.day;
				else return this.month-o.month;
			}
			return this.year-o.year;
		}
	}

}
