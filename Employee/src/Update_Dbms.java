import java.sql.*;
public class Update_Dbms {

	public static void main(String[] args) throws Exception 
	{
		
	    try {
	    	Class.forName("oracle.jdbc.driver.OracleDriver");
	    	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sys as sysdba","passwordorcldb");
	    	if(!conn.isClosed())
	    	{
	    		System.out.println("Successfully connected to Oracle server...");
	    	}
	    	String query = "UPDATE EMPLOYEE SET SALARY "
	    			+ "= '1000'"
	    			+ "WHERE "
	    			+ "EMPLOYEE_ID"
	    			+ "= "
	    			+" 106";
	    	   Statement stmt = conn.createStatement();
	    	   stmt.executeUpdate(query);
	    	   System.out.println("Value updated Successfully");
	    	   conn.close();
	    	   
	    			
	    	
	    }
	    catch(ClassNotFoundException e)
	    {
	    	
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
