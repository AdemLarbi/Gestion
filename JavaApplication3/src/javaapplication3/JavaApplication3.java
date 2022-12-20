/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.swing.UIManager;

/**
 *
 * @author wrx
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       try { 
           //com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
                   UIManager.setLookAndFeel("Metal"); 
        } catch (Exception ex) { 
                ex.printStackTrace(); 
           }
       
       
        new clientPanel().setVisible(true);
        
        
        
    }
    
}
