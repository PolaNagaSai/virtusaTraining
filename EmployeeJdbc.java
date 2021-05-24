package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeJdbc {

	public static void main(String[] args) {
		String jdbcurl="jdbc:mysql://localhost:3306/mydb";
		String username="root";
		String password="1234";
		
		try {
			Connection con=DriverManager.getConnection(jdbcurl, username, password);
//		***creating a table***
			
//			String sql="create table employeeDetails(empId int(11) not null primary key auto_increment,empName varchar(45) not null,empDesignation varchar(45) not null,empAge varchar(45) not null,empSalary varchar(45) not null)";
//			Statement statement=con.createStatement();
//			statement.executeUpdate(sql);
//			System.out.println("Table created in database");
//			con.close();
			
//		*****inserting data into the table********	
			
//			String sql="insert into employeeDetails(empName,empDesignation,empAge,empSalary) values(?,?,?,?)";
//			PreparedStatement statement=con.prepareStatement(sql);
//			statement.setString(1, "jonas");
//			statement.setString(2, "analyst");
//			statement.setString(3, "26");
//			statement.setString(4, "27000");
//			
//			int rows=statement.executeUpdate();
//			if(rows>0) {
//				System.out.println("a new employee details inserted successfully.");
//			}else {
//				System.out.println("a new employee details inserted unsuccessfully.");
//			}
//			con.close();
			
			
//			********retrieving the data********
			
//			String sql="select * from employeeDetails";
//			Statement statement=con.createStatement();
//			ResultSet result=statement.executeQuery(sql);
//			System.out.println("Employee details in the table are.....");
//			while(result.next()) {
//				int empId=result.getInt(1);
//				String empName=result.getString(2);
//				String empDesignation=result.getString(3);
//				String empAge=result.getString(4);
//				String empSalary=result.getString(5);
//				
//				System.out.println(empId+"-"+empName+","+empDesignation+","+empAge+","+empSalary);
//			}
//			con.close();
			
//			****updating the data******
			
			String sql="update employeeDetails set empDesignation='senior analyst' where empAge>'29'";
			Statement statement=con.createStatement();
			int rows=statement.executeUpdate(sql);
			if(rows>0) {
				System.out.println("The users information has been updated...");
			}
			
			con.close();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
