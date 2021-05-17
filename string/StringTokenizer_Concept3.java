package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer_Concept3
{
	public static void main(String[] args)
	{
		StringTokenizer t=new StringTokenizer("My name is Tanay Saxena");
	  int c=t.countTokens();
		while(t.hasMoreTokens())
		{
			System.out.println(t.nextToken("a"));
		}
	System.out.print(c);
	}
}
