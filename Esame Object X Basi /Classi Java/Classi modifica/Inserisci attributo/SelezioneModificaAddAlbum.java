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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SelezioneModificaAddAlbum extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelezioneModificaAddAlbum frame = new SelezioneModificaAddAlbum();
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
	public SelezioneModificaAddAlbum() {
		setTitle("AGGIUNGI UN ATRIBUTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserisci Nome ");
		lblNewLabel.setBounds(6, 22, 112, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inserisci Tipo");
		lblNewLabel_1.setBounds(6, 50, 96, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserisci eventuali modificatori");
		lblNewLabel_2.setBounds(6, 78, 195, 16);
		contentPane.add(lblNewLabel_2);
		
		JTextField textNome = new JTextField();
		textNome.setBounds(130, 17, 130, 26);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JTextField textTipo = new JTextField();
		textTipo.setBounds(130, 45, 130, 26);
		contentPane.add(textTipo);
		textTipo.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 106, 377, 62);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
				System.out.println("CONNECTION STATUS = OK"); 
				java.sql.Statement stm=con.createStatement();
				int i;
				
				if(textArea.getText()!=null) {
					i=stm.executeUpdate("alter table album add "+ textNome.getText() +" "+ textTipo.getText() + " "+ textArea.getText());

				}
				else
					i=stm.executeUpdate("alter table album add "+ textNome.getText() +" "+ textTipo.getText());
				
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
