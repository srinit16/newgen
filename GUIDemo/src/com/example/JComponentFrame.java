package com.example;

import javax.swing.JFrame;

public class JComponentFrame {
	public static void main(String[] arguments) {  
        MyJComponent com = new MyJComponent();  
        // create a basic JFrame  
        JFrame.setDefaultLookAndFeelDecorated(true);  
        JFrame frame = new JFrame("JComponent Example");  
        frame.setSize(300,200);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        // add the JComponent to main frame  
        frame.add(com);  
        frame.setVisible(true);  
        
        /* JFrame f= new JFrame("TextField Example");  
		    JTextField t1,t2;  
		    t1=new JTextField("Welcome to Javatpoint.");  
		    t1.setBounds(50,100, 200,30);  
		    t2=new JTextField("AWT Tutorial");  
		    t2.setBounds(50,150, 200,30);  
		    f.add(t1); f.add(t2);  
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);  
    }  */
      }  

}
