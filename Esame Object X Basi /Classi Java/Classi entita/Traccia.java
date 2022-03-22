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
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Traccia extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField textAnno;
	private JTextField textAscolti;
	private JTextField textFascia;
	private JTextField txtTipo;
	private JTextField txtGenere;
	private JTextField txtVarchar;
	private JTextField txtInserireCodicenumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traccia frame = new Traccia();
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
	public Traccia() {
		setTitle("INSERIMENTO IN TRACCIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(6, 42, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Anno");
		lblNewLabel_2.setBounds(6, 70, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("N_Ascolti");
		lblNewLabel_3.setBounds(6, 98, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fascia Oraria");
		lblNewLabel_4.setBounds(6, 126, 81, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo");
		lblNewLabel_5.setBounds(6, 154, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Genere");
		lblNewLabel_6.setBounds(6, 182, 61, 16);
		contentPane.add(lblNewLabel_6);
		
		JTextField txtNome = new JTextField();
		txtNome.setText("Varchar(20)");
		txtNome.setBounds(123, 37, 130, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JTextField textAnno = new JTextField();
		textAnno.setText("Date (a-m-g)");
		textAnno.setBounds(123, 65, 130, 26);
		contentPane.add(textAnno);
		textAnno.setColumns(10);
		
		JTextField textAscolti = new JTextField();
		textAscolti.setText("Number");
		textAscolti.setBounds(123, 93, 130, 26);
		contentPane.add(textAscolti);
		textAscolti.setColumns(10);
		
		JTextField textFascia = new JTextField();
		textFascia.setText("Varchar(15)");
		textFascia.setBounds(123, 121, 130, 26);
		contentPane.add(textFascia);
		textFascia.setColumns(10);
		
		JTextField txtTipo = new JTextField();
		txtTipo.setText("Varchar(20)");
		txtTipo.setBounds(123, 149, 130, 26);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
		
		JTextField txtGenere = new JTextField();
		txtGenere.setText("Varchar(20)");
		txtGenere.setBounds(123, 177, 130, 26);
		contentPane.add(txtGenere);
		txtGenere.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Artista");
		lblNewLabel_7.setBounds(252, 42, 61, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Album");
		lblNewLabel_8.setBounds(252, 70, 61, 16);
		contentPane.add(lblNewLabel_8);
		
		JTextField txtVarchar = new JTextField();
		txtVarchar.setText("Varchar(20)");
		txtVarchar.setBounds(314, 37, 130, 26);
		contentPane.add(txtVarchar);
		txtVarchar.setColumns(10);
		
		JTextField txtInserireCodicenumber = new JTextField();
		txtInserireCodicenumber.setText("Number Code");
		txtInserireCodicenumber.setBounds(314, 65, 130, 26);
		contentPane.add(txtInserireCodicenumber);
		txtInserireCodicenumber.setColumns(10);
		
		JButton btnNewButton = new JButton("Invio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try{Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
				System.out.println("CONNECTION STATUS = OK"); 
				java.sql.Statement stm=con.createStatement();
				int i=stm.executeUpdate("insert into traccia values(pk_traccia.nextval,'"+ txtNome.getText() +"',date '"+ textAnno.getText() +"',"+ textAscolti.getText() +",'"+ textFascia.getText() +"','"+ txtTipo.getText() +"','"+ txtGenere.getText() +"',(select nome from artista_progetto where nome='"+ txtVarchar.getText() +"'),(select codice from album where codice="+ txtInserireCodicenumber.getText() +"))" );
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
