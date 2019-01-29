package com.kosmo.gui.switc;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private int res=999;
	boolean bool = false;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			MyDialog dialog = new MyDialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	
//	public interface GetDialogResponse{
//	    void GetResponse(boolean response);
//	}
//	
	public void setRes(int a) {
		this.res = a;
	}
	public int getRes() {
		return this.res;
	}
	public MyDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
//						JOptionPane.showMessageDialog(MyDialog.this,
//	                            "ok click message",
//	                            "Login",
//	                            JOptionPane.INFORMATION_MESSAGE);
	                    setRes(1000);
	                    bool = true;
						System.out.println("ok click" + res + bool);
						//setVisible(false);
						//dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
