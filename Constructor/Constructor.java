package com.p;

public class Constructor 
{
	private int gId;
	private String gName;

	public Constructor(int gId,String gName)
	{
		this.gId=gId;
		this.gName=gName;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	
	public static void main(String[] args)
	{
	 Constructor c=new Constructor(102, "Ritesh Sir");
	 Constructor c1=new Constructor(53, "Ravi");
	 Constructor c2=new Constructor(91, "Priya");
	   c.setgName(c1.getgName(  ));
	 System.out.println(c.getgName());
	}

}
