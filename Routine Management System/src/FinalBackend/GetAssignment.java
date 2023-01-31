package FinalBackend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetAssignment {
	int size;
	List<String> name = new ArrayList<>();
	List<String> modulename = new ArrayList<>();
	List<String> number = new ArrayList<>();
	List<String> q1 = new ArrayList<>();
	List<String> q2 = new ArrayList<>();
	List<String> q3 = new ArrayList<>();
	List<String> q4 = new ArrayList<>();

	List<String> oodpname = new ArrayList<>();
	List<String> oodpnumber = new ArrayList<>();
	List<String> oodpq1 = new ArrayList<>();
	List<String> oodpq2 = new ArrayList<>();
	List<String> oodpq3 = new ArrayList<>();
	List<String> oodpq4 = new ArrayList<>();
	

	List<String> cname = new ArrayList<>();
	List<String> cnumber = new ArrayList<>();
	List<String> cq1 = new ArrayList<>();
	List<String> cq2 = new ArrayList<>();
	List<String> cq3 = new ArrayList<>();
	List<String> cq4 = new ArrayList<>();
	
	
	
	public String getModulename(int i) {
		return modulename.get(i);
	}
	public String getName(int i) {
		return name.get(i);
	}public String getNumber(int i) {
		return number.get(i);
	}
	public String getQ1(int i) {
		return q1.get(i);
	}
	public String getQ2(int i) {
		return q2.get(i);
	}
	public String getQ3(int i) {
		return q3.get(i);
	}
	public String getQ4(int i) {
		return q4.get(i);
	}
	
	public String getOodpname(int i) {
		return oodpname.get(i);
	}public String getOodpnumber(int i) {
		return oodpnumber.get(i);
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
	public String getCnumber(int i) {
		return cnumber.get(i);
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
	

	public int getSize() {
		return size;
	}
	
	public int getOodpsize() {
		return oodpname.size();
	}
	public int getCsize() {
		return cname.size();
	}
	public GetAssignment() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datas", "root", "");
			Statement createStatement = connection.createStatement();
			String sqlQuery ="SELECT * FROM `assinments`";
			ResultSet resultset = createStatement.executeQuery(sqlQuery);
			while(resultset.next()) {
				oodpname.add(resultset.getString("Name"));
				oodpnumber.add(resultset.getString("Assignment Number"));
				oodpq1.add(resultset.getString("Q1"));
				oodpq2.add(resultset.getString("Q2"));
				oodpq3.add(resultset.getString("Q3"));
				oodpq4.add(resultset.getString("Q4"));
				modulename.add(resultset.getString("modulename"));
				name.add(resultset.getString("Name"));
				number.add(resultset.getString("Assignment Number"));
				q1.add(resultset.getString("Q1"));
				q2.add(resultset.getString("Q2"));
				q3.add(resultset.getString("Q3"));
				q4.add(resultset.getString("Q4"));
				size++;
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
				cnumber.add(resultset.getString("Assignment Number"));
				cq1.add(resultset.getString("Q1"));
				cq2.add(resultset.getString("Q2"));
				cq3.add(resultset.getString("Q3"));
				cq4.add(resultset.getString("Q4"));
//				modulename.add(resultset.getString("modulename"));
//				name.add(resultset.getString("Name"));
//				number.add(resultset.getString("Assignment Number"));
//				q1.add(resultset.getString("Q1"));
//				q2.add(resultset.getString("Q2"));
//				q3.add(resultset.getString("Q3"));
//				q4.add(resultset.getString("Q4"));
//				size++;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
