package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class listArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
ArrayList list=new ArrayList();
list.add("hai");
list.add("welcome");
list.add("abin");
ArrayList list1=new ArrayList();
list1.add("java");
list1.add("program");
list.addAll(list1);
list.clear();
Iterator itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
