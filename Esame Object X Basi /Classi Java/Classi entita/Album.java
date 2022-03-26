package IV;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Album extends JFrame {

	private JPanel contentPane;
	private JTextField txtVarchar;
	private JTextField txtDateamg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Album frame = new Album();
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
	public Album() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Album.class.getResource("/MarkI/Untitled.png")));
		setFont(new Font("Apple Color Emoji", Font.PLAIN, 12));
		setTitle("INSERIMENTO IN ALBUM");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(26, 49, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Anno");
		lblNewLabel_1.setBounds(26, 93, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JTextField txtVarchar = new JTextField();
		txtVarchar.setText("Varchar(20)");
		txtVarchar.setBounds(104, 44, 140, 26);
		contentPane.add(txtVarchar);
		txtVarchar.setColumns(10);
		
		JTextField txtDateamg = new JTextField();
		txtDateamg.setText("Date (a-m-g)");
		txtDateamg.setBounds(104, 88, 140, 26);
		contentPane.add(txtDateamg);
		txtDateamg.setColumns(10);
		
		JButton btnNewButton = new JButton("Invio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orclcdb","system","oracle");  
				System.out.println("CONNECTION STATUS = OK"); 
				java.sql.Statement stm=con.createStatement();
				int i=stm.executeUpdate("insert into album values (pk_album.nextval,'"+ txtVarchar.getText() +"',date '"+ txtDateamg.getText() +"')");
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
