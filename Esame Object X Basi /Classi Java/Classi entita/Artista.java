package IV;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Artista extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField txtEta;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Artista frame = new Artista();
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
	public Artista() {
		setTitle("INSERIMENTO IN ARTISTA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(19, 33, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Età");
		lblNewLabel_1.setBounds(19, 61, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sesso");
		lblNewLabel_2.setBounds(19, 89, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JTextField textNome = new JTextField();
		textNome.setText("Varchar(20)");
		textNome.setBounds(111, 28, 130, 26);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JTextField txtEta = new JTextField();
		txtEta.setText("Number");
		txtEta.setBounds(111, 56, 130, 26);
		contentPane.add(txtEta);
		txtEta.setColumns(10);
		
		JRadioButton Maschio = new JRadioButton("Maschio");
		Maschio.setBounds(111, 85, 141, 23);
		contentPane.add(Maschio);
		
		JRadioButton Femmina = new JRadioButton("Femmina");
		Femmina.setBounds(111, 108, 141, 23);
		contentPane.add(Femmina);
		
		JRadioButton Altro = new JRadioButton("Altro");
		Altro.setBounds(111, 132, 141, 23);
		contentPane.add(Altro);
		
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(Maschio);
		group.add(Femmina);
		group.add(Altro);
		
		this.add(Maschio);
		this.add(Femmina);
		this.add(Altro);
		
		JButton btnNewButton = new JButton("Invio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				try{	char c = 0;
				
						Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
						System.out.println("CONNECTION STATUS = OK"); 
						java.sql.Statement stm=con.createStatement();
						if (e.getSource()==Maschio)
							c=(char)77
							;
						else {
								if(e.getSource()==Femmina) {
									c=(char)70;
								}
								else {
									
									if(e.getSource()==Altro) {
										c=(char)65;
										
									}
							
							}
						
						}
							
							
						int i=stm.executeUpdate("insert into artista_progetto values('"+ textNome.getText() +"',"+ txtEta.getText() +",'"+ c +"','non importante')");
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


public void estrai_sesso(char s,JRadioButton r1,JRadioButton r2,JRadioButton r3) {
		
		if(r1.isSelected()) {
			
			s='m';
			r2.setSelected(false);
			r3.setSelected(false);
			
		}
		
	
}


}
