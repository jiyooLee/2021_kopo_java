package kr.ac.kopo.day06;

public class HandphoneMain02 {

	public static void main(String[] args) {
		
		Handphone[] hpArr = new Handphone[] {
									new Handphone(), 
									new Handphone(), 
									new Handphone()};
		
		hpArr[0].name = "홍길동";
		hpArr[0].phone = "010-1111-2222";
		hpArr[0].company = "삼성";
		
		hpArr[1].name = "윤길동";
		hpArr[1].phone = "010-3333-4444";
		hpArr[1].company = "애플";
		
		hpArr[2].name = "한길동";
		hpArr[2].phone = "010-5555-6666";
		hpArr[2].company = "엘지";
		
		for(Handphone hp : hpArr) {
			System.out.println("소유주명 : " + hp.name
						+ ", 전화번호 : " + hp.phone
						+ ", 제조사 : " + hp.company);
		}
		
	}
}













