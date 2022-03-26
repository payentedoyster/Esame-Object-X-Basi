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

public class ModificaUtente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificaUtente frame = new ModificaUtente();
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
	public ModificaUtente() {
		setTitle("MODIFICA UTENTE");
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
		Elimina.setBounds(6, 122, 187, 23);
		contentPane.add(Elimina);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(Aggiungi.isSelected()) {
					
					SelezioneModificaAddUtente sma = new SelezioneModificaAddUtente();
					sma.setVisible(true);
					
				}
				
				if(ModificaNome.isSelected()) {
					
					SelezioneModificaNomeUtente smn = new SelezioneModificaNomeUtente();
					smn.setVisible(true);

				}
				if(ModificaTipo.isSelected()) {
					
					SelezioneModificaTipoUtente smt = new SelezioneModificaTipoUtente();
					smt.setVisible(true);
					

				}
				if(Elimina.isSelected()) {
	
					SelezioneModificaCancellazioneUtente smc = new SelezioneModificaCancellazioneUtente();
					smc.setVisible(true);
					

				}
				
			}
		});
		btnNewButton.setBounds(327, 237, 117, 29);
		contentPane.add(btnNewButton);
		
		
	}

}
