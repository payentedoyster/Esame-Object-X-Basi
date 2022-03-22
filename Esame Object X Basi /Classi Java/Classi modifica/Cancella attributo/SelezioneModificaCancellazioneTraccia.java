package IV;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SelezioneModificaCancellazioneTraccia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelezioneModificaCancellazioneTraccia frame = new SelezioneModificaCancellazioneTraccia();
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
	 */
	public SelezioneModificaCancellazioneTraccia() {
		setTitle("ELIMINA UN ATTRIBUTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserisci attributo da cancellare");
		lblNewLabel.setBounds(6, 73, 198, 16);
		contentPane.add(lblNewLabel);
		
		JTextField textDrop = new JTextField();
		textDrop.setBounds(216, 68, 130, 26);
		contentPane.add(textDrop);
		textDrop.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
				System.out.println("CONNECTION STATUS = OK"); 
				java.sql.Statement stm=con.createStatement();
				int i=stm.executeUpdate("alter table traccia drop "+ textDrop.getText());
				System.out.println(i);
				String s="OPERATION SUCCESSFULL";
				JOptionPane.showMessageDialog(btnNewButton, s);
				
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("CONNECTION STATUT = FAILURE");
					String s1="OPERATION FAILED";
					JOptionPane.showMessageDialog(btnNewButton, s1);
					System.out.println(e1);
				}
				
				
			}
		});
		btnNewButton.setBounds(327, 237, 117, 29);
		contentPane.add(btnNewButton);
	}

}
