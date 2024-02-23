package hr.gui.event;
import hr.dao.*;
import hr.data.Employee;
import hr.gui.HrmPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeFormEvent implements ActionListener {
	private HrmPanel hp;
	public EmployeeFormEvent(HrmPanel hp) {
		this.hp=hp;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		EmployeeDao dao=new EmployeeDaoImpl();
		String s=e.getActionCommand();
		switch(s.trim()) {
		case "Search":
				int id=Integer.parseInt(hp.getEid().getText());
			try {
				Employee emp=dao.find(id);
				
				hp.getEname().setText(emp.getName());
				hp.getEsalary().setText(""+emp.getSalary());
				hp.getEdeptId().setText(""+emp.getDeptId());
			} catch (EmployeeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Add":
			
		}
		
	}
		
}
