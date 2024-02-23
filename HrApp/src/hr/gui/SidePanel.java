package hr.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hr.gui.event.EmployeeFormEvent;

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
	public void registerEvent(HrmPanel hp){
				bAdd.addActionListener(new EmployeeFormEvent(hp));
				bUpdate.addActionListener(new EmployeeFormEvent(hp));
				bDelete.addActionListener(new EmployeeFormEvent(hp));
				bSearch.addActionListener(new EmployeeFormEvent(hp));
	}
}
