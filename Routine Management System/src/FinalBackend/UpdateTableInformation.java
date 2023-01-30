package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class UpdateTableInformation {
	Connection connection;
	
	public UpdateTableInformation() {
		
	}
	
// To update teacher informations >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public UpdateTableInformation(String Id,String Username,String Password,String Firstname, String Lastname,String Sex, String Address,String Phonenumber,String type,String ModuleAssigned) {
//"UPDATE `teacher_info` SET `userName` = 'brook1', `passWord` = 'nice692', `First name` = 'Brook3', 
//		`Last name` = 'justBones4', `Address` = 'thousand sunny5', `phoneNumber` = '98564255306', `type` = 'Full-Time7' WHERE `teacher_info`.`id` = 1";

		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "UPDATE `teacher_info` SET `userName`= '"+Username+"', `passWord`= '"+ Password +"',`First name` = '"+ Firstname+"',`Last name` = '"+ Lastname +"',`Sex` = '"+Sex+"', `Address` = '"+ Address 
					+"', `phoneNumber` = '"+ Phonenumber +"', `type` = '"+ type+"', `Module` = '"+ModuleAssigned +"' WHERE `teacher_info`.`id` = "+Id;
			int updateSuccess = createStatement.executeUpdate(sqlQuery);
			check(updateSuccess);
	}catch(Exception e) {

		check(0);
//		e.printStackTrace();
		
	}

}
	
	// To add teacher in the teacher table >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public UpdateTableInformation(String Username,String Password,String Firstname, String Lastname,String Sex, String Address,String Phonenumber,String type,String ModuleAssigned) {
		
	
//			Connection connection;
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			
			Statement createStatement = connection.createStatement();
			String sqlQuery = "INSERT INTO `teacher_info` (`id`, `userName`, `passWord`, `First name`, `Last name`, `Sex` ,`Address`, `phoneNumber`, `type`,`Module`)"+
			" VALUES (NULL,'"+Username+"','"+Password +"', '"+Firstname+"', '"+Lastname+"','"+Sex+"','"+Address+"', '"+Phonenumber+"', '"+type+"','"+ModuleAssigned+"')";
			int updateSuccess = createStatement.executeUpdate(sqlQuery);
//			int updateSuccess = createStatement.executeUpdate(sqlQuery);
			check(updateSuccess);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				check(0);
//				e.printStackTrace();
			}

		
	}
	
	
	// To make a separate table for the course>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	//CREATE TABLE `datas`.`bibm1` (`id` INT NOT NULL AUTO_INCREMENT , `Module Name` VARCHAR(150) NOT NULL , `Module Number` VARCHAR(150) NOT NULL , `Semester` VARCHAR(30) NOT NULL , 
	// `Level` VARCHAR(30) NOT NULL , `Credit` VARCHAR(40) NOT NULL , `type` VARCHAR(30) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;
	public UpdateTableInformation(String Name) {
		
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
		
		Statement createStatement = connection.createStatement();
		String sqlQuery ="CREATE TABLE `datas`.`"+Name+"` (`id` INT NOT NULL AUTO_INCREMENT , `Module Name` VARCHAR(150) NOT NULL , `Module Number` VARCHAR(150) NOT NULL , `Semester` VARCHAR(30) NOT NULL , "
				+ " `Level` VARCHAR(30) NOT NULL , `Credit` VARCHAR(40) NOT NULL , `type` VARCHAR(30) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB";
		createStatement.executeUpdate(sqlQuery);
//		int updateSuccess = createStatement.executeUpdate(sqlQuery);
		check(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			check(0);
			e.printStackTrace();
		}

	
}
	
	// to add module in the course table >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//	
public UpdateTableInformation(String TableName,String moduleName,String moduleNumber,String Semester,String Level, String Credit, String type) {
		
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
		
		Statement createStatement = connection.createStatement();
		String sqlQuery ="INSERT INTO `"+ TableName +"` (`id`, `Module Name`, `Module Number`, `Semester`, `Level`, `Credit`, `type`)"
				+ "VALUES (NULL, '"+ moduleName+"', '" + moduleNumber+ "', '"+ Semester +"', '"+ Level +"', '"+ Credit +"', '"+ type +"')";
		int executeUpdate = createStatement.executeUpdate(sqlQuery);
//		int updateSuccess = createStatement.executeUpdate(sqlQuery);
		check(executeUpdate);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			check(0);
			e.printStackTrace();
		}

	
	}

