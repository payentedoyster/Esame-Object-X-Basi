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

public class SelezioneModificaNomeUtente extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeVecchio;
	private JTextField textNomeNuovo;
	private JTextField textTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelezioneModificaNomeUtente frame = new SelezioneModificaNomeUtente();
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
	public SelezioneModificaNomeUtente() {
		setTitle("MODIFICA IN NOME DI UN ATTRIBUTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserisci il vechio nome");
		lblNewLabel.setBounds(6, 23, 149, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inserisci il nuovo nome");
		lblNewLabel_1.setBounds(6, 51, 161, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserisci tipo");
		lblNewLabel_2.setBounds(6, 79, 149, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Inserisci eventuali modificatori");
		lblNewLabel_3.setBounds(6, 107, 206, 16);
		contentPane.add(lblNewLabel_3);
		
		JTextField textNomeVecchio = new JTextField();
		textNomeVecchio.setBounds(186, 18, 130, 26);
		contentPane.add(textNomeVecchio);
		textNomeVecchio.setColumns(10);
		
		JTextField textNomeNuovo = new JTextField();
		textNomeNuovo.setBounds(186, 46, 130, 26);
		contentPane.add(textNomeNuovo);
		textNomeNuovo.setColumns(10);
		
		JTextField textTipo = new JTextField();
		textTipo.setBounds(186, 74, 130, 26);
		contentPane.add(textTipo);
		textTipo.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(16, 135, 319, 84);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
				System.out.println("CONNECTION STATUS = OK"); 
				java.sql.Statement stm=con.createStatement();
				int i;
				
				if(textArea.getText()!=null) {
					i=stm.executeUpdate("alter table utente change "+ textNomeVecchio.getText() +" "+ textNomeNuovo.getText() +" "+ textTipo.getText() + " "+ textArea.getText());

				}
				else
					i=stm.executeUpdate("alter table utente change "+ textNomeVecchio.getText() +" "+ textNomeNuovo.getText() +" "+ textTipo.getText());
				
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
