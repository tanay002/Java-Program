package com.polymorphism_concept;
//In overriding,jiska object uski method

//Public ParentMethod and Public ChildMethod


/*   Visibility Rule- Private ,default,protected,public
 
     Parent Class             child Class
     1.) public          -        public
     
     2.) default                  default
                                  protected
                                  public
                                  
     3.)Protected                 Protected
                                  public
                                  
     4.)ParentMethod Can't be private   -
*/
public class VisibilityConcept_In_Overriding1
{

	public static void main(String[] args)
	{
      Branch a=new Branch();
      a.main();
      Subject b=new Subject();
      b.main();
      Branch a1=new Subject();
      a1.main();
      
    //  B b1=new A(); Cannot convert from A to B  (B=small class and A=higher class)
	}
}

class Branch
{
	public void main()
	{
		System.out.println("main method of Branch");
	}

}

class Subject extends Branch
{
	public void main()
	{
		System.out.println("main method of Subject");
	}

}