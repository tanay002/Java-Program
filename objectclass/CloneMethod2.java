package com.object;
interface A
{
	void demo();
}
abstract class B implements A
{
	public void demo()
	{
		
	}
}
class C extends B
{
	//int sid;
	//int Sid;
	int sId;

	public int getsId() {
		return sId;
	}

	/*public int getSid() {
		return Sid;
	}
*/
/*	public void setSid(int sid) {
		this.sid = sid;
	}
	*/

}
public class CloneMethod implements Cloneable
{
	int id;
	
	CloneMethod(int id)
	{
		this.id=id;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public String toString()
	{
		return ""+id;
	}
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		CloneMethod f=new CloneMethod(101);
		CloneMethod f1=(CloneMethod) f.clone();
		System.out.println(f1);
		f.id=201;
		System.out.println(f1);
		System.out.println(f);
	}
}
