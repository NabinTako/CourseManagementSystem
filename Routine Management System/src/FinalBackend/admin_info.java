package FinalBackend;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class admin_info {
	private int dataNum;
	List<String> userName = new ArrayList<>();
	List<String> passWord = new ArrayList<>();

	public String getUserName(int i) {
		return userName.get(i);
	}

	public String getPassWord(int i) {
		return passWord.get(i);
	}
	
	public int getDtaNumber() {
		return dataNum;
	}
	

	public admin_info() {
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/datas", "root", "");
				Statement createStatement = connection.createStatement();
				String sqlQuery = "SELECT * FROM `admin_info`";
				ResultSet resultset = createStatement.executeQuery(sqlQuery);
				while(resultset.next()) {
					userName.add(resultset.getString("userName"));
					passWord.add(resultset.getString("passWord"));
					dataNum++;
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
//	public static void main(String[] args) {
//		new admin_info();
//	}
	
}
