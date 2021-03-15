package kr.ac.kopo.day06;

// 실행클래스
public class CarMain {

	public static void main(String[] args) {
		
		Car c  = new Car();
		
		c.name = "소나타";
		c.price = 3200;
		c.company = "현대";
		
		Car c2 = new Car();
		
		c2.name = "K5";
		c2.price = 3000;
		c2.company = "기아";
		
		c = c2;
		
		System.out.println("모델명 : " + c.name 
						+ ", 가격 : " + c.price 
						+ "만원, 제조사 : " + c.company);

		System.out.println("모델명 : " + c2.name 
					+ ", 가격 : " + c2.price + "만원"
					+ ", 제조사 : " + c2.company);
		
		
		
		
	}
}
