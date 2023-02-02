package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Getresult {
	List<String> name = new ArrayList<>();
	List<String> OODPmark = new ArrayList<>();
	List<String> Cmark = new ArrayList<>();
	int index=0;
	public int getIndex() {
		return index;
	}
	public String getOODPmark(int i) {
		return OODPmark.get(i);
	}

	public String getCmark(int i) {
		return Cmark.get(i);
	}

	int size;

	public Getresult() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery ="SELECT * FROM `marks`";
			ResultSet resultset = createStatement.executeQuery(sqlQuery);
			while(resultset.next()) {
				name.add(resultset.getString("first name"));
				OODPmark.add(resultset.getString("oodpMark"));
				Cmark.add(resultset.getString("cMark"));
				size++;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void seeResult(String firstname) {
		for(int i=0;i<size;i++) {
			if(name.get(i).trim().equals(firstname)) {
				index =i;
			}else {
				
			}
		}
	}
	
	

}
