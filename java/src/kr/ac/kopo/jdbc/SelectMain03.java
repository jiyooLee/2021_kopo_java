package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;

class Test implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close()...");
	}
	
}

public class SelectMain03 {

	public static void main(String[] args) {
		
		String sql = "select * from t_test ";
		try(
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("id : " + id + ", name : " + name);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}










