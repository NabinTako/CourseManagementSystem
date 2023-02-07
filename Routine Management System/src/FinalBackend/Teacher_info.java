package FinalBackend;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Teacher_info {
	int dataNum;
	List<String> id = new ArrayList<>();
	List<String> userName = new ArrayList<>();
	List<String> passWord = new ArrayList<>();
	List<String> firstName = new ArrayList<>();
	List<String> Sex = new ArrayList<>();
	List<String> lastName = new ArrayList<>();
	List<String> Address = new ArrayList<>();
	List<String> phoneNumber = new ArrayList<>();
	List<String> Type = new ArrayList<>();
	List<String> ModuleAssigned = new ArrayList<>();

	
	public int getSize() {
		return firstName.size();
	}


	public String getId(int i) {
		return id.get(i);
	}
	
	public String getUserName(int i) {
		return userName.get(i);
	}

	public String getPassWord(int i) {
		return passWord.get(i);
	}
	public String getfirstName(int i) {
		return firstName.get(i);
	}

	public String getlastName(int i) {
		return lastName.get(i);
	}
	public String getSex(int i) {
		return Sex.get(i);
	}
	public String getAddress(int i) {
		return Address.get(i);
	}

	public String getType(int i) {
		return Type.get(i);
	}
	public String getPhoneNumber(int i) {
		return phoneNumber.get(i);
	}
	public String getModuleAssigned(int i) {
		return ModuleAssigned.get(i);
	}
	

	public Teacher_info() {
			try {
				String[] columnNames= {"userName","passWord"};
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/datas", "root", "");
				Statement createStatement = connection.createStatement();
				String sqlQuery = "SELECT * FROM `teacher_info`";
				ResultSet resultset = createStatement.executeQuery(sqlQuery);
				while(resultset.next()) {
					id.add(resultset.getString("id"));
					userName.add(resultset.getString("userName"));
					passWord.add(resultset.getString("passWord"));
					firstName.add(resultset.getString("First name"));
					lastName.add(resultset.getString("Last name"));
					Sex.add(resultset.getString("Sex"));
					Address.add(resultset.getString("Address"));
					phoneNumber.add(resultset.getString("phoneNumber"));
					Type.add(resultset.getString("type"));
					ModuleAssigned.add(resultset.getString("Module"));
					dataNum++;
//					System.err.println(resultset.getString("userName"));
//					System.err.println(resultset.getString("passWord"));
				}
//				for(int i=0;i<3;i++) { 
//					System.out.println(userName.get(i));
//					System.out.println(phoneNumber.get(i));
//				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public static void main(String[] args) {
		new Teacher_info();
	}
	

}
