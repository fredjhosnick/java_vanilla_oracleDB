import java.sql.*;

public class insert_Dbms {

	public static void main(String[] args) throws Exception {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","11Hola@migo11");
			
			if(!conn.isClosed()) {
				
				System.out.println("Successfully connected to Oracle server ...");
			}
			
			String query = "INSERT INTO EMPLOYEE " +
			           "VALUES(106, " +
					   " 'CARLOS P', " +
			           " 'PORTUGAL', " +
					   " '01-JUN-1978', " +
			           "'carlos@gmail.com', " +
					   " 6666666666, " +
					   "'01-JUN-2014', " +
			           "40000)";
			
			String query1 = "INSERT INTO EMPLOYEE " +
			           "VALUES(107, " +
					   " 'BLANCA TORRE ', " +
			           " 'SPAIN', " +
					   " '01-JUL-1991', " +
			           "'demo1@gmail.com', " +
			           " 8888888888, " +
					   "'01-SEP-2018', " +
			           "70000)";
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			stmt.executeUpdate(query1);
			System.out.println("Values Inserted Succefully");
			conn.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
