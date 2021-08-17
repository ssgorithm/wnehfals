import java.io.*;
import java.util.*;

public class Solution_BOJ_10825_국영수 {

	static int N;
	static ArrayList<Student>list = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int korean = Integer.parseInt(st.nextToken());
			int english = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			
			list.add(new Student(name, korean, english, math));
		}
		
		Collections.sort(list);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).name);
		}
		
	}
	public static class Student implements Comparable<Student>{
		String name;
		int korean;
		int english;
		int math;
		
		public Student(String name, int korean, int english, int math) {
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}

		@Override
		public int compareTo(Student o) {
			if(this.korean==o.korean) {
				if(this.english==o.english) {
					if(this.math==o.math) {
						return this.name.compareTo(o.name);
					}
					else return o.math-this.math;
				}
				else return this.english-o.english;
			}
			return o.korean-this.korean;
		}

		
	}

}
