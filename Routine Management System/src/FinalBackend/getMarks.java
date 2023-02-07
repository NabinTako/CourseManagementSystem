package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class getMarks {
	List<String> id = new ArrayList<>();
	List<String> FirstName = new ArrayList<>();
	List<String> LastName = new ArrayList<>();
	List<String> OODPmark = new ArrayList<>();
	List<String> Cmark = new ArrayList<>();
	
	public String getId(int i) {
		return id.get(i);
	}
	public String getFirstName(int i) {
		return FirstName.get(i);
	}
	public String getLastName(int i) {
		return LastName.get(i);
	}
	public String getOODPmark(int i) {
		return OODPmark.get(i);
	}

	public String getCmark(int i) {
		return Cmark.get(i);
	}

	public int getSize() {
		return Cmark.size();
	}

	public getMarks() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery ="SELECT * FROM `marks`";
			ResultSet resultset = createStatement.executeQuery(sqlQuery);
			while(resultset.next()) {
				id.add(resultset.getString("id"));
				FirstName.add(resultset.getString("first name"));
				LastName.add(resultset.getString("last name"));
				OODPmark.add(resultset.getString("oodpMark"));
				Cmark.add(resultset.getString("cMark"));
				
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
}
