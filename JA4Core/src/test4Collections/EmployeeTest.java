package test4Collections;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Employee> empList = new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		List<Employee> empList = new ArrayList<Employee>();
		while(true) {
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter company");
			String cmp = sc.next();
			System.out.println("If you want to continue y/n: ");
			String opt = sc.next();
			if(id !=0 && name != null && cmp!=null) {
				Employee emp = new Employee(id,name,cmp);
				empList.add(emp);
			}if(opt.contains("n")) {
				break;
			}
		}
		
		/*Employee e1 = new Employee();
		
		e1.SetId(1);
		e1.SetName("java");
		e1.SetCmp("CTS");
		
		Employee e2 = new Employee();
		
		e2.SetId(2);
		e2.SetName("python");
		e2.SetCmp("IBM");
		*/
		
		//empList.add(e1);
		//empList.add(e2);
		
		EmpDao edao = new EmpDao();
		edao.addEmp(empList);
		/*
		for(Employee emp:empList) {
			System.out.println("Emp Id: "+emp.getId()+" Emp Name: "+emp.getName()+" Emp Cmp: "+emp.getCmp());
		}*/
		List<Employee> emp = edao.listAll();
		for(Employee e : emp) {
			
		System.out.println("Emp Id: "+e.getId()+" Emp Name: "+e.getName()+" Emp Cmp: "+e.getCmp());
	}
	}
}

