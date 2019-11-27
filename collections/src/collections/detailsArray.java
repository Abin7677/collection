package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class detailsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the size");
int n=s.nextInt();
ArrayList list=new ArrayList();
Employee1 emp[]=new Employee1[n];
for( int i=0;i<n;i++)
{
	System.out.println("Enter name");
	String name=s.next();
	System.out.println("Enetr address");
	String addr=s.next();
	System.out.println("Enter Contact Number");
	int num=s.nextInt();
	System.out.println("Enter email");
	String email=s.next();
	System.out.println("Enter prooftype");
	String type=s.next();
	System.out.println("Enter Proof id");
	String id=s.next();
	emp[i]=new Employee1();
		System.out.println("Do you want update emailid(yes/no)");
		String up=s.next();
		if(up.contentEquals("yes")==true)
		{
			System.out.println("Enter your new email");
			String em=s.next();
			System.out.println("Email Updated");
			emp[i].setAddr(addr);
			emp[i].setName(name);
			emp[i].setNum(num);
			emp[i].setEmail(em);
			emp[i].setType(type);
			emp[i].setId(id);
			list.add(emp[i]);
		}
		else
		{
		emp[i].setAddr(addr);
		emp[i].setName(name);
		emp[i].setNum(num);
		emp[i].setEmail(email);
		emp[i].setType(type);
		emp[i].setId(id);
		
		}
		}
Iterator<Employee1> itr=list.iterator();//this iterator for printing the employees
int j=1;
while(itr.hasNext())
{
	Employee1 e=itr.next();
	System.out.println(e.getName());
	System.out.println(e.getAddr());
	System.out.println(e.getNum());
	System.out.println(e.getEmail());
	System.out.println(e.getType());
	System.out.println(e.getId());
	System.out.println("Thank u for registering. Your id is "+j);
	j++;
	System.out.println("Do you want continue registeration");
	String y=s.next();
	if(y.equals("yes"))
			{
		System.out.println("Thank You");
			}
}
System.out.println("List of employee");
int index=0;
Iterator<Employee1> itr1=list.iterator();//give index of employees
while(itr1.hasNext())
{
	Employee1 e=itr1.next();
	System.out.println(e.getName()+" - "+index);
	index++;
}


System.out.println("Do you want to delete any employee details(yes/no)");
String c=s.next();
if(c.contentEquals("yes"))
{
	System.out.println("Enter the employee id");
	int eid=s.nextInt();
	list.remove(emp[eid]);
	Iterator<Employee1> itr2=list.iterator();//showing remaining employees
	while(itr2.hasNext())
	{
		Employee1 e=itr2.next();
		System.out.println("Employee Details");
		//Employee1 e=itr2.next();
		System.out.println(e.getName());
		System.out.println(e.getAddr());
		System.out.println(e.getNum());
		System.out.println(e.getEmail());
		System.out.println(e.getType());
		System.out.println(e.getId());
		
	}
}


}
	
	}

class Employee1
{
String name,addr,email,em,type,id;
int num;
public String getEm() {
	return em;
}
public void setEm(String em) {
	this.em = em;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
}