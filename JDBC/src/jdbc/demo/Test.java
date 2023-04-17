package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
	//loading the driver class
	Class.forName("org.postgresql.Driver");
	
	//get the connection
	 Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","psql");
	
	//create the statement
	 Statement stmt=conn.createStatement();
	 
	//execute the statement
	 //boolean result=stmt.execute("create table jdbc(eid int,ename varchar(15))");
	 //int result=stmt.executeUpdate("insert into jdbc values(101,'Rasheed')");
	 ResultSet result=stmt.executeQuery("select * from jdbc");	
	 while(result.next()) {
			System.out.println(result.getInt(1)+" "+result.getString(2));

	 }
	//close the connection
	conn.close();
	System.out.println("record inserted:"+result);
	}
}
