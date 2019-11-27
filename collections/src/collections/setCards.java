package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class setCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String symbol;
		int num,count=0;
Scanner sc=new Scanner(System.in);
Set<NewCard> s=new TreeSet<NewCard>(new Symbol());
NewCard c[]=new NewCard[40];
System.out.println("Enter the size");
int n=sc.nextInt();
while(s.size()<n)
{
	symbol=sc.next();
	num=sc.nextInt();
	c[count]=new NewCard();
	c[count].setSymbol(symbol);
	c[count].setNum(num);
	s.add(c[count]);
	count++;
}
System.out.println(n+" Sysmbols are gathered in "+count);
System.out.println("Cards are");
	Iterator<NewCard> itr=s.iterator();
	while(itr.hasNext())
	{
		NewCard c1=(NewCard)itr.next();
		System.out.println(c1.getSymbol()+" "+c1.getNum());
	}
}
}

/*class Symbol implements Comparator(NewCard)
{
	
}*/