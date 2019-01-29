package com.kosmo.gui.demo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleTableDemo extends JPanel {
	private boolean DEBUG = false;
	JFrame frame;
	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SimpleTableDemo window= new SimpleTableDemo();
				window.frame.pack();
				window.frame.setVisible(true);
			}
		});
	}

    public SimpleTableDemo() {
        frame = new JFrame("SimpleTableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);


        String[] columnNames = {"EMPNO",
                                "EName",
                                "JOB",
                                "DEPTNO"};

        Object[][] data = {
        		{new Integer(7733),"SMITH","CLERK",new Integer(10)},
        		{new Integer(7788),"ALERN","MANAGER",new Integer(20)},
        		{new Integer(7799),"JONES","PRESIDENT",new Integer(30)}
        };


        DefaultTableModel model= new DefaultTableModel(data,columnNames);
        JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(500, 100));
        table.setFillsViewportHeight(true);
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    int rowIndex = table.getRowCount();
                    int columnIndex = table.getColumnCount();
                    TableModel model = table.getModel();
                    Object val=model.getValueAt(rowIndex, columnIndex);
                    System.out.println(rowIndex+","+columnIndex+","+val.toString());
                }
            });
        
        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
    }

//    private void printDebugData(JTable table) {
//        int numRows = table.getRowCount();
//        int numCols = table.getColumnCount();
//        javax.swing.table.TableModel model = table.getModel();
//
//        System.out.println("Value of data: ");
//        for (int i=0; i < numRows; i++) {
//            System.out.print("    row " + i + ":");
//            for (int j=0; j < numCols; j++) {
//                System.out.print("  " + model.getValueAt(i, j));
//            }
//            System.out.println();
//        }
//        System.out.println("--------------------------");
//    }
}