package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arrayRemove {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a name");
			String name=s.next();
			list.add(name);
		}
		//1ArrayList list1=(ArrayList)list.clone();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
