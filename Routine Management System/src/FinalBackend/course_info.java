package FinalBackend;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class course_info {

	List<String> id = new ArrayList<>();
	List<String> moduleName = new ArrayList<>();
	List<String> moduleNumber = new ArrayList<>();
	List<String> Semester = new ArrayList<>();
	List<String> level = new ArrayList<>();
	List<String> credit = new ArrayList<>();
	List<String> type = new ArrayList<>();
	
	
	// GET arrays >>>>>>>>>>>>>>>>>>>>>

	public List<String> getModule() {
		return moduleName;
	}

	
	
	
	//get array data >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public String getId(int i) {
		return id.get(i);
	}

	public String getModule(int i) {
		return moduleName.get(i);
	}
	public String getModuleNumber(int i) {
		return moduleNumber.get(i);
	}

	public String getSemester(int i) {
		return Semester.get(i);
	}

	public String getLevel(int i) {
		return level.get(i);
	}
	public String getType(int i) {
		return type.get(i);
	}
	public String GetCredit(int i) {
		return credit.get(i);
	}
	

	public course_info(String name) {
			try {
				name =name.toLowerCase();
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
				Statement createStatement = connection.createStatement();
				String sqlQuery = "SELECT * FROM "+name;
				ResultSet resultset = createStatement.executeQuery(sqlQuery);
				while(resultset.next()) {
					id.add(resultset.getString("id"));
					moduleName.add(resultset.getString("Module Name"));
					moduleNumber.add(resultset.getString("Module Number"));
					Semester.add(resultset.getString("Semester"));
					level.add(resultset.getString("Level"));
					credit.add(resultset.getString("Credit"));
					type.add(resultset.getString("type"));
				}
				
//				for(int i=0;i<2;i++) { 
//					System.out.println(userName.get(i));
//					System.out.println(passWord.get(i));
//				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.err.println("Cannot fetch the data!!");
			}
			
	}
	


	public static void main(String[] args) {
		new course_info("bit");
	}
	
	public void a() {
		
	}

}
