package org.java_SummerStudy;

class Student {
	String name;
	int ban, no, kor, eng, math;

	void info(String name,int ban, int no, int kor, int eng, int math) {
		int sum = kor + eng + math;
		double avg = Math.round((sum/3*10)/10.0);
		System.out.println(name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math);
		System.out.println(sum + ", " + avg);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.info("홍길동",1,1,100,60,76);
	}
}