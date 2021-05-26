package kr.ac.kopo.day18;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class AppClientMain {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("192.168.217.57", 10000);
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			String msg = dis.readUTF();
			System.out.println("서버에서 받은 메세지 : " + msg);
			
			socket.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
