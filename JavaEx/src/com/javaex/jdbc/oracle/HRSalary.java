package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSalary {
	
	private static String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		int minSal = sc.nextInt();
		int maxSal = sc.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "HR", "hr");
			
			String sql = "SELECT first_name || ' ' || last_name as name, salary " +
						" FROM employees " +
						" WHERE salary BETWEEN " + minSal + " AND " + maxSal +
						" ORDER BY salary";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String name = rs.getString(1);
				int salary = rs.getInt(2);
				
				System.out.printf("%s, %d%n", name, salary);
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
