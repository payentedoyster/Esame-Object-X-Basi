package IV;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificaAlbum extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificaAlbum frame = new ModificaAlbum();
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
	public ModificaAlbum() {
		setTitle("MODIFICA ALBUM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton Aggiungi = new JRadioButton("Aggiungi un atributo");
		Aggiungi.setBounds(6, 17, 187, 23);
		contentPane.add(Aggiungi);
		
		JRadioButton ModificaNome = new JRadioButton("Modifica il nome di un attributo");
		ModificaNome.setBounds(6, 52, 237, 23);
		contentPane.add(ModificaNome);
		
		JRadioButton ModificaTipo = new JRadioButton("Modifica il tipo di un attributo");
		ModificaTipo.setBounds(6, 84, 237, 23);
		contentPane.add(ModificaTipo);
		
		JRadioButton Elimina = new JRadioButton("Elimina un attributo");
		Elimina.setBounds(6, 6, 440, 233);
		contentPane.add(Elimina);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setToolTipText("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(Aggiungi.isSelected()) {
					
					SelezioneModificaAddAlbum sma = new SelezioneModificaAddAlbum();
					sma.setVisible(true);
					
				}
				
				if(ModificaNome.isSelected()) {
					
					SelezioneModificaNomeAlbum smn = new SelezioneModificaNomeAlbum();
					smn.setVisible(true);

				}
				if(ModificaTipo.isSelected()) {
					
					SelezioneModificaTipoAlbum smt = new SelezioneModificaTipoAlbum();
					smt.setVisible(true);
					

				}
				if(Elimina.isSelected()) {
	
					SelezioneModificaCancellazioneAlbum smc = new SelezioneModificaCancellazioneAlbum();
					smc.setVisible(true);
					

				}
				
			}
		});
		btnNewButton.setBounds(329, 237, 117, 29);
		contentPane.add(btnNewButton);
	}

}
