package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the size");
int n=s.nextInt();
LinkedList<String> list=new LinkedList<String>();
for(int i=0;i<n;i++)
{
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Enter the age");
	String age=s.next();
	System.out.println("Enter the number");
	String num=s.next();
	System.out.println("Enter the Email");
	String email=s.next();
	System.out.println("Enter the Place");
	String place=s.next();
	list.add(name);
	list.add(age);
	list.add(num);
	list.add(email);
	list.add(place);
}
Iterator itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
String st=s.next();
System.out.println("Size of list"+list.size());
System.out.println("List is "+list.isEmpty());
	}

}
