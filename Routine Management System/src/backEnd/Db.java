package backEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

	public Db() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/login_data", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "SELECT * FROM `student_info`";
			ResultSet resultset = createStatement.executeQuery(sqlQuery);
			resultset.next();
			System.out.println(resultset.getString("email"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Db();
	}

}
