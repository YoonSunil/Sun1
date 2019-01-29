//package com.kosmo.kakao;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//import com.kosmo.gui.MyFrameClass;
//
//import net.codejava.swing.Country;
//
//import java.util.*;
//
//
//public class JListMemberTest extends JFrame {
//	private JPanel contentPanel;
//	JList<MemberVO> jList;    
//	JScrollPane scroll; 
//
//
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					
//					JListMemberTest frame = new JListMemberTest();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
//
//	//-----------------------------------------------------------------------------
//	public JListMemberTest() {
//		
//		setBounds(100, 100, 450, 300);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		contentPanel = new JPanel();
//		contentPanel.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPanel);
//		
//		//--------------------샘플 데이터 ---------------------------------
//		DefaultListModel<MemberVO> listModel = new DefaultListModel<>();
//		listModel.addElement(new MemberVO("lee", "200638072", "011-89d-61s2","서울시"));
//		listModel.addElement(new MemberVO("kim", "200638004", "011-8342-2323","김포시"));
//		listModel.addElement(new MemberVO("park", "200638066", "010-8342-7895","서울시"));
//
//		jList = new JList<MemberVO>(listModel);   
//		jList.setBackground(Color.white);
//		jList.setCellRenderer(new MyCellRenderer());
//
//		jList.addMouseListener(new MouseAdapter(){ 
//			public void mouseClicked(MouseEvent e){
//				int index = jList.locationToIndex(e.getPoint());
//				MemberVO vo = listModel.getElementAt(index);
//				System.out.println(vo.Print()); 
//			}
//		});
//		scroll = new JScrollPane(jList);    
//		getContentPane().add(scroll, BorderLayout.CENTER); 
//		
//		setDefaultCloseOperation(EXIT_ON_CLOSE); // frame 종료시 
//		setSize(400,300);     // frame 크기
//		setVisible(true);     // 화면에 보여주기
//	}
//
//}
////-----------------------------------------------------------------------------
//class MyCellRenderer extends JLabel implements ListCellRenderer<MemberVO> {
//	private static final long serialVersionUID = 1L;
//	public MyCellRenderer() {
//		setOpaque(true);
//	}
//	@Override
//	public Component getListCellRendererComponent(JList<? extends MemberVO> list, MemberVO vo, int index,
//			boolean isSelected, boolean cellHasFocus) {
//
//		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/" + vo.name + ".png"));
//		//image resize ---------------------
//		ImageIcon resizeImageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH ));
//		setIcon(resizeImageIcon);
//		setText(vo.name);
//		if (isSelected) {
//			setBackground(list.getSelectionBackground());
//			setForeground(list.getSelectionForeground());
//		} else {
//			setBackground(list.getBackground());
//			setForeground(list.getForeground());
//		}
//		return this;
//	}
//}
//
////-----------------------------------------------------------------------------
//class MemberVO {
//	String name, id, number, adress;  
//
//	public MemberVO(String name, String id, String number, String adress){
//		this.name = name;  
//		this.id = id;
//		this.number = number;
//		this.adress = adress;
//	}
//	public String toString(){
//		return name;
//	}
//	public String Print(){
//		return "이름 : " + name.toString() +"  학번 : " + id.toString()
//		+"  핸드폰 : " + number.toString()+"  주소 : "  + adress.toString();
//	}
//}
//
//
