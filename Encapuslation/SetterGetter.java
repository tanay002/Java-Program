package Encapsulation;

public class SetterGetter
{
	private int nId;
	private String empName;
	private boolean validAge;
/*
	public void setnId(int nId)
	{
		this.nId=nId;
	}

	public void setEmpName(String empName)
	{
		this.empName=empName;
	}

	public void setValidAge(boolean validAge)
	{
		this.validAge=validAge;
	}
	
	*/
	public void setnId(int nId) {
		this.nId = nId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setValidAge(boolean validAge) {
		this.validAge = validAge;
	}
	
	public int getnId()
	{
		return nId;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	public boolean isValidAge() {
		return validAge;
	}
	
	
	
}
