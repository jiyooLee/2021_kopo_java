package kr.ac.kopo.day12.inter02;

public class SamsungTV implements TV {

	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteToggle;
	private int currentVolumeSize;
	
	public SamsungTV() {
		System.out.println("삼성TV 구매완료...");
		modelName = "삼성TV";
		power = false;
		volumeSize = 10;
		channelNo = 3;
		muteToggle = false;
	}
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("TV ON");
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("TV OFF");
	}

	@Override
	public void channelUp() {
		System.out.println("CHANNEL UP");
		channelNo = ++channelNo % 100;
		info();
	}

	@Override
	public void channelDown() {
		System.out.println("CHANNEL DOWN");
		channelNo--;
		if(channelNo == 0)
			channelNo = 100;
		info();
	}

	@Override
	public void soundUp() {
		System.out.println("VOLUME UP");
		
		if(muteToggle) {
			volumeSize = currentVolumeSize;
			muteToggle = false;
		}
		
		if(volumeSize < TV.MAX_VOLUME_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("VOLUME DOWN");
		if(volumeSize > TV.MIN_VOLUME_SIZE)
			volumeSize--;
		info();
		
	}

	@Override
	public void mute() {
		
		if(muteToggle) {
			System.out.println("음소거 해제");
			volumeSize = currentVolumeSize;
		} else {
			System.out.println("음소거 중...");
			currentVolumeSize = volumeSize;
			volumeSize = TV.MIN_VOLUME_SIZE;
		}
		muteToggle = !muteToggle;
		
//		System.out.println("MUTE");
//		volumeSize = TV.MIN_VOLUME_SIZE;
		
		info();
	}
	
	private void info() {
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}

}










