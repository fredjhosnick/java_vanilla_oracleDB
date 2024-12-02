import java.sql.*;

public class Select_Dbms {

	public static void main(String[] args) {
		
		String D1,D2,D3,D4,D5,D6,D7,D8;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys as sysdba","passwordorcldb");
			if(!conn.isClosed())
			{
				System.out.println("Successfully connected to Oracle server ...");
			}
			String query ="Select * FROM EMPLOYEE";
			Statement stmt = conn.createStatement();
			System.out.println("EMP ID  "+"\t" + "  Name   "+"\t"+ "   ADDRESS " + "\t"+ "    DOP DATE    " + "\t"+  "   MAIL     "+ "\t" +"  PHONE NUMBER"+ "\t" + "   HIRE DATE "+ "\t" + "   SALARY ");
			System.out.println("........        ..............      ............           ................          ...............           ...........             ...........            ..........          ");
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				D1 = rs.getString(1);
				D2 = rs.getString(2);
				D3 = rs.getString(3);
				D4 = rs.getString(4);
				D5 = rs.getString(5);
				D6 = rs.getString(6);
				D7 = rs.getString(7);
				D8 = rs.getString(8);
				System.out.println(D1 +"        "+ "\t"+ D2 +"       "+"\t"+D3+"   "+"\t"+D4+"  "+"\t"+D5+"    "+"\t"+D6+"       "+"\t"+D7+"       "+"\t"+D8);	
				
			}
			System.out.println("Table Fetched Successfully");
			conn.close();
			
			
		}catch(ClassNotFoundException e)
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
