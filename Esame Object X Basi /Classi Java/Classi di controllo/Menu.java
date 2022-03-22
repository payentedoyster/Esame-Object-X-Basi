package IV;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.SwingConstants;
import java.awt.List;

import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.JTextField;


public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("HOME MENU");
		
		
		
		OracleConnection d=new OracleConnection();
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setForeground(new Color(0, 0, 0));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nuovo");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Nuovo Script");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_1 = new JMenu("Opzioni");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Crea");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Crea frame=new Crea();
				frame.setVisible(true);
				
			}
				
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Inserisci");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Inserimento frame=new Inserimento();
				frame.setVisible(true);
				
			}
				
		});
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Modifica");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Modifica frame=new Modifica();
				frame.setVisible(true);
				
			}
				
		});
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Visualizza");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Visualizza frame=new Visualizza();
				frame.setVisible(true);
				
			}
				
		});
		mntmNewMenuItem_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
					try {
							Script frame = new Script();
							frame.setVisible(true);
							
					}
					catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
				
		}});
		
		
		mntmNewMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				apriFile();
			}
				
		});
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	
	}
	
	
		


private void apriFile() {
    JFileChooser fileChooser = new JFileChooser();
    int r = fileChooser.showOpenDialog(this);

    if (r == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        // .....usa file
    }
}
}