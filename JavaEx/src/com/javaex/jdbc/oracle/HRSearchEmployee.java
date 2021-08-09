package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSearchEmployee {

	private static String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.print("검색어:");
		String kw = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "HR", "hr");
						
			String sql = "SELECT first_name || ' ' || last_name as name, " +
					" email, phone_number, hire_date FROM employees " +
					" WHERE lower(first_name) LIKE '%" + kw.toLowerCase() + "%' OR " +
					" lower(last_name) LIKE '%" + kw.toLowerCase() + "%'";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date");
				
				System.out.printf("이름: %s, Email: %s, 전화번호: %s, 입사일: %s%n",
						name, email, phoneNumber, hireDate);
				}
			} catch (ClassNotFoundException e) {
				System.err.println("드라이버 로드 실패!");
			} catch (SQLException e) {
				System.err.println("SQL Error!");
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			sc.close();
		}
	}


