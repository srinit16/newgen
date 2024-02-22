package hr.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HrApp extends JFrame {
	private HrmPanel hp;
	private HeaderPanel header;
	private FooterPanel footer;
	private SidePanel side;
	public HrApp() {
		hp=new HrmPanel();
		header=new HeaderPanel();
		footer=new FooterPanel();
		side=new SidePanel();
		this.setSize(400,350);
		this.setLayout(new BorderLayout());
		this.add(hp, BorderLayout.CENTER);
		this.add(header, BorderLayout.NORTH);
		this.add(footer, BorderLayout.SOUTH);
		this.add(side, BorderLayout.EAST);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("HR Management System");
	}
	
	
	public static void main(String[] args) {
				new HrApp().setVisible(true);
	}
			

}
