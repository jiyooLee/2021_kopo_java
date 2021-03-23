package kr.ac.kopo.day12.inter01;

public class UserMain {

	public static void main(String[] args) {
		
		SamsungTV sam = new SamsungTV();
		sam.powerOn();
		sam.volumeDown();
		sam.volumeUp();
		sam.channelDown();
		sam.channelUp();
		sam.powerOff();
		
		LGTV lg = new LGTV();
		lg.turnOn();
		lg.soundDown();
		lg.soundUp();
		lg.channelDown();
		lg.channelUp();
		lg.turnOff();
		
	}
}
