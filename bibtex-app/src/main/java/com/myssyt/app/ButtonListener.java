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
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener{
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
         System.out.println("button pressed");
    }
}
