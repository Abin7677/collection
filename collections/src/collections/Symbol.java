package collections;

import java.util.Comparator;

public class Symbol implements Comparator<NewCard> {
	public int compare(NewCard c2, NewCard c3)
	{
		return c2.getSymbol().compareTo(c3.getSymbol());
	}
}
