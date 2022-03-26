package IV;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ModificaArtista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificaArtista frame = new ModificaArtista();
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
	public ModificaArtista() {
		setTitle("MODIFICA ARTISTA");
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
		ModificaTipo.setBounds(6, 87, 237, 23);
		contentPane.add(ModificaTipo);
		
		JRadioButton Elimina = new JRadioButton("Elimina un attributo");
		Elimina.setBounds(5, 5, 440, 262);
		contentPane.add(Elimina);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(Aggiungi.isSelected()) {
					
					SelezioneModificaAddArtista sma = new SelezioneModificaAddArtista();
					sma.setVisible(true);
					
				}
				
				if(ModificaNome.isSelected()) {
					
					SelezioneModificaNomeArtista smn = new SelezioneModificaNomeArtista();
					smn.setVisible(true);

				}
				if(ModificaTipo.isSelected()) {
					
					SelezioneModificaTipoArtista smt = new SelezioneModificaTipoArtista();
					smt.setVisible(true);
					

				}
				if(Elimina.isSelected()) {
	
					SelezioneModificaCancellazioneArtista smc = new SelezioneModificaCancellazioneArtista();
					smc.setVisible(true);
					

				}
				
			}
		});
		
		button.setBounds(327, 238, 117, 29);
		contentPane.add(button);
	}

}
