package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class courses_information {
	List<String> id = new ArrayList<>();
	List<String> courseName = new ArrayList<>();
	List<String> courseYear = new ArrayList<>();
	int dataNum=0;


	public String getCourseName(int i) {
		return courseName.get(i);
	}
	public String getId(int i) {
		return id.get(i);
	}
	public String getCourseYear(int i) {
		return courseYear.get(i);
	}
	public int getDataNum() {
		return dataNum;
	}
	
	
	public courses_information(String Name,String year) {
//		// TODO Auto-generated constructor stub
//		//
//		//INSERT INTO `courses` (`id`, `courseName`, `courseYear`) VALUES (NULL, 'bit', '3'), (NULL, 'bibm', '3');
//	
	try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
		Statement createStatement = connection.createStatement();
		String sqlQuery = "INSERT INTO `courses` (`id`, `courseName`, `courseYear`) VALUES (NULL,'"+Name+"', '"+year+"')";
		int updateSuccess = createStatement.executeUpdate(sqlQuery);
		check(updateSuccess);
	}catch(Exception e) {

	check(0);
	e.printStackTrace();
	
	}
	}
	public courses_information() {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "SELECT * FROM `courses`";
			ResultSet resultset = createStatement.executeQuery(sqlQuery);
			while(resultset.next()) {
				id.add(resultset.getString("id"));
				courseName.add(resultset.getString("courseName"));
				courseYear.add(resultset.getString("courseYear"));
				dataNum++;
//				System.err.println(resultset.getString("courseName"));
//				System.err.println(resultset.getString("courseYear"));
			}
		
	}catch(Exception e) {

	}

	}
	
	public static void main(String[] args) {
		new courses_information();
	}
	
	private static void check(int updateSucess) {
		if(updateSucess>=1) {
			Object[] options= {"Ok"};
			//int selecterOption=
//			JOptionPane.showMessageDialog(JOptionPane, "Data is updated!!");
			JOptionPane.showOptionDialog(null, "Data updated!", "Success",
					JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
		}else {
			Object[] options= {"Ok"};
			JOptionPane.showOptionDialog(null, "Something Went Wrong!!", "Failed",
					JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
		}
	}

}
