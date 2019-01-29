package com.kosmo.gui.switc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class APanel extends JPanel {
	JButton btnNewButton;
	/**
	 * Create the panel.
	 */
	public APanel(JButton btnSendbutton, JTextField textField) {
		setBackground(Color.BLUE);
		setLayout(new BorderLayout(0, 0));
		
		btnNewButton = new JButton("APanel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton, BorderLayout.WEST);
		btnSendbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText(textField.getText());
			}
		});
	}
	
	

}
