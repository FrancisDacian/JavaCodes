package com.empmanage;
import java.util.*;
import java.io.*;

public class Demo_EmpMan {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		EmpManage em = new EmpManage();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("choose what you want to do?");
			System.out.println("1.add a emp");
			System.out.println("2.find a emp");
			System.out.println("3.change the sal of a emp");
			System.out.println("4.fire a emp");
			System.out.println("5.quit");

			String operType = br.readLine();
			
			if(operType.equals("1"))
			{
				System.out.println("plz enter the no.");
				String empNo=br.readLine();
				System.out.println("plz enter the name.");
				String name=br.readLine();
				System.out.println("plz enter the sal.");
				float sal=Float.parseFloat(br.readLine());
				
				Emp emp = new Emp(empNo,name,sal);
				em.addEmp(emp);
				
			}
			else if(operType.equals("2"))
			{
				System.out.println("plz enter the emp need to be fund");
				String empNo=br.readLine();
				
				em.showInfo(empNo);
				
			}
			else if(operType.equals("3"))
			{
				System.out.println("plz enter the emp need to be changed sal");
				String empNo=br.readLine();
				System.out.println("plz enter the new sal");
				float newSal=Float.parseFloat(br.readLine());
				
				em.updateSal(empNo, newSal);
			}
			else if(operType.equals("4"))
			{
				System.out.println("plz enter the emp want to fire");
				String empNo=br.readLine();
				
				em.delEmp(empNo);;
			}
			else if(operType.equals("5"));
			{
				System.exit(0);
			}

			
		}
	}

}


class EmpManage
{
	private ArrayList al = null;
	
	public EmpManage()
	{
		al = new ArrayList();
	}
	
	public void addEmp(Emp emp)
	{
		al.add(emp);
	}
	
	public void showInfo(String empNo)

	{
		for(int i=0;i<al.size();i++)
		{
			Emp emp = (Emp)al.get(i);
			
			if(emp.getEmpNo().equals(empNo))
			{
				System.out.println("find the emp, hie info is");
				System.out.println("no is "+empNo);
				System.out.println("name is "+emp.getName());
				System.out.println("sal is "+emp.getSal());
			}
		}
	}
	
	public void updateSal(String empNo,float newSal)
	{
		for(int i=0;i<al.size();i++)
		{
			Emp emp = (Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo))
			{
				emp.setSal(newSal);
			}
		}
	}

	public void delEmp(String empNo)
	{
		for(int i =0;i<al.size();i++)
		{
			Emp emp=(Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo))
			{
				al.remove(i);
			}
		}
	}
}


class Emp
{
	private String empNo;
	private String name;
	private float sal;	
	
	
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	
	public Emp(String empNo, String name, float sal)
	{
		this.empNo=empNo;
		this.name=name;
		this.sal=sal;
		
	}
}
