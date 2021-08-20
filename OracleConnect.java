import java.sql.*;
public class OracleConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "system";
		String password = "admin";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		
		System.out.println("Connection created");
		
		Statement stmt = con.createStatement();
		ResultSet re = stmt.executeQuery("SELECT * FROM DAY8");
		System.out.println();
		System.out.println("Before Updation: ");
		while(re.next())
		{
			System.out.print(re.getString("ID")+"-"+re.getString("name")+"="+re.getString("SUBJECT")+"-"+re.getString("MARKS"));
			System.out.println();
		}
		
		 String updateQuery = "UPDATE DAY8 SET subject = 'BIO' WHERE ID = 3";
		 stmt.executeUpdate(updateQuery);
		 System.out.println();
		 System.out.println("After Updation: ");
		 ResultSet rx = stmt.executeQuery("SELECT * FROM DAY8");
		 while(rx.next())
			{
				System.out.print(rx.getString("ID")+"-"+rx.getString("NAME")+"="+rx.getString("SUBJECT")+"-"+rx.getString("MARKS"));
				System.out.println();
			}
			
		con.close();

	}

}
