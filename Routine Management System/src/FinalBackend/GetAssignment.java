package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetAssignment {

	List<String> oodpname = new ArrayList<>();
	List<String> oodpq1 = new ArrayList<>();
	List<String> oodpq2 = new ArrayList<>();
	List<String> oodpq3 = new ArrayList<>();
	List<String> oodpq4 = new ArrayList<>();
	

	List<String> cname = new ArrayList<>();
	List<String> cq1 = new ArrayList<>();
	List<String> cq2 = new ArrayList<>();
	List<String> cq3 = new ArrayList<>();
	List<String> cq4 = new ArrayList<>();
	
	
	public String getOodpname(int i) {
		return oodpname.get(i);
	}
	public String getOodpq1(int i) {
		return oodpq1.get(i);
	}
	public String getOodpq2(int i) {
		return oodpq2.get(i);
	}
	public String getOodpq3(int i) {
		return oodpq3.get(i);
	}
	public String getOodpq4(int i) {
		return oodpq4.get(i);
	}
	public String getCname(int i) {
		return cname.get(i);
	}
	public String getCq1(int i) {
		return cq1.get(i);
	}
	public String getCq2(int i) {
		return cq2.get(i);
	}
	public String getCq3(int i) {
		return cq3.get(i);
	}
	public String getCq4(int i) {
		return cq4.get(i);
	}
	

	public int getOodpSize() {
		return oodpq1.size();
	}
	public int getCSize() {
		return cq1.size();
	}
	
	public GetAssignment() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery ="SELECT * FROM `oodp`";
			ResultSet resultset = createStatement.executeQuery(sqlQuery);
			while(resultset.next()) {
				oodpname.add(resultset.getString("Name"));
				oodpq1.add(resultset.getString("Q1"));
				oodpq2.add(resultset.getString("Q2"));
				oodpq3.add(resultset.getString("Q3"));
				oodpq4.add(resultset.getString("Q4"));
			}
			GetAssignmentC();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	public void GetAssignmentC() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery ="SELECT * FROM `c`";
			ResultSet resultset = createStatement.executeQuery(sqlQuery);
			while(resultset.next()) {
				cname.add(resultset.getString("Name"));
				cq1.add(resultset.getString("Q1"));
				cq2.add(resultset.getString("Q2"));
				cq3.add(resultset.getString("Q3"));
				cq4.add(resultset.getString("Q4"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
