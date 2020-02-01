package AP_Exam;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/** Menu<br>
 * Entry point for project
 * 
 * @author 3rd Period Class
 *
 *
 */
public class MenuControl extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuControl frame = new MenuControl();
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
	public MenuControl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		// JLabel with image 
	
        
        // Content Panel to add Label and Image
        //https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html
        Container content = getContentPane();
        content.setBackground(new Color(100,100,255));
     
        
        // Menu Objects 
        JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
        
		JMenu mnHone = new JMenu("Home");
		menuBar.add(mnHone);
		
		JMenuItem mntmPreferences = new JMenuItem("Preferences");
		mnHone.add(mntmPreferences);
		
		JMenu mnApTest = new JMenu("AP Test");
		menuBar.add(mnApTest);
		
		JMenuItem mntmApReview = new JMenuItem("Review");
		mntmApReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_UI frame = new AP_UI();
				frame.setVisible(true);
			}
		});
		mnApTest.add(mntmApReview);
		
		JMenu mnIntro = new JMenu("Intro");
		menuBar.add(mnIntro);
		
		JMenuItem mntmOriginal = new JMenuItem("Jumpers");
		mnIntro.add(mntmOriginal);
		
		JMenuItem mntmInputs = new JMenuItem("Pythagorean");
		mnIntro.add(mntmInputs);
		
		JMenu mnLabs = new JMenu("Labs");
		menuBar.add(mnLabs);
		
		JMenuItem mntmShorthand = new JMenuItem("Shorthand");
		mnLabs.add(mntmShorthand);
		
		JMenuItem mntmLinkedLists = new JMenuItem("Add"); 
	
	
		mnLabs.add(mntmLinkedLists);
		JMenuItem mntmPalindrom = new JMenuItem("Palindrom 3");
		mntmPalindrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PalindromeUI frame = new PalindromeUI();
				frame.setVisible(true);			
			}
		});
		mnLabs.add(mntmPalindrom);
		
		JMenu mnJig = new JMenu("Jigsaw");
		menuBar.add(mnJig);
		
		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator frame = new Calculator();
				frame.setVisible(true);		
			}
		});
		mnJig.add(mntmCalculator);

		
		
	}
	
}
