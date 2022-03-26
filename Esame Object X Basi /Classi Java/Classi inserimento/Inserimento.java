package IV;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inserimento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserimento frame = new Inserimento();
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
	public Inserimento() {
		setTitle("INSERIMENTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Scegli la tabella");
		lblNewLabel_1.setBounds(55, 74, 109, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("indietro");
		btnNewButton.setBounds(180, 237, 117, 29);
		contentPane.add(btnNewButton);

		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Utente");
		rdbtnNewRadioButton.setBounds(251, 70, 141, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Traccia");
		rdbtnNewRadioButton_1.setBounds(251, 51, 141, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("ALbum");
		rdbtnNewRadioButton_2.setBounds(251, 88, 141, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Artista");
		rdbtnNewRadioButton_3.setBounds(251, 105, 141, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton_2 = new JButton("Continue");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 
				 
				
				
				if(rdbtnNewRadioButton.isSelected()) {
					
					Utente u= new Utente();
					u.setVisible(true);
					
				}
				
				if(rdbtnNewRadioButton_1.isSelected()) {
					
					Traccia t=new Traccia();
					t.setVisible(true);

				}
				if(rdbtnNewRadioButton_2.isSelected()) {
					
					Album al=new Album();
					al.setVisible(true);
					

				}
				if(rdbtnNewRadioButton_3.isSelected()) {
	
					Artista a=new Artista();
					a.setVisible(true);
					

				}
			}
		});
		btnNewButton_2.setBounds(309, 237, 117, 29);
		contentPane.add(btnNewButton_2);
	}
}
