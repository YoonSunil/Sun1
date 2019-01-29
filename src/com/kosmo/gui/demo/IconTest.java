package com.kosmo.gui.demo;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.kosmo.gui.switc.BFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class IconTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IconTest window = new IconTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IconTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon iCon=new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/switc/img/Open.jpg"));
		ImageIcon resizeico2 =new ImageIcon(iCon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		
		JLabel lblNewLabel = new JLabel(iCon);
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		
	}

}
