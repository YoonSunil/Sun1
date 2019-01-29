
package com.kosmo.gui.demo;


import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
 
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
 
import java.net.URL;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Window;
import javax.swing.JButton;
import java.awt.FlowLayout;
 
public class TreeDemo extends JPanel implements TreeSelectionListener {
   
    private JEditorPane htmlPane;
    private JTree tree;  
    JFrame frame;
    JScrollPane topscroll;
    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TreeDemo window = new TreeDemo();
                window.frame.pack();
                window.frame.setVisible(true);
            }
        });
    }
    
    
    public TreeDemo() {
       frame = new JFrame("TreeDemo");

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("KOSMO 조직도");
        createNodes(top);   
        tree = new JTree(top);
        
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.addTreeSelectionListener(this);

        topscroll = new JScrollPane(tree);
 

        htmlPane = new JEditorPane();
        htmlPane.setEditable(false);
        JScrollPane buttomscroll = new JScrollPane(htmlPane);
 
        

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane.setTopComponent(topscroll);
        splitPane.setBottomComponent(buttomscroll);
 
        Dimension minimumSize = new Dimension(100, 50);
        buttomscroll.setMinimumSize(minimumSize);
        topscroll.setMinimumSize(minimumSize);
        splitPane.setDividerLocation(100); 
        splitPane.setPreferredSize(new Dimension(500, 300));

        frame.setContentPane(splitPane);
    }
 
    /** Required by TreeSelectionListener interface. */
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                           tree.getLastSelectedPathComponent();
 
        if (node == null) return;
        Object nodeInfo = node.getUserObject();
       
           BookInfoVO book = (BookInfoVO)nodeInfo;
           BookInfoVO vo = (BookInfoVO) node.getUserObject();
            htmlPane.setText(vo.id+", "+vo.pass);
           System.out.println("no leaf"+nodeInfo.toString());
           
           
        
    }
 
    private class BookInfoVO {
        public String id;
        public String pass;
 
        public BookInfoVO(String pid, String ppass) {
            id = pid;
            pass = ppass;
        }
        public String toString() {
            return id;
        }
    }
 
    private void createNodes(DefaultMutableTreeNode top) {


 
        DefaultMutableTreeNode topsub1 = new DefaultMutableTreeNode("영업부");
        top.add(topsub1);
 
        //original Tutorial

        DefaultMutableTreeNode leafNode = new DefaultMutableTreeNode(new BookInfoVO ("김대형","대머리"));
        topsub1.add(leafNode);
        
 
        //Tutorial Continued
        leafNode = new DefaultMutableTreeNode(new BookInfoVO("이문경","대머리"));
        topsub1.add(leafNode);
 
        //JFC Swing Tutorial
        leafNode = new DefaultMutableTreeNode(new BookInfoVO("박씨","123"));
        topsub1.add(leafNode);
 

        DefaultMutableTreeNode topsub2 = new DefaultMutableTreeNode("개발부");
        top.add(topsub2);
 
        //VM
        leafNode = new DefaultMutableTreeNode(new BookInfoVO("최씨", "2413"));
        topsub2.add(leafNode);
 
        //Language Spec
        leafNode = new DefaultMutableTreeNode(new BookInfoVO("이씨","4231"));
        topsub2.add(leafNode);
    }
         


}
