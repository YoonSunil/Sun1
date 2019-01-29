package com.kosmo.gui.switc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BFrame frame = new BFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	//AFrame a = new AFrame();
	//a.add()
	public BFrame(AFrame aframeNewAddr) { //String applStr) {
		//Frame 크기 설정
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(120, 120, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		ImageIcon iCon=new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/switc/img/Open.jpg"));
		ImageIcon resizeico2 =new ImageIcon(iCon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		mntmOpen.setIcon(resizeico2);
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmOpen);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_MASK));
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		ImageIcon icon =new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/switc/img/Close.jpg"));
		ImageIcon resizeicon =new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		mntmClose.setIcon(resizeicon);
		mnFile.add(mntmClose);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		ImageIcon ICON= new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/switc/img/Save.png"));
		ImageIcon resizeICON= new ImageIcon(ICON.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		mntmSave.setIcon(resizeICON);
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		//JPanel 설정
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.RED);

		
		JButton btnNewButton = new JButton("BFrame"+aframeNewAddr.applTextField.getText());
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		//Frame에 JPanel 올리기
		setContentPane(contentPane);
	}

}
