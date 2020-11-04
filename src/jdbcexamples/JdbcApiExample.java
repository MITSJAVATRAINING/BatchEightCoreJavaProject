package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcApiExample {

	public static void main(String args[]) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			con.setAutoCommit(false);
			String query = "insert into employee values(?,?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, 37);
			pstmt.setString(2, "p");
			pstmt.setString(3, "p");
			pstmt.setInt(4, 3);
			pstmt.setInt(5, 100);
			
			pstmt.addBatch();
			
			pstmt.setInt(1, 38);
			pstmt.setString(2, "q");
			pstmt.setString(3, "q");
			pstmt.setInt(4, 4);
			pstmt.setInt(5, 200);
			
			pstmt.addBatch();
			
			pstmt.setInt(1, 39);
			pstmt.setString(2, "r");
			pstmt.setString(3, "r");
			pstmt.setInt(4, 5);
			pstmt.setInt(5, 100);
			
			pstmt.addBatch();
			
			pstmt.executeBatch();
			con.commit();
			
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(query);
//			List<Employee> employeeList = new ArrayList<Employee>();
//			while (rs.next()) {
//				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
//				employeeList.add(emp);
//				System.out.println(rs.getInt("EMPLOYEE_ID") + "  --> " + rs.getString("FIRST_NAME") + "  --> " + rs.getString(3) + "  --> " + rs.getInt(4) + "  --> " + rs.getInt(5));
//			}
			
			//System.out.println("Size of list is "+ employeeList.size());
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
