package kr.ac.kopo.day12.inter02;

public class LGTV implements TV {

	public LGTV() {
		System.out.println("LG TV를 구매하였습니다");
	}
	
	@Override
	public void powerOn() {
		System.out.println("TV 전원을 켭니다");
	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원을 끕니다");
	}

	@Override
	public void channelUp() {
		System.out.println("채널번호를 올립니다");
	}

	@Override
	public void channelDown() {
		System.out.println("채널번호를 내립니다");
	}

	@Override
	public void soundUp() {
		System.out.println("음량을 높입니다");
	}

	@Override
	public void soundDown() {
		System.out.println("음량을 내립니다");
	}

	@Override
	public void mute() {
		System.out.println("음소거중입니다");
	}

}
