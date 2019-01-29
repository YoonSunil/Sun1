package com.kosmo.gui.switc;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ApplicationSwitchTest {

	//private JFrame frame;
	AFrame aframe;
	BFrame bframe;  //extends JFrame
 
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ApplicationSwitchTest window = new ApplicationSwitchTest();
//					//window.frame.setVisible(true);
//					     //frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public ApplicationSwitchTest(FrameSwitchTest frmADDR) {
//		frame = new JFrame(); ////////////
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		JButton btnNewButton = new JButton("BFrame 실행");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				//frame.setVisible(false);
//				aframe.setVisible(false);
//				
//				bframe = new BFrame();
//				bframe.setVisible(true);
//			}
//		});
		
		//==패널 Container.window.jcomponenet.add()
		//frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
		//         contentPane.add(btnNewButton
				
		//==frame.add(panel)
		//setContentPane(contentPane);
		
		aframe = new AFrame(frmADDR);
		aframe.setVisible(true);
		
	}

	

}
