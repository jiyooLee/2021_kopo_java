package kr.ac.kopo.day10;

// 관리자클래스
public class Manager03 extends Employee {

	Employee[] 	empList;	// 관리사원 목록
	
	Manager03(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}
	
	@Override
	void info() {
		super.info();
		System.out.println("============================================");
		System.out.println("\t관리사원 목록");
		System.out.println("============================================");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("============================================");
	}
}











