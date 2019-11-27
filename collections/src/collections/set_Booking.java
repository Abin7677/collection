package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class set_Booking {

	private static String[] Booking;
//	private static Object break;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int choice = 0;
String ac;
String cot;
String cable;
String wifi;
String laundry;
int total=0,b1,c,d,e,f;
String pr;
HashSet<String> set=new HashSet<String>();
//Booking[] b=new Booking[100];

do
{
	System.out.println("1)Book\n2)Check Status\n3)Exit");
	choice=s.nextInt();
	switch(choice)
	{
	case 1:
		int i=1;
		System.out.println("Booking");
		System.out.println("Please choose the services required");
		System.out.println("Enter room type(AC/nonAC");
		ac=s.next();
		if(ac.contentEquals("AC")==true)
		{
			b1=1500;
		}
		else
		{
			b1=700;
		}
		System.out.println("Enter bed type(single/double)");
		cot=s.next();
		if(cot.equals("Single")==true)
		{
			c=0;
		}
		else
		{
			c=350;
		}
		System.out.println("with cable/without cable connection(C/nC)");
		cable=s.next();
		if(cable.equals("C")==true)
		{
			d=50;
		}
		else
		{
			d=0;
		}
		System.out.println("with wifi/without wifi(W/nW)");
		wifi=s.next();
		if(wifi.equals("W")==true)
		{
				e=200;
			}
			else
			{
				e=0;
			}	
		System.out.println("Laundry services or not");
		laundry=s.next();
		if(laundry.equals("L")==true)
		{
			f=100;
		}
		else
		{
			f=0;
		}
		total=b1+c+d+e+f;
		System.out.println("The total charge is Rs."+total);
		System.out.println("The services chosen are");
		//b[i]=new Booking();
		if(b1==1500)
		{
			set.add(ac);
			System.out.println("AC choosed");
		}
		else
		{
		set.add(null);
		System.out.println("AC not selected");
		}
		
		if(c==350)
		{
			set.add(cot);
			System.out.println("Double cot selected");
			
		}
		else
		{
	    set.add(null);
	    System.out.println("Single cot selected");
		}
		if(d==50)
		{
	    set.add(cable);
	    System.out.println("with cable");
		}
		else
		{
			System.out.println("without cable");
		}
		if(e==200)
		{
		set.add(wifi);
		System.out.println("with wifi");
		}
		else
		{
		System.out.println("WiFi not enabled");
		}
		if(f==100)
		{
		set.add(laundry);
		System.out.println("with laundry");
		}
		else
		{
		System.out.println("No laundry service");
		}
	
	Iterator<String> itr=set.iterator();//this iterator for printing the employees
	int j=1;
	while(itr.hasNext())
	{
		String e1=itr.next();
		
}
	System.out.println("Thank u for registering. Your id is "+j);
j++;
break;
	case 2:
		

	}
	}while(choice!=0);

}}
