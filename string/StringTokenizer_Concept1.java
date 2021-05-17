package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer_Concept1
{
	public static void main(String[] args)
	{
		StringTokenizer t=new StringTokenizer("My name is Tanay Saxena");
		while(t.hasMoreTokens())
		{
			System.out.println(t.nextToken());
		}
	}
}
