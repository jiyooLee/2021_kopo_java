package kr.ac.kopo.day04.exam;
/*
 	 	----*----
 		---***---
   		--*****--
 		-*******-
 		*********
 		-*******
    	--*****
 		---***
 		----*
 */
public class ExamMaIn02 {

	public static void main(String[] args) {
		int space = 4;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= space || j >= 10-space) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
			if(i < 5) {
				space--;
			} else {
				space++;
			}
		}
		
		/*
		int n = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 5-n; j++) {
				System.out.print('-');
			}
			for(int j = 1; j <= 2*n-1; j++) {
				System.out.print('*');
			}
			System.out.println();
			
			if(i < 5) {
				n++;
			} else {
				n--;
			}
		}
		*/
	}
}







