package com.thread.Annonymous;
//Anonymous Inner class that defines Inside method Arguments
public class AnnonymousThreadInterface_2d
{
	public static void main(String[] args)
	{
		new Thread(new Runnable()
		{
			public void run()
			{

				for(int i=0;i<2;i++)
				{
					System.out.println("child hai na");
				}

			}

		}).start();

		for(int i=0;i<2;i++)
		{
			System.out.println("childThread hai bhai");
		}
	}

}
