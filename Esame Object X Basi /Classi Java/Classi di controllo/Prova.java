package IV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
          
public class Prova  {
	
	

	public static void main(String args[]) throws SQLException, Exception{
		try{
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
		System.out.println("CONNECTION STATUS = OK"); 
		java.sql.Statement stm=con.createStatement();
		ResultSet rs= stm.executeQuery("select T1.codice,T1.nome from system.traccia T1");
		while(rs.next()) {
			
			System.out.println("codice: "+ rs.getString("codice"));
			System.out.println("nome: "+ rs.getString("nome"));
			
			}
		Scanner tastiera = new Scanner(System.in);
		System.out.println("\nScegli la traccia da quelle sopra elencate digitando il suo codice: ");
		String cod = tastiera.nextLine();
		
		ResultSet rss= stm.executeQuery("select T1.tipo from system.traccia T1");
		while(rss.next()) {
			
			System.out.println("tipo: "+ rss.getString("tipo"));
			
			}
		
		Scanner tastiera_tipo = new Scanner(System.in);
		System.out.println("\nScegli il tipo di quelli sopra elencati: ");
		String tipo = tastiera.nextLine();
		
		rs.close();
		rss.close();
		System.out.println("\n");
		ResultSet r=stm.executeQuery("SELECT\n"
				+ "    \"A3\".\"IDENTIFY\"  \"IDENTIFY\",\n"
				+ "    \"A2\".\"N_ASCOLTI\" \"N_ASCOLTI\",\n"
				+ "    \"A2\".\"FASCIA_ORARIA\"  \"FASCIA_ORARIA\",\n"
				+ "    \"A2\".\"TIPO\"  \"TIPO\"\n"
				+ "FROM\n"
				+ "    \"SYSTEM\".\"UTENTE\"    \"A3\",\n"
				+ "    \"SYSTEM\".\"TRACCIA\"   \"A2\",\n"
				+ "    \"SYSTEM\".\"ASCOLTA_2\" \"A1\"\n"
				+ "WHERE\n"
				+ "    COD_UTENTE=IDENTIFY AND\n"
				+ "    COD_TRACCIA=A2.CODICE AND\n"
				+ "    A2.CODICE="+cod+"AND\n"
				+ "    A2.TIPO= '"+tipo+"'\n"
				+ "GROUP BY\n"
				+ "    \"A3\".\"IDENTIFY\",\n"
				+ "    \"A2\".\"N_ASCOLTI\",\n"
				+ "    \"A2\".\"FASCIA_ORARIA\",\n"
				+ "    \"A2\".\"TIPO\"\n");
		
		while(r.next()) {
			
			System.out.println("nome: "+ r.getString("identify"));
			System.out.println("n_ascolti: "+ r.getString("n_ascolti"));
			System.out.println("fascia_oraria: "+ r.getString("fascia_oraria"));
			System.out.println("tipo: "+ r.getString("tipo"));
			
			
			}
		
		r.close();
		
		
		}	catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("CONNECTION STATUS = FAILURE");
			System.out.println(e1);
		}
		
	}
	



}
