package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSearchEmployeePstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색어:");
		String kw = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "HR", "hr");
			
			//	실행계획
			String sql = "SELECT first_name || ' ' || last_name as name, "
					+ " email, phone_number, hire_date "
					+ " FROM employees "
					+ " WHERE lower(first_name) LIKE ? OR "
					+ " lower(last_name) LIKE ?";	//	 ? -> %kw.toLowerCase()%
			
			//	준비
			pstmt = conn.prepareStatement(sql);
			//	파라미터 세팅
			pstmt.setString(1, "%" + kw.toLowerCase() + "%");
			pstmt.setString(2, "%" + kw.toLowerCase() + "%");	
			
			//	실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString(1);
				String email = rs.getString(2);
				String phoneNumber = rs.getString(3);
				String hireDate = rs.getString(4);
				System.out.printf("%s: %s, %s, %s%n", name, email, phoneNumber, hireDate);
				}
			} catch (ClassNotFoundException e) {
					System.err.println("드라이버 로드 실패!");
			} catch (SQLException e) {
					e.printStackTrace();
			} finally {
				try {
					rs.close();
					pstmt.close();
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
