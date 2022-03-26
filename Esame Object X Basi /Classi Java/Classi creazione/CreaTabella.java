package IV;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CreaTabella extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtVarcharint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreaTabella frame = new CreaTabella();
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
	public CreaTabella() {
		setTitle("CREA TABELLA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome tabella");
		lblNewLabel.setBounds(6, 32, 91, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome  Identificatore");
		lblNewLabel_1.setBounds(6, 58, 147, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Eventuali modificatori dell'identificatore");
		lblNewLabel_2.setBounds(6, 114, 269, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo identificatore");
		lblNewLabel_3.setBounds(6, 86, 130, 16);
		contentPane.add(lblNewLabel_3);
		
		JTextField textNome = new JTextField();
		textNome.setBounds(145, 27, 130, 26);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JTextField textIdentify = new JTextField();
		textIdentify.setText("codice");
		textIdentify.setBounds(145, 53, 130, 26);
		contentPane.add(textIdentify);
		textIdentify.setColumns(10);
		
		JTextField textTipo = new JTextField();
		textTipo.setText("Varchar/int");
		textTipo.setBounds(148, 81, 130, 26);
		contentPane.add(textTipo);
		textTipo.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 142, 274, 40);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
				System.out.println("CONNECTION STATUS = OK"); 
				java.sql.Statement stm=con.createStatement();
				
					

					
					if(textTipo.getText()=="int"&&textArea.getText()!=null) {
						
						int i=stm.executeUpdate("create table "+ textNome.getText() +"( "+ textIdentify.getText() +" "+ textTipo.getText() +" primary key "+ textArea.getText()+") ");
					}
					else
					{
						if(textTipo.getText()!="int"&&textArea.getText()!=null) {
							
							int i=stm.executeUpdate("create table "+ textNome.getText() +"( "+ textIdentify.getText() +" "+ textTipo.getText() +" primary key "+ textArea.getText()+")");

							
						}
						else
						{
							if(textTipo.getText()=="int"&&textArea.getText()==null) {
								
								int i=stm.executeUpdate("create table "+ textNome.getText() +"( "+ textIdentify.getText() +" "+ textTipo.getText() +" primary key) ");

								
							}
							else
							{	
								int i=stm.executeUpdate("create table "+ textNome.getText() +"( codice int primary key ) create sequence "+textNome.getText()+"_pk minvalue 1 start with 1 cache 100;");

								
							}
							
							
						}

						
						
					}
					
					
					
				if(textIdentify.getText()==null) {
					
					JOptionPane.showMessageDialog(btnNewButton, "Non avendo inserito alcun identificatore ne verrà generato uno di default");
					
				}
				else
				{
					String s="OPERATION SUCCESSFULL";
					JOptionPane.showMessageDialog(btnNewButton, s);
					
				}
				
			
				
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
