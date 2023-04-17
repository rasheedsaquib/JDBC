package jdbc.demo;


	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
	
	public class Jdbc {

		public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//loading the driver class
		Class.forName("org.postgresql.Driver");
		
		//get the connection
		 Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","psql");
		
		//create the statement
		PreparedStatement psmt=conn.prepareStatement("insert into jdbc values(?,?)");
		psmt.setInt(1,103);
		psmt.setString(2,"Mohammed");
		int result=psmt.executeUpdate();
		
		//close the connection
		conn.close();
		System.out.println("record inserted:"+result);
		}

}
