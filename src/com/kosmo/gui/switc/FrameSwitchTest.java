package com.kosmo.gui.switc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class FrameSwitchTest extends JFrame {

	JPanel basicPanel;
	JTextField textField;
	JPanel apanel;
	JPanel bpanel;
	boolean toggle = false;
	JButton btnOpenbutton;
	JButton btnSendbutton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSwitchTest frame = new FrameSwitchTest();
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
	public FrameSwitchTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		basicPanel = new JPanel();
		basicPanel.setBackground(Color.YELLOW);
		basicPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		basicPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(basicPanel);
		
		JPanel northpanel = new JPanel();
		basicPanel.add(northpanel, BorderLayout.NORTH);
		northpanel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("basic>north>button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(toggle == false) {
					toggle = true;
					apanel.setVisible(false);
				}else if(toggle == true) {
					toggle = false;
					apanel.setVisible(true);
				}
				
			}
		});
		northpanel.add(btnNewButton, BorderLayout.EAST);
		
		
		
		
		
		btnOpenbutton = new JButton("openButton");
		btnOpenbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AFrame aframe = new AFrame(FrameSwitchTest.this);
//				aframe.setVisible(true);
				
				ApplicationSwitchTest appl = new ApplicationSwitchTest(FrameSwitchTest.this);
				appl.aframe.setVisible(true);
				
//				MyDialog d = new MyDialog();
//				d.setVisible(true);
//				System.out.println(d.bool);
//				if(d.bool == true) {
//					System.out.println(d.getRes()+"ssss");
//					textField.setText(d.getRes()+"ssss");
//				}
			}
		});
		northpanel.add(btnOpenbutton, BorderLayout.WEST);
		
		
//------------------------------------------
		btnSendbutton = new JButton("sendButton");
		northpanel.add(btnSendbutton, BorderLayout.SOUTH);	
//--------------------------------------------------------		
		
		textField = new JTextField();
		northpanel.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		
		apanel = new APanel(btnSendbutton,textField);  //new JPanel();
		apanel.setPreferredSize(new Dimension(450,100));
		basicPanel.add(apanel, BorderLayout.CENTER);
		
		bpanel = new BPanel();  //new JPanel();
		bpanel.setPreferredSize(new Dimension(450,100));
		basicPanel.add(bpanel, BorderLayout.SOUTH);
		
		
		
	}

}
