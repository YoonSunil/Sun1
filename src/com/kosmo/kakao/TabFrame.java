package com.kosmo.kakao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

//https://docs.oracle.com/javase/tutorial/uiswing/components/tabbedpane.html


public class TabFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabFrame frame = new TabFrame();
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
	public TabFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JTabbedPane tabbedPane = new JTabbedPane();
		//ImageIcon icon = createImageIcon("images/middle.gif");
		ImageIcon icon = new ImageIcon(getClass().getResource("/images/fr.png"));
		
		//JComponent panel1 = makeTextPanel("Panel #1");
		JPanel panel1 = new JListMemberPanel();
		panel1.setLayout(new GridLayout(1, 1));
		tabbedPane.addTab("친구목록", icon, panel1,"1번째탭");

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 1));
		tabbedPane.addTab("이전대화", icon, panel2,"2번째탭");
		JLabel label = new JLabel("대화대화");
        panel2.add(label);
        

		JComponent panel3 = makeTextPanel("Panel #3");
		tabbedPane.addTab("Tab 3", icon, panel3,"3번째탭");
		tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

		JComponent panel4 = makeTextPanel("Panel resize");
		panel4.setPreferredSize(new Dimension(400, 600));
		tabbedPane.addTab("Tab 4", icon, panel4,"4번째탭");
		tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
		
//		contentPane.add(panel1);
//		contentPane.add(panel2);
//		contentPane.add(panel3);
//		contentPane.add(panel4);
		
		 add(tabbedPane);
         tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	   
	}
	
	protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(label);
        return panel;
    }
     
    
//    protected static ImageIcon createImageIcon(String path) {
//        java.net.URL imgURL = TabFrame.class.getResource(path);
//        if (imgURL != null) {
//            return new ImageIcon(imgURL);
//        } else {
//            System.err.println("Couldn't find file: " + path);
//            return null;
//        }
//    }

}
