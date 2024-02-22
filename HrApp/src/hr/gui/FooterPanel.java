package hr.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FooterPanel extends JPanel{
	private JLabel footer;
	
	public FooterPanel(){
		footer=new JLabel("© 2024 Human Resource Management System. All rights reserved.");
		this.setLayout(new FlowLayout());
		this.setBackground(new Color(200, 100, 200));
		this.add(footer);
		
	}
}
