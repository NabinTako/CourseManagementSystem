package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class uploadAssignment {

	// uploading assignment uploaded by the students in their separate modules.
	public uploadAssignment(String modulename,String number,String name,String Q1,String Q2,String Q3,String Q4,String Ans1,String Ans2,String Ans3,String Ans4) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery = "INSERT INTO `"+ modulename +"` (`id`, `Assignment number`, `Name`, `Q1`, `Q2`, `Q3`, `Q4`, `Ans1`, `Ans2`, `Ans3`, `Ans4`) VALUES "
					+ "(NULL, '"+number+"', '"+name+"', '"+Q1+"', '"+Q2+"', '"+Q3+"', '"+Q4+"', '"+Ans1+"', '"+Ans2+"', '"+Ans3+"', '"+Ans4+"')";
			int resultset = createStatement.executeUpdate(sqlQuery);
			check(resultset);		
		} catch (SQLException e) {

			check(0);	
//			e.printStackTrace();
		}
		
	}

	// uploading the assingment given by the teacher
	public uploadAssignment(String modulename,String number,String name,String Q1,String Q2,String Q3,String Q4) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/datas", "root", "");
			Statement createStatement = connection.createStatement();
//			INSERT INTO `assinments` (`id`, `modulename`, `Assignment number`, `Name`, `Q1`, `Q2`, `Q3`, `Q4`) VALUES (NULL, 'oodp', '54', 'n', 'l', 's', 'w', 'a')
			String sqlQuery = "INSERT INTO `assinments` (`id`, `modulename`, `Assignment number`, `Name`, `Q1`, `Q2`, `Q3`, `Q4`) VALUES "
					+ "(NULL, '"+modulename+"','"+number+"', '"+name+"', '"+Q1+"', '"+Q2+"', '"+Q3+"', '"+Q4+"')";
			int resultset = createStatement.executeUpdate(sqlQuery);
			check(resultset);		
		} catch (SQLException e) {
			
			check(0);	
//			e.printStackTrace();
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
