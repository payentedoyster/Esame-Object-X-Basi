package IV;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Utente extends JFrame {

	private JPanel contentPane;
	private JTextField textIdentify;
	private JTextField textEta;
	private JTextField textCitta;
	private JTextField textVia;
	private JTextField textNCivico;
	private JTextField textNazionalita;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Utente frame = new Utente();
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
	public Utente() {
		setTitle("INSERISCI IN UTENTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Identify");
		lblNewLabel_1.setBounds(6, 38, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(6, 66, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setText("Varchar(30)");
		txtEmail.setBounds(79, 61, 150, 26);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Età");
		lblNewLabel_3.setBounds(6, 94, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Città");
		lblNewLabel_4.setBounds(6, 122, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Via");
		lblNewLabel_5.setBounds(6, 150, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("N_civico");
		lblNewLabel_6.setBounds(6, 178, 61, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Nazionalità");
		lblNewLabel_7.setBounds(241, 38, 74, 16);
		contentPane.add(lblNewLabel_7);
		
		JTextField textIdentify = new JTextField();
		textIdentify.setText("Varchar(20)");
		textIdentify.setBounds(79, 34, 150, 26);
		contentPane.add(textIdentify);
		textIdentify.setColumns(10);
		
	
		
		
		
		JTextField textEta = new JTextField();
		textEta.setText("Number");
		textEta.setBounds(79, 89, 150, 26);
		contentPane.add(textEta);
		textEta.setColumns(10);
		
		JTextField textCitta = new JTextField();
		textCitta.setText("Varchar(20)");
		textCitta.setBounds(79, 117, 150, 26);
		contentPane.add(textCitta);
		textCitta.setColumns(10);
		
		JTextField textVia = new JTextField();
		textVia.setText("Varchar(20)");
		textVia.setBounds(79, 145, 150, 26);
		contentPane.add(textVia);
		textVia.setColumns(10);
		
		JTextField textNCivico = new JTextField();
		textNCivico.setText("Number");
		textNCivico.setBounds(79, 173, 150, 26);
		contentPane.add(textNCivico);
		textNCivico.setColumns(10);
		
		JTextField textNazionalita = new JTextField();
		textNazionalita.setText("Varchar(20)");
		textNazionalita.setBounds(314, 33, 130, 26);
		contentPane.add(textNazionalita);
		textNazionalita.setColumns(10);
		
		JTextField textEmail = new JTextField();
		textEmail.setText("Varchar(30)");
		textEmail.setToolTipText("");
		textEmail.setBounds(79, 61, 150, 26);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnNewButton = new JButton("Invio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
				System.out.println("CONNECTION STATUS = OK"); 
				java.sql.Statement stm=con.createStatement();
				int i=stm.executeUpdate("insert into utente values('"+ textIdentify.getText() +"','"+ txtEmail.getText() +"',"+ textEta.getText() +",'"+ textCitta.getText() +"','"+ textVia.getText() +"',"+ textNCivico.getText() +",'"+ textNazionalita.getText() +"'");
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
