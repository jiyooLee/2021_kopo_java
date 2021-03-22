package kr.ac.kopo.day11.abs02;

public abstract class HPPrinter extends Printer {
}

class HPLaserPrinter extends HPPrinter {

	@Override
	public void print() {
		System.out.println("HP레이저프린터에서 출력중...");
	}
 	
}

class HPInkjetPrinter extends HPPrinter {

	@Override
	public void print() {
		System.out.println("HP잉크젯프린터에서 출력중...");
	}
	
}
