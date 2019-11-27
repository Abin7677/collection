package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arrayList_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int choice;
		ArrayList list = new ArrayList();
		String app;
		do {
		System.out.println("1)Display installed application\n2)Install an application"+ "\n3)Uninstall an application\n4)Quit");
		choice = s.nextInt();
		switch (choice) {
		case 1: 
		{
		if (list.isEmpty())
		{
		System.out.println("no pplication is installed");
		} 
		else 
		{

		System.out.println("installed application are");
		Iterator itr = list.iterator();// iteration object is created
		int i = 1;
		while (itr.hasNext()) 
		{

		System.out.println(i + ")" + itr.next());
		i++;
		}
		}
		break;
		}
		case 2: 
		{
		   System.out.println("enter name");
		   app = s.next();
		   list.add(app);
		   System.out.println("application installed successfully");
		   }
		   break;
        case 3: 
        {
		   if (list.isEmpty())
		   {
		   System.out.println("no application is installed");
		   }
		   else
		   {
		   System.out.println("installed application are");
		   Iterator itr = list.iterator();// iteration object is created
		   int i = 1;
		   while (itr.hasNext()) 
		   {

	    	System.out.println(i + ")" + itr.next());
		    i++;
		    }
		   System.out.println("enter the application number");
		   int q = s.nextInt();

		   if (q> i)
		   {
		   System.out.println("application not found");
		   }
		  list.remove(q - 1);
		   System.out.println("Application uninstalled successfully");
		break;

		}}

		}
		} while (choice != 0);

		}

		}