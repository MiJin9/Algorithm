import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Student[] s = new Student[N];
		
		for(int i=0; i<N; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			s[i] = new Student(name, kor, eng, math);
		}
			
			Arrays.sort(s, new Comparator<Student>(){
				public int compare(Student o1, Student o2) {
					if(o1.kor!=o2.kor)
						return o2.kor - o1.kor;
					if(o1.eng!=o2.eng)
						return o1.eng - o2.eng;
					if(o1.math!=o2.math)
						return o2.math - o1.math;
					return o1.name.compareTo(o2.name);
				}
			});
			for(int i=0; i<N; i++) {
				System.out.println(s[i].name);
		}
	}
}

class Student{
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student() {}
}