package com.example;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

class MyJComponent extends JComponent {  
    public void paint(Graphics g) {  
      g.setColor(Color.gray);  
      g.fillRect(30, 30, 100, 100);  
    }  
}  