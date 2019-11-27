package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class array_encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String name;
int age;
int n=s.nextInt();
ArrayList list=new ArrayList();
Employee1 emp[]=new Employee1[n];
for(int i=0;i<n;i++)
{
	System.out.println("Enter the name");
	name=s.next();
	System.out.println("Enter the age");
	age=s.nextInt();
	emp[i]=new Employee1();
	emp[i].setAge(age);
	emp[i].setName(name);
	list.add(emp[i]);
}
Iterator<Employee1> itr=list.iterator();
while(itr.hasNext())
{
	Employee1 e=itr.next();
	System.out.println(e.getName()+" "+e.getAge());
}
	}
}
