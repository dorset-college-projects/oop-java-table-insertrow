package com.dorsetcollegeoop;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DefaultTableModel tableModel = new DefaultTableModel();

        JTable table = new JTable(tableModel);

        tableModel.addColumn("Languages");

        tableModel.insertRow(0,new Object[]{"CSS"});
        tableModel.insertRow(0,new Object[]{"HTML5"});
        tableModel.insertRow(0,new Object[]{"JavaScript"});
        tableModel.insertRow(0,new Object[]{"Jquery"});
        tableModel.insertRow(0,new Object[]{"Angular"});
        tableModel.insertRow(tableModel.getRowCount(),new Object[]{"Node"});

        JFrame f = new JFrame();
        f.setSize(550,350);
        f.add(new JScrollPane(table));
        f.setVisible(true);






    }
}
