package kr.ac.kopo.day08.homework;

public class Icecream {

	String name;
	int price;
	
	void set(String n, int p) {
		name = n;
		price = p;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	void print() {
		System.out.println(name + "\t" + price);
	}
}










