package kr.ac.kopo.day09;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.printTotalEmployee();
		
		Employee e = new Employee("홍길동", 3200, "사원");
		e.info();
		
		
		Employee e2 = new Employee("강길동", 4000, "주임");
		e2.info();

		Employee e3 = new Employee("윤길동", 3600, "사원");
		e3.info();
				
		Employee.printTotalEmployee();
		
		System.out.println("첫번째 사원명 : " + e.getName());
		System.out.println("두번째 사원명 : " + e2.getName());
		
		e.setSalary(3800);
	}
}













