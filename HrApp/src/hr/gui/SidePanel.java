package hr.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SidePanel extends JPanel{
	private JButton bAdd;
	private JButton bUpdate;
	private JButton bDelete;
	private JButton bSearch;
	
	public SidePanel(){
		this.setBackground(new Color(0, 0, 0));
		this.setLayout(new GridLayout(4,1));
		bAdd=new JButton("Add");
		bUpdate=new JButton("Update");
		bDelete=new JButton("Delete");
		bSearch=new JButton("Search");
		this.add(bAdd);
		this.add(bUpdate);
		this.add(bDelete);
		this.add(bSearch);
		
	}
}
