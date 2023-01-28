package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class UpdateTableInformation {
	
	public UpdateTableInformation() {
		
	}

	public UpdateTableInformation(String Id,String Firstname, String Lastname, String Address,String Phonenumber,String type) {
//"UPDATE `teacher_info` SET `userName` = 'brook1', `passWord` = 'nice692', `First name` = 'Brook3', 
//		`Last name` = 'justBones4', `Address` = 'thousand sunny5', `phoneNumber` = '98564255306', `type` = 'Full-Time7' WHERE `teacher_info`.`id` = 1";

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "UPDATE `teacher_info` SET `First name` = '"+ Firstname+"',`Last name` = '"+ Lastname +"', `Address` = '"+ Address 
					+"', `phoneNumber` = '"+ Phonenumber +"', `type` = '"+ type +"' WHERE `teacher_info`.`id` = "+Id;
			int updateSuccess = createStatement.executeUpdate(sqlQuery);
			check(updateSuccess);
	}catch(Exception e) {

		check(0);
		
	}

}
	public UpdateTableInformation(String Username,String Password,String Firstname, String Lastname, String Address,String Phonenumber,String type) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "INSERT INTO `teacher_info` (`id`, `userName`, `passWord`, `First name`, `Last name`, `Address`, `phoneNumber`, `type`)"+
			" VALUES (NULL,'"+Username+"','"+Password +"', '"+Firstname+"', '"+Lastname+"','"+Address+"', '"+Phonenumber+"', '"+type+"')";
			int updateSuccess = createStatement.executeUpdate(sqlQuery);
//			int updateSuccess = createStatement.executeUpdate(sqlQuery);
			check(updateSuccess);
		
	}catch(Exception e) {

		check(0);
		
	}
		
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
