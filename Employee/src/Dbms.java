import java.sql.*;
public class Dbms {

	public static void main(String[] args) throws Exception 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","");
			if(!conn.isClosed())
			{
				System.out.println("Succesfully connected to Oracle server...");
			}
			String query ="CREATE TABLE EMPLOYEE " + 
			          "(EMPLOYEE_ID INTEGER not NULL, " +
					  " NAME VARCHAR(30)," + 
			          " ADDRESS VARCHAR(100), " +
					  " DOB DATE, "   +
			          " EMAIL VARCHAR(200), "   +
					  " PHONE_NUMBER NUMBER(10), "  +
			          " HIRE_DATE DATE, "  +
					  " SALARY NUMBER(10), " +
			          " PRIMARY KEY (EMPLOYEE_ID))";
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Table created");
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
