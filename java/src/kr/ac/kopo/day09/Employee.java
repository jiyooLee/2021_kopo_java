package kr.ac.kopo.day09;

public class Employee {

	private  String name;
	private int salary;
	private String grade;
	private static int totalEmployee;
	
	Employee() {
		
		++Employee.totalEmployee;
	}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		
		++Employee.totalEmployee;
	}
	
	void info() {
		System.out.println("사원명 : " + name 
				+ ", 연봉 : " + salary 
				+ ", 직급 : " + grade);
		Employee.printTotalEmployee();
	}
	
	static void printTotalEmployee() {
		System.out.println("총 사원수 : " + Employee.totalEmployee + "명");
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
}












