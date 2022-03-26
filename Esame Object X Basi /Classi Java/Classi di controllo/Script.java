package IV;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.State;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.Scrollbar;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Script extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Script frame = new Script();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Script() throws SQLException {
		setTitle("SCRIPT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 52, 408, 162);
		contentPane.add(textArea);
	
		
		JLabel lblNewLabel = new JLabel("Inserisci il codice");
		lblNewLabel.setBounds(164, 6, 117, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user=null;
				String psw=null;
				String url=null;
				try{Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
				System.out.println("CONNECTION STATUS = OK"); 
				java.sql.Statement stm=con.createStatement();
				int i=stm.executeUpdate(textArea.getText());
				System.out.println(i);}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("CONNECTION STATUT = FAILURE");
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setBounds(297, 237, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("indietro");
		btnNewButton_1.setBounds(176, 237, 117, 29);
		contentPane.add(btnNewButton_1);
		
	}
}
