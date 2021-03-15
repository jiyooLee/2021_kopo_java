package kr.ac.kopo.day06.homework;

public class HomeworkMain02 {

	public static void main(String[] args) {
		int[] prime = new int[30];
		int loc = 0;
		
		for(int num = 2; num <= 100; num++) {
			boolean flag = true;
			for(int i = 0; i < loc; i++) {
				if(num % prime[i] == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				prime[loc++] = num;
			}
		}
		
		for(int i = 0; i < loc; i++) {
			System.out.print(prime[i] + "\t");
			if((i+1) % 5 == 0)
				System.out.println();
		}
	}
}
