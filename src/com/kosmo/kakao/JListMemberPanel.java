package com.kosmo.kakao;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;

public class JListMemberPanel extends JPanel {

	JList<MemberVO> jList;    
	JScrollPane scroll; 
	
	public JListMemberPanel() {
		//--------------------샘플 데이터 ---------------------------------
		DefaultListModel<MemberVO> listModel = new DefaultListModel<>();
		listModel.addElement(new MemberVO("lee", "200638072", "011-89d-61s2","서울시"));
		listModel.addElement(new MemberVO("kim", "200638004", "011-8342-2323","김포시"));
		listModel.addElement(new MemberVO("park", "200638066", "010-8342-7895","서울시"));

		jList = new JList<MemberVO>(listModel);   
		jList.setBackground(Color.white);
		jList.setCellRenderer(new MyCellRenderer());

		jList.addMouseListener(new MouseAdapter(){ 
			public void mouseClicked(MouseEvent e){
				int index = jList.locationToIndex(e.getPoint());
				MemberVO vo = listModel.getElementAt(index);
				System.out.println(vo.Print());
			}
		});
		scroll = new JScrollPane(jList);   
		add(scroll);
	}
}

//-----------------------------------------------------------------------------
class MyCellRenderer extends JLabel implements ListCellRenderer<MemberVO> {
	private static final long serialVersionUID = 1L;
	public MyCellRenderer() {
		setOpaque(true);
	}
	@Override
	public Component getListCellRendererComponent(JList<? extends MemberVO> list, MemberVO vo, int index,
			boolean isSelected, boolean cellHasFocus) {

		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/" + vo.name + ".png"));
		//image resize ---------------------
		ImageIcon resizeImageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH ));
		setIcon(resizeImageIcon);
		setText(vo.name);
		if (isSelected) {
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		} else {
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		return this;
	}
}

//-----------------------------------------------------------------------------
class MemberVO {
	String name, id, number, adress;  

	public MemberVO(String name, String id, String number, String adress){
		this.name = name;  
		this.id = id;
		this.number = number;
		this.adress = adress;
	}
	public String toString(){
		return name;
	}
	public String Print(){
		return "이름 : " + name.toString() +"  학번 : " + id.toString()
		+"  핸드폰 : " + number.toString()+"  주소 : "  + adress.toString();
	}
}
