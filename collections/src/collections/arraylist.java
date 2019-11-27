package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the Size");
int n=s.nextInt();
ArrayList list=new ArrayList();
for(int i=0;i<n;i++)
{
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Enter the age");
	int age=s.nextInt();
	list.add(name);
	list.add(age);
}
ArrayList list1=(ArrayList)list.clone();
System.out.println(list1.get(0));


Iterator itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}	
}
