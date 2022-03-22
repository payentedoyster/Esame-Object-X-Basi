package IV;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crea extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crea frame = new Crea();
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
	public Crea() {
		setTitle("CREA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cosa vuoi creare?");
		lblNewLabel_1.setBounds(164, 6, 125, 16);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton NuovoDb = new JRadioButton("Crea nuovo DB");
		NuovoDb.setBounds(0, 47, 141, 23);
		contentPane.add(NuovoDb);
		
		JRadioButton NuovoTabella = new JRadioButton("Crea una tabella");
		NuovoTabella.setBounds(0, 82, 141, 23);
		contentPane.add(NuovoTabella);
		
		JRadioButton NuovoSequenza = new JRadioButton("Crea una sequenza");
		NuovoSequenza.setBounds(0, 117, 152, 23);
		contentPane.add(NuovoSequenza);
		
		JRadioButton NuovoAssertion = new JRadioButton("Crea un vincolo interrelazionale");
		NuovoAssertion.setBounds(164, 47, 280, 23);
		contentPane.add(NuovoAssertion);
		
		JRadioButton NuovoTrigger = new JRadioButton("Crea un trigger");
		NuovoTrigger.setBounds(164, 82, 141, 23);
		contentPane.add(NuovoTrigger);
		
		JRadioButton NuovoFunzione = new JRadioButton("Crea una funzione");
		NuovoFunzione.setBounds(164, 117, 206, 23);
		contentPane.add(NuovoFunzione);
		
		JRadioButton NuovoConstraint = new JRadioButton("Crea un vincolo interno");
		NuovoConstraint.setBounds(0, 152, 179, 23);
		contentPane.add(NuovoConstraint);
		
		JButton btnNewButton = new JButton("continua");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (NuovoDb.isSelected()) {
					
					CreaDb cb=new CreaDb();
					cb.setVisible(true);
					
					}
				
				if(NuovoTabella.isSelected()) {
						
					CreaTabella ct = new CreaTabella();
					ct.setVisible(true);
						
					}
				
				 if(NuovoTrigger.isSelected()) {
						
					 CreaTrigger ctr = new CreaTrigger();
					 ctr.setVisible(true);
				
					}
				 
				 if (NuovoConstraint.isSelected()) {
						
					 CreateConstraint cc= new CreateConstraint();
					 cc.setVisible(true);
			
			
				 }
				 if (NuovoSequenza.isSelected()) {
						
					 CreaSequenza cs = new CreaSequenza();
					 cs.setVisible(true);
				
					 }
				 if (NuovoAssertion.isSelected()) {
						
					 CreaAssertion ca=new CreaAssertion();
					 ca.setVisible(true);
				
					 }
				 if (NuovoFunzione.isSelected()) {
						
					 CreaFunzione cf=new CreaFunzione();
					 cf.setVisible(true);
				
				
					 }
				
			}
		});
		btnNewButton.setBounds(327, 237, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("indietro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(198, 237, 117, 29);
		contentPane.add(btnNewButton_1);
	}
}
