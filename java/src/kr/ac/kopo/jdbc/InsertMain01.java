package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 	JDBC 작업순서
 	1. 드라이버 로딩
 	2. DB접속 후 연결객체 얻기
 	3. SQL문 실행할 객체 얻기
 	4. SQL문 실행 및 결과 얻기
 	5. DB접속 해제
 	
 */

public class InsertMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");
			
			// 2단계 : DB 연결 후 Connnection 객체 얻기
			String url 		= "jdbc:oracle:thin:@localhost:1522:xe";
			String user 	= "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
			
			// 3단계 : SQL 실행객체 얻기
			stmt = conn.createStatement();
			String sql  = "insert into t_test(id, name) ";
				   sql += " values('hong', '홍길동') ";

			// 4단계 : SQL문 실행 및 결과 얻기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행 삽입");
				   
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}











