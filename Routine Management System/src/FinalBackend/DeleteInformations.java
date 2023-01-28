package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DeleteInformations {

	public DeleteInformations(String mobileNumber) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "DELETE FROM `teacher_info` WHERE `teacher_info`.`phoneNumber` = '"+mobileNumber+"'";
			int updateSuccess = createStatement.executeUpdate(sqlQuery);
			if(updateSuccess>=1) {
				Object[] options= {"Ok"};
				//9856352201
				//int selecterOption=
				JOptionPane.showOptionDialog(null, "Data updated!", "Success",
						JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
			}
		
	}catch(Exception e) {

		Object[] options= {"Ok"};
		JOptionPane.showOptionDialog(null, "Something Went Wrong!!", "Failed",
				JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
		
	}

	}

}