// TO update Module in table >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

public UpdateTableInformation(String id,String TableName,String moduleName,String moduleNumber,String Semester,String Level, String Credit, String type) {
	
	
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
	
	Statement createStatement = connection.createStatement();
//	UPDATE `d` SET `Module Name` = 's as', `Module Number` = 'ss', `Semester` = 'nulls', `Level` = 'nulls', `Credit` = 's', `type` = 'nulls' WHERE `d`.`id` = 3
	String sqlQuery ="UPDATE `"+ TableName +"` SET `Module Name`= '"+moduleName+"', `Module Number` = '"+moduleNumber+"', `Semester` = '"+Semester
			+ "',`Level` = '"+Level+"', `Credit` = '"+Credit+"', `type` = '"+type+"' WHERE `"+ TableName +"`.`id` = "+id+"";
	int executeUpdate = createStatement.executeUpdate(sqlQuery);
//	int updateSuccess = createStatement.executeUpdate(sqlQuery);
	check(executeUpdate);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		check(0);
		e.printStackTrace();
	}


}
public UpdateTableInformation(int id,String Username,String Password,String Firstname, String Lastname,String Phonenumber,String Sex, String Address,String email,String level) {
//INSERT INTO `student_info` (`id`, `userName`, `passWord`, `First name`, `Last name`, `Phone number`, `sex`, `address`, `email`, `level`) VALUES (NULL, 'na', 'mi', 'jdsakl', 'shdkja', 'asd', 'hdsakj', 'hsajkdhak', 'sdahkjdh', 'dskjahdkaj')
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
	
	Statement createStatement = connection.createStatement();
//	UPDATE `d` SET `Module Name` = 's as', `Module Number` = 'ss', `Semester` = 'nulls', `Level` = 'nulls', `Credit` = 's', `type` = 'nulls' WHERE `d`.`id` = 3
	String sqlQuery ="INSERT INTO `student_info` (`id`, `userName`, `passWord`, `First name`, `Last name`, `Phone number`, `sex`, `address`, `email`, `level`) VALUES "
			+ "(NULL, '"+Username+"', '"+Password+"', '"+Firstname+"', '"+Lastname+"', '"+Phonenumber+"', '"+Sex+"', '"+Address+"', '"+email+"', '"+ level +"')";
	int executeUpdate = createStatement.executeUpdate(sqlQuery);
//	int updateSuccess = createStatement.executeUpdate(sqlQuery);
	check(executeUpdate);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		check(0);
		e.printStackTrace();
	}

}


//UPDATE `student_info` SET `userName` = 'nas', `passWord` = 'mid', `First name` = 'jdsakl2', `Last name` = 'shdkjad', `Phone number` = 'asds', `sex` = 'hdsakjs', `address` = 'hsajkdhaks', `email` = 'sdahkjdhs', `level` = 'dskjahdkajs' WHERE `student_info`.`id` = 2
public UpdateTableInformation(String id,String Username,String Password,String Firstname, String Lastname,String Phonenumber,String Sex, String Address,String email,String level,String l) {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
		
		Statement createStatement = connection.createStatement();
//		UPDATE `d` SET `Module Name` = 's as', `Module Number` = 'ss', `Semester` = 'nulls', `Level` = 'nulls', `Credit` = 's', `type` = 'nulls' WHERE `d`.`id` = 3
		String sqlQuery ="UPDATE `student_info` SET `userName` = '"+Username+"', `passWord` = '"+Password+"', `First name` = '"+Firstname+"', `Last name` = '"+Lastname+
				"',`Phone number` = '"+Phonenumber+"', `sex` = '"+Sex+"', `address` = '"+Address+"', `email` = '"+email+"', `level` = '"+level+"' WHERE `student_info`.`id` ="+id;
		int executeUpdate = createStatement.executeUpdate(sqlQuery);
//		int updateSuccess = createStatement.executeUpdate(sqlQuery);
		check(executeUpdate);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			check(0);
			e.printStackTrace();
		}

	}


	///To check if hte data are added or not
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
