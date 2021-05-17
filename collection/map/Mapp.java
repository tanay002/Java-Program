package collection;

import java.util.HashMap;
import java.util.Map;

public class Mapp 
{
	static void demo() throws RuntimeException,ArithmeticException
	{
		int i=10/0;
	}
	
public static void main(String[] args) {
	
	demo();
	 Map<Integer,String> m=new HashMap<Integer,String>();
                    m.put(101, "Tanay");
                    m.put(202,"Kalo");
                  int i=  m.size();

                	 Object o=m.get(101);
                	 System.out.println(o);
                  
}
}
