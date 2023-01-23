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

	List<String> userName = new ArrayList<>();
	List<String> passWord = new ArrayList<>();

	public String getUserName(int i) {
		return userName.get(i);
	}

	public String getPassWord(int i) {
		return passWord.get(i);
	}
	

	public admin_info() {
			try {
				String[] columnNames= {"userName","passWord"};
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/login_data", "root", "");
				Statement createStatement = connection.createStatement();
				String sqlQuery = "SELECT * FROM `admin_info`";
				ResultSet resultset = createStatement.executeQuery(sqlQuery);
				for(int j=0;j<2;j++) {
					resultset.next();
				for(int i=0;i<2;i++) {
					if(i%2==0) {
					userName.add(resultset.getString(columnNames[i]));
					}else {
					passWord.add(resultset.getString(columnNames[i]));
					}
				}
				}
//				for(int i=0;i<2;i++) { 
//					System.out.println(userName.get(i));
//					System.out.println(passWord.get(i));
//				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public static void main(String[] args) {
		new admin_info();
	}
	
	public void a() {
		
	}

}
