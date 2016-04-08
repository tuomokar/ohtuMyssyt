/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myssyt.app;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author omena
 */
public class ViiteTableModel extends AbstractTableModel{

    public int getRowCount() {
        return 10;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getColumnCount() {
        return 10;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return new Object(); //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
