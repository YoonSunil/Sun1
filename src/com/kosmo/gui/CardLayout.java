package com.kosmo.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CardLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayout frame = new CardLayout();
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
	CardLayout cardLayout;
	JPanel cardPanel;
	JPanel panelA;
	JPanel panelB;
	public CardLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		contentPane.add(buttonpanel, BorderLayout.NORTH);
		
		cardPanel = new JPanel();
		cardPanel.setLayout(new java.awt.CardLayout(0, 0));
		contentPane.add(cardPanel, BorderLayout.CENTER);
		
		panelA = new JPanel();
		panelA.setBackground(Color.MAGENTA);
		cardPanel.add(panelA, "add_name_AAAA");
		
		panelB = new JPanel();
		panelB.setBackground(Color.CYAN);
		cardPanel.add(panelB, "add_name_BBBB");
		
		JButton ABotton = new JButton("ABotton");
		ABotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.setVisible(false);
				cardLayout.show(cardPanel,"add_name_AAAA");
			}
		});
		buttonpanel.add(ABotton);
		
		JButton BBotton = new JButton("BButton");
		BBotton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.setVisible(false);
				cardLayout.show(cardPanel,"add_name_BBBB");
			}
		});
		buttonpanel.add(BBotton);
		
		
	}
	protected void show(JPanel cardPanel2, String string) {
		// TODO Auto-generated method stub
		
	}

}
