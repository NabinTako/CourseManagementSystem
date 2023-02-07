package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DeleteInformations {

	Connection connection;
	
// to remove teacher information>>>>
	public DeleteInformations(String mobileNumber) {

		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "DELETE FROM `teacher_info` WHERE `teacher_info`.`phoneNumber` = '"+mobileNumber+"'";
			int updateSuccess = createStatement.executeUpdate(sqlQuery);
			
			check(updateSuccess);
	}catch(Exception e) {

		check(0);
		
	}

	}
	
	// to remove student information>>
	public DeleteInformations(String id,String mobileNumber) {

		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "DELETE FROM `student_info` WHERE `student_info`.`Phone Number` = '"+mobileNumber+"'";
			int updateSuccess = createStatement.executeUpdate(sqlQuery);
			
			check(updateSuccess);
	}catch(Exception e) {

		check(0);
		e.printStackTrace();
	}

	}
	
	//"DROP TABLE ` j `"
	//"DELETE FROM courses WHERE `courses`.`id` = 7"
	// to drop the course table
	public DeleteInformations(int id,String tableName) {

		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "DELETE FROM courses WHERE `courses`.`id` = "+id;
			String sqlQuery2 = "DROP TABLE `"+ tableName +"`";
			int updateSuccess = createStatement.executeUpdate(sqlQuery);
			int updateSuccess2 = createStatement.executeUpdate(sqlQuery2);
			
			if(updateSuccess>0 && updateSuccess2>0) {
				check(updateSuccess);
//			if(updateSuccess2>0) {
			check(updateSuccess2);
			}
	}catch(Exception e) {

		check(0);
		
	}

	}
	
	private void check(int i){
		if(i>=1) {
			Object[] options= {"Ok"};
			//9856352201
			//int selecterOption=
			JOptionPane.showOptionDialog(null, "Data updated!", "Success",
					JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
		}else {
			Object[] options= {"Ok"};
			JOptionPane.showOptionDialog(null, "Something Went Wrong!!", "Failed",
					JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
		}
	}

}
