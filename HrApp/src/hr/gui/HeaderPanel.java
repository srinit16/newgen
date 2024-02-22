package hr.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HeaderPanel extends JPanel{
	private JLabel header;
	
	public HeaderPanel(){
		header=new JLabel("Human Resource Management System");
		this.setBackground(new Color(100, 100, 200));
		this.setLayout(new FlowLayout());
		this.add(header);
		
	}
}
