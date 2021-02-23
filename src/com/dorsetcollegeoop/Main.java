package com.dorsetcollegeoop;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DefaultTableModel tableModel = new DefaultTableModel();

        JTable table = new JTable(tableModel);

      //  tableModel.addColumn("Languages");
       // tableModel.addColumn("Type");

        tableModel.setColumnIdentifiers(new String[]{"Language", "Type"});

        tableModel.insertRow(0,new Object[]{"CSS","FRONTEND"});
        tableModel.insertRow(0,new Object[]{"HTML5","FRONTEND"});
        tableModel.insertRow(0,new Object[]{"C#","SERVERSIDE"});
        tableModel.insertRow(0,new Object[]{"JavaScript","FRONTEND"});
        tableModel.insertRow(0,new Object[]{"Jquery","FRONTEND"});
        tableModel.insertRow(0,new Object[]{"Angular","FRONTEND"});
        tableModel.insertRow(tableModel.getRowCount(),new Object[]{"Node","BOTH"});

        JFrame f = new JFrame();
        f.setSize(550,350);
        f.add(new JScrollPane(table));
        f.setVisible(true);






    }
}
