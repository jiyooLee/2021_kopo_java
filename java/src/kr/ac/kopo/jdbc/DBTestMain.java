package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
	
		try {
			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");
			
			// 2단계 : DB 접속 및 연결객체 얻기
			Connection conn = DriverManager.getConnection(
									"jdbc:oracle:thin:@localhost:1522:xe",
									"hr", 
									"hr");
			System.out.println("DB 접속 성공 : " + conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}










