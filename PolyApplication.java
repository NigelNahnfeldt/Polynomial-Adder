/*
 *  The main Application used to allow a user to add terms to a polynomial and add two polynomials.
 *  
 *  @author: Nigel Nahnfeldt
 *  @version: 1.0
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PolyApplication extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	
	private JButton addTermToPoly1, addTermToPoly2, addPolynomials, displayPoly1, displayPoly2;
    Polynomial poly1 = new Polynomial();
    Polynomial poly2 = new Polynomial();
    Polynomial poly3 = new Polynomial();
    
    public static void main(String[] args)
    {
        PolyApplication mainFrame = new PolyApplication();
        mainFrame.setSize(500, 175);
        mainFrame.setTitle("Polynomial Functions");
        mainFrame.creatGUI();
        mainFrame.setVisible(true);
    }
    
    public void creatGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        addTermToPoly1 = new JButton("Add Term to Polynomial 1");
        addTermToPoly1.addActionListener(new addTermToPoly1Action());
        window.add(addTermToPoly1);
        
        addTermToPoly2 = new JButton("Add Term to Polynomial 2");
        addTermToPoly2.addActionListener(new addTermToPoly2Action());
        window.add(addTermToPoly2);
        
        displayPoly1 = new JButton("Display Polynomial 1");
        displayPoly1.addActionListener(new displayPoly1Action());
        window.add(displayPoly1);
        
        displayPoly2 = new JButton("Display Polynomial 2");
        displayPoly2.addActionListener(new displayPoly2Action());
        window.add(displayPoly2);
        
        addPolynomials = new JButton("Add the two Polynomials");
        addPolynomials.addActionListener(new addPolynomialsAction());
        window.add(addPolynomials);
    }
    
    private class displayPoly1Action implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String displayPoly1 = poly1.toString();
            
            JOptionPane.showMessageDialog(null, "Polynomial 1 is: \n" + displayPoly1, 
                "Polynomial 1", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class displayPoly2Action implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String displayPoly2 = poly2.toString();
            
            JOptionPane.showMessageDialog(null, "Polynomial 2 is: \n" + displayPoly2, 
                "Polynomial 2", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class addTermToPoly1Action implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String inputString = JOptionPane.showInputDialog("Enter the term to add i.e(4.0,2)", 
                JOptionPane.INFORMATION_MESSAGE);
                
            String[] tokens = inputString.split(",");
                
            Term tempTerm = new Term(Float.parseFloat(tokens[0]),Integer.parseInt(tokens[1]));
            
            poly1.addTerm(tempTerm);
            String displayPoly1 = poly1.toString();
            
            JOptionPane.showMessageDialog(null, "Polynomial 1 is now: \n" + displayPoly1, 
                "Polynomial 1", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class addTermToPoly2Action implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String inputString = JOptionPane.showInputDialog("Enter the term to add i.e(4.0,2)", 
                JOptionPane.INFORMATION_MESSAGE);
                
            String[] tokens = inputString.split(",");
                
            Term tempTerm = new Term(Float.parseFloat(tokens[0]),Integer.parseInt(tokens[1]));
            
            poly2.addTerm(tempTerm);
            String displayPoly2 = poly2.toString();
            
            JOptionPane.showMessageDialog(null, "Polynomial 2 is now: \n" + displayPoly2, 
                "Polynomial 2", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private class addPolynomialsAction implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            poly1.add(poly2);
        }
    }
}
