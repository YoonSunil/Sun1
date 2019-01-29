package com.kosmo.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Chatting extends JFrame {
	private JTextField txtId;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chatting frame = new Chatting();
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
	public Chatting() {
		getContentPane().setForeground(new Color(204, 153, 204));
		getContentPane().setBackground(new Color(204, 153, 204));
		setBackground(new Color(165, 42, 42));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 388);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		JFrame jf= new MyFrameClass();
		JButton button = new JButton("접속하기");
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					jf.setVisible(true);
					setVisible(false);
				}
			}
		});
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(204, 153, 204));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jf= new MyFrameClass();
				jf.setVisible(true);
				setVisible(false);
			}
		});
		
		JCheckBox chckbxAutologin = new JCheckBox("AutoLogin");
		chckbxAutologin.setBackground(new Color(204, 153, 204));
		chckbxAutologin.setForeground(new Color(0, 0, 0));
		
		JCheckBox chckbxRememberPassword = new JCheckBox("Remember PassWord");
		chckbxRememberPassword.setBackground(new Color(204, 153, 204));
		
		JTextPane txtpnSunsTalk = new JTextPane();
		txtpnSunsTalk.setBackground(new Color(204, 153, 204));
		txtpnSunsTalk.setForeground(new Color(0, 0, 0));
		txtpnSunsTalk.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 40));
		txtpnSunsTalk.setText("Sun1's Talk");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(237, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(154))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(button)
							.addGap(171))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(171)
					.addComponent(chckbxAutologin)
					.addGap(18)
					.addComponent(chckbxRememberPassword)
					.addContainerGap(122, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(115)
					.addComponent(txtpnSunsTalk, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(172, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(57, Short.MAX_VALUE)
					.addComponent(txtpnSunsTalk, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxAutologin)
						.addComponent(chckbxRememberPassword))
					.addGap(38))
		);
		getContentPane().setLayout(groupLayout);
		
	}
}
