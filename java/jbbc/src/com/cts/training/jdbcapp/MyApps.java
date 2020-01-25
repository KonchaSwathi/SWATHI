package com.cts.training.jdbcapp;
import java.sql.*;
import java.util.Scanner;
public class MyApps {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");

	    	Statement stmt = conn.createStatement();
	    	System.out.println("enter the id for student table :");
	    	int id=sc.nextInt();
	    	System.out.println("enter the name for student table:");
	    	String name=sc.next();
	    	System.out.println("enter the email  for student table:");
	    	String email=sc.next();
	    	System.out.println("enter the address for student table:");
	    	String address=sc.next();
	    	// insert a record
            String  query = "insert into student set id='+id+', name='+name+', email='+email+',Address='+address+'";
			int n = stmt.executeUpdate(query);
			System.out.println("Rows Added : " + n);
            ResultSet rs =  stmt.executeQuery("select * from student");

			while(rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("email"));
			}

			rs.close();
			conn.close();


			/*ResultSet rs = stmt.executeQuery(""); // Retrieval  : select
			if(rs.next()) {
				rs.getString(1);  // 1 based indexing
				rs.getString("email");
			}
			
			while(rs.next()) {
				
			}
			
			int n = stmt.executeUpdate(""); // DMQ/DML : insert,update,delete
			// n : number of rows affected
			 
			 */
		}
		catch(Exception ex) {
			System.out.println(ex);

		}
	
 }

}
