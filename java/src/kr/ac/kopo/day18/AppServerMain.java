package kr.ac.kopo.day18;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(10000);
			System.out.println("어플리케이션 서버 실행...");
			
			Socket client = server.accept();
			System.out.println("연결된 클라이언트 정보 : " + client);
			
			String msg = "접속을 환영합니다";
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF(msg);
			dos.flush();
			
			client.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}





