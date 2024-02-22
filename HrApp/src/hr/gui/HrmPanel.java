package hr.gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HrmPanel extends JPanel{
	private JLabel eidLabel;
	private JLabel enameLabel;
	private JLabel esalaryLabel;
	private JLabel edeptIdLabel;
	
	private JTextField eid;
	private JTextField ename;
	private JTextField esalary;
	private JTextField edeptId;
	
	public HrmPanel(){
		eidLabel=new JLabel("Employee Id:");
		enameLabel=new JLabel("Name:");
		esalaryLabel=new JLabel("Salary:");
		edeptIdLabel=new JLabel("Dept Id:");
		eid=new JTextField();
		ename=new JTextField();
		esalary=new JTextField();
		edeptId=new JTextField();
		this.setLayout(new GridLayout(4,4));
		this.add(eidLabel); this.add(eid);
		this.add(enameLabel); this.add(ename);
		this.add(esalaryLabel); this.add(esalary);
		this.add(edeptIdLabel); this.add(edeptId);
	}
}
