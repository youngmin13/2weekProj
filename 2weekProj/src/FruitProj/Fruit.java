package FruitProj;

import java.util.Comparator;

public class Fruit {
	private int no;
	String name;
	private int price;
	
	public Fruit(int no, String name, int price) {
		// TODO Auto-generated constructor stub
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
	
}

class FruitComparator implements Comparator<Fruit>
{
	@Override
	public int compare(Fruit o1, Fruit o2)
	{
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>
{
	@Override
	public int compare(Fruit o1, Fruit o2)
	{
		return o2.name.compareTo(o1.name);
	}
}