package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Std_info {

		int dataNum;
		List<String> id = new ArrayList<>();
		List<String> userName = new ArrayList<>();
		List<String> passWord = new ArrayList<>();
		List<String> firstName = new ArrayList<>();
		List<String> Sex = new ArrayList<>();
		List<String> lastName = new ArrayList<>();
		List<String> Address = new ArrayList<>();
		List<String> phoneNumber = new ArrayList<>();
		List<String> email = new ArrayList<>();
		List<String> level = new ArrayList<>();

		
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

		public String getEmail(int i) {
			return email.get(i);
		}
		public String getPhoneNumber(int i) {
			return phoneNumber.get(i);
		}
		public String getLevel(int i) {
			return level.get(i);
		}
		

		public Std_info() {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/datas", "root", "");
					Statement createStatement = connection.createStatement();
					String sqlQuery = "SELECT * FROM `student_info`";	
					ResultSet resultset = createStatement.executeQuery(sqlQuery);
					while(resultset.next()) {
						id.add(resultset.getString("id"));
						userName.add(resultset.getString("userName"));
						passWord.add(resultset.getString("passWord"));
						firstName.add(resultset.getString("First name"));
						lastName.add(resultset.getString("Last name"));
						phoneNumber.add(resultset.getString("Phone Number"));	
						Sex.add(resultset.getString("Sex"));
						Address.add(resultset.getString("Address"));
						email.add(resultset.getString("email"));
						level.add(resultset.getString("level"));
						dataNum++;
//						System.err.println(resultset.getString("userName"));
//						System.err.println(resultset.getString("passWord"));
					}
//					for(int i=0;i<3;i++) { 
//						System.out.println(userName.get(i));
//						System.out.println(phoneNumber.get(i));
//					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	}
	