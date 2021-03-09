package kr.ac.kopo.day02;

public class IFMain {

	public static void main(String[] args) {
		
		int a = 10, b = 5;

		/*
		 * a가 b보다 크다면 a 출력
		 * a가 b보다 작다면 b 출력
		 * a와 b가  같다면 0 출력
		 */
//		System.out.println( a > b ? a : (a < b ? b : 0) );
		/*
		if(a >= b) {
			if(a == b) {
				System.out.println(0);
			} else {
				System.out.println(a);
			}
		} else {
			System.out.println(b);
		}
		*/
		
		
		if(a > b) {
			System.out.println(a);
		} else if(a < b) {
			System.out.println(b);
		} else { // a == 0
			System.out.println(0);
		}
		
		/*
		if(a > b) {
			System.out.println(a);
		} else {	// a <= b
			if(a < b) {
				System.out.println(b);
			} else {	// a == 0
				System.out.println(0);
			}	
		}
		*/
		
		
		
		/*
//		System.out.println("MAX : " + ( a > b ? a : b ));
		
		if (a > b) {
			System.out.println("MAX : " + a);
		} else {
			System.out.println("MAX : " + b);
		}
		*/
	}
}
/*
if(조건1) {
	문장1;
} else {
	if(조건2) {
		문장2;
	} else {
		if(조건3) {
			문장3;
		} else {
			if(조건4) {
				문장4;
			} else {
				if(조건5) {
					문장5;
				} else {
					문장6;
				}
			}
		}
	}
}

if(조건1) {
	문장1;
} else if(조건2) {
	문장2;
} else if(조건3) {
	문장3;
} else if(조건4) {
	문장4;
} else if(조건5) {
	문장5;
} else {
	문장6;
}
 */















