package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class coll_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String name;
int age;
Map<Integer,Employee> map=new HashMap<Integer,Employee>();
Employee emp[]=new Employee[n];
for(int i=0;i<n;i++)
{
	name=s.next();
	age=s.nextInt();
	emp[i]=new Employee();
	emp[i].setName(name);
	emp[i].setAge(age);
	map.put(i, emp[i]);
}
for(Map.Entry<Integer, Employee> entry:map.entrySet())
{
	int key=entry.getKey();
	Employee e=entry.getValue();
	System.out.println(key+e.getName()+e.getAge());
}
s.close();
	}
}
