/* 
 * Angelina Toste
 * Final Project
 * CSCI 280
 * Due date: 08/01/2023
 * 
 * Purpose: create a calculator with the following buttons: numbers 0-9, characters ".", "+", "*", and "/", and buttons for delete and clear. Additional functionality has been added with the enter button which is used to submit the expressions typed into the calculator and to evaluate them based on the operators contained in the expression. 
 *
 */


import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

class calculator 
{
    calculator()
    {
        String text = "";
        JFrame frame = new JFrame();
        JTextField textfield =  new JTextField();
        JButton plus= new JButton("+"), minus= new JButton("-"), mult = new JButton("*"), div = new JButton("/"),
            b0 = new JButton("0"), b1 = new JButton("1"), b2 = new JButton("2"), b3 = new JButton("3"), b4 = new JButton("4"),
            b5 = new JButton("5"), b6 = new JButton("6"), b7 = new JButton("7"), b8 = new JButton("8"), b9 = new JButton("9"), 
            pt = new JButton("."), del = new JButton("Delete"), clr = new JButton("Clear"), ent = new JButton("Enter");

        textfield.setBounds(30, 0,250, 40);
        plus.setBounds(50, 50, 50, 50);
        minus.setBounds(100, 50, 50, 50);
        mult.setBounds(150, 50, 50, 50);
        div.setBounds(200, 50, 50, 50);
        b0.setBounds(50, 100, 50, 50);
        b1.setBounds(100, 100, 50, 50);
        b2.setBounds(150, 100, 50, 50);
        b3.setBounds(200, 100, 50, 50);
        b4.setBounds(50, 150, 50, 50);
        b5.setBounds(100, 150, 50, 50);
        b6.setBounds(150, 150, 50, 50);
        b7.setBounds(200, 150, 50, 50);
        b8.setBounds(50, 200, 50, 50);
        b9.setBounds(100, 200, 50, 50);
        pt.setBounds(150, 200, 100, 50);
        del.setBounds(50, 250, 100, 50);
        clr.setBounds(150, 250, 100, 50);
        ent.setBounds(50, 300, 200, 50);


        textfield.setColumns(200);
        frame.add(textfield);
        frame.add(plus);
        frame.add(minus);
        frame.add(mult);
        frame.add(div);
        frame.add(b0);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(pt);
        frame.add(del);
        frame.add(clr);
        frame.add(ent);
        
    
        frame.setSize(300, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        

        plus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + plus.getText()); 
            }
        });
        
        minus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + minus.getText()); 
            }
        });
        mult.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + mult.getText()); 
            }
        });
        div.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + div.getText()); 
            }
        });
        b0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b0.getText()); 
            }
        });
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b1.getText()); 
            }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b2.getText()); 
            }
        });
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b3.getText()); 
            }
        });
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b4.getText()); 
            }
        });
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b5.getText()); 
            }
        });
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b6.getText()); 
            }
        });
        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b7.getText()); 
            }
        });
        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b8.getText()); 
            }
        });
        b9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + b9.getText()); 
            }
        });
        pt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + pt.getText()); 
            }
        });
        del.addActionListener(new ActionListener()
        { // deletes last input or one character from the display
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                int txtLength = textfield.getText().length();
                textfield.setText(text.substring(0,txtLength - 1)); 
            }
        });
        clr.addActionListener(new ActionListener()
        {   // replaces all text within the textfield with ""
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(""); 
            }
        });
        ent.addActionListener(new ActionListener()
        {   // the submit button, performs the operators found within the textfield using the enter() function
            public void actionPerformed(ActionEvent e)
            {
                String text = textfield.getText();
                textfield.setText(text + "=" + enter(text));
                
            }
        });
        
        
    }
    public static String enter(String expression)
    {      // performs the computations based on what operator is in the expression
           String[] values;
           float result = 0;
           String printResult="";

           // the pattern we are looking for
           Pattern plusPattern = Pattern.compile("\\+"), minusPattern = Pattern.compile("-"), multPattern = Pattern.compile("\\*"),
                   divPattern = Pattern.compile("/");
           // the expression we are looking inside
           Matcher plusMatch = plusPattern.matcher(expression), minusMatch = minusPattern.matcher(expression), 
                   multMatch = multPattern.matcher(expression), divMatch = divPattern.matcher(expression);
           
           // true if a match exists, false if not
           boolean plusFound = plusMatch.find(), minusFound = minusMatch.find(), multFound = multMatch.find(), 
                   divFound = divMatch.find();
 
          
           if (plusFound)
           { 
               values = expression.split("\\+", 2);
               result = Float.parseFloat(values[0].trim()) + Float.parseFloat(values[1].trim());
               printResult = String.valueOf(result);

           }
           else if (minusFound)
           {    
                values = expression.split("-", 2);
                result = Float.parseFloat(values[0].trim()) - Float.parseFloat(values[1].trim());
                printResult = String.valueOf(result);
           }
           else if (multFound)
           {    
                values = expression.split("\\*", 2);
                result = Float.valueOf(values[0].trim()) * Float.valueOf(values[1].trim());
                printResult = String.valueOf(result);
           }
           else if (divFound)
           {    
                values = expression.split("/", 2);
                result = Float.valueOf(values[0].trim()) / Float.valueOf(values[1].trim());
                printResult = String.valueOf(result);
           }
           else
           {   // error message that prints when no operators are found in the expression
               printResult = "ERROR";
           }

           return printResult;
    }
    
    
    public static void main(String[] args)
    {
        new calculator();
    }


}
