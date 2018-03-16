package viewController;


import eccoursework.LoginFrame;
import eccoursework.MainMenu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javafx.scene.Parent;

/*  class:        ChildClosing.java
 *  Description:  This class closes the child window and re enables the parent window. 
 */
public class CloseChild extends WindowAdapter
{
   private JFrame childFrame;
	
	/**
    *  Method:         ChildClosing (Constructor)
    *
    *  Description:    Creates the ChildClosing class
    *  
    *  @param			f : The parent window
    */		
   public CloseChild(JFrame f)
   {
	   childFrame = f;
   }
		
   public void windowClosing(WindowEvent e)
   {
	   JOptionPane.showMessageDialog(null, "Closing Child");
           new LoginFrame().setVisible(true);
           childFrame.dispose();
   }	
}