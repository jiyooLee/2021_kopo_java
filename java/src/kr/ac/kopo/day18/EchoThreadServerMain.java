package kr.ac.kopo.day18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoThreadServerMain {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("EchoeThread 서버를 시작...");
			
			while(true) {
				Socket client = server.accept();
				EchoThread et = new EchoThread(client);
				et.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class EchoThread extends Thread {

	private Socket socket;
	
	public EchoThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			InetAddress client = socket.getInetAddress();
			System.out.println("client : " + client);

			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			while(true) {
				String msg = br.readLine();
				
				if(msg == null) {
					System.out.println("["+ client.getHostAddress() 
									+ "] 접속을 종료합니다");
					socket.close();
					break;
				}
				System.out.println("[" + client.getHostAddress() 
								+ "]에서 받은 메세지 : " +  msg);
				
				pw.println(msg);
				pw.flush();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}








