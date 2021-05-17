package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer_Concept2
{
	public static void main(String[] args)
	{
		StringTokenizer t=new StringTokenizer("My name is Tanay Saxena");
		while(t.hasMoreElements())
		{
			System.out.println(t.nextElement());
		}
	}
}
