package collections;

import java.util.HashSet;
import java.util.Iterator;

public class setArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set=new HashSet<String>();
set.add("Ajith");
set.add("Abin");
set.add("Ronaldo");
set.add("Kroos");
set.add("Ajith");
set.add("alex");
Iterator<String> itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
