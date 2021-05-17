package collection;

import java.util.LinkedList;

public class Linked 
{
public static void main(String[] args) {
	
	LinkedList ls=new LinkedList();
	ls.add("Tanay");
	ls.add(20);
	ls.add('c');
	
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i));
	}
	
}
}
