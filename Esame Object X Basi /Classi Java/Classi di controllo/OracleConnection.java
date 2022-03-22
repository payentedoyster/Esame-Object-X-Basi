package IV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");
			System.out.println("CONNECTION STATUS OK");
			con.close();
			
		}
		catch(ClassNotFoundException e) {
			
			System.out.println("DB DRIVER NOT FOUND");
			System.out.println(e);
			
		}
		catch(SQLException e) {
			
			System.out.println("CONNECTION STATUS FAILURE");
			System.out.println(e);
			
		}

	}

}
