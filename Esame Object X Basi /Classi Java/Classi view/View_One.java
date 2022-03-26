package IV;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.List;
import javax.swing.JList;

public class View_One extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_One frame = new View_One();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View_One() {
		setTitle("View_One");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(20, 39, 216, 227);
		contentPane.add(textPane);
		
		List list = new List();
		list.setBounds(20, 144, 216, 122);
		contentPane.add(list);
		
		DefaultListModel listModel = new DefaultListModel();
		listModel.addElement(listModel);
		
		JList list_1 = new JList();
		list_1.setBounds(170, 70, -138, 27);
		contentPane.add(list_1);
	}
}
