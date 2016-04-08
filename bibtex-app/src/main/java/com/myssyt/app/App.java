package com.myssyt.app;

import javax.swing.SwingUtilities;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gui window = new Gui();
        SwingUtilities.invokeLater(window);
    }
}
