package IV;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modifica extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modifica frame = new Modifica();
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
	public Modifica() {
		setTitle("MODIFCA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Seleziona la tabella in cui verranno apportate le modifiche");
		lblNewLabel_1.setBounds(40, 20, 372, 16);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton Utente = new JRadioButton("Utente");
		Utente.setBounds(159, 58, 141, 23);
		contentPane.add(Utente);
		
		JRadioButton Traccia = new JRadioButton("Traccia");
		Traccia.setBounds(159, 80, 141, 23);
		contentPane.add(Traccia);
		
		JRadioButton Album = new JRadioButton("Album");
		Album.setBounds(159, 103, 141, 23);
		contentPane.add(Album);
		
		JRadioButton Artista = new JRadioButton("Artista");
		Artista.setBounds(159, 128, 141, 23);
		contentPane.add(Artista);
		
		
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (Utente.isSelected()) {
					
					ModificaUtente u=new ModificaUtente();
					u.setVisible(true);
					
					}
				
				if(Traccia.isSelected()) {
						
					ModificaTraccia t=new ModificaTraccia();
					t.setVisible(true);
						
					}
				
				 if(Artista.isSelected()) {
						
					ModificaArtista a=new ModificaArtista();
					a.setVisible(true);
					
					}
				 
				 if (Album.isSelected()) {
						
					ModificaAlbum al=new ModificaAlbum();
					al.setVisible(true);
			
				 }
					
				
			}
		});
		btnNewButton.setBounds(327, 237, 117, 29);
		contentPane.add(btnNewButton);
	}
}
