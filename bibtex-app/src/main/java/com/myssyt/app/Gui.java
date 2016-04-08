/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myssyt.app;

/**
 *
 * @author jphkylli
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class Gui  implements Runnable{
    
    private JFrame frame;
    
    public Gui() {
        
    }
    
    @Override
    public void run() {
        frame = new JFrame("Bibtex manager");
        frame.setPreferredSize(new Dimension(560, 630));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {

       container.add(createButtons(), BorderLayout.CENTER);
       container.add(createTable(), BorderLayout.SOUTH);
       
    }
     
    private JPanel createButtons() {
        JPanel panel = new JPanel();

        JButton adder = new JButton("Add");
        adder.addActionListener(new ButtonListener());
        panel.add(adder);
        
        return panel;
    }
    
    private JTable createTable() {
        JTable table = new JTable();
        
        return table;
    }

    
}
