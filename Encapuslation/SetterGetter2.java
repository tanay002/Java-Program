package Encapsulation;

public class SetterGetter2 
{
private int nId;
private String empName;
private boolean checkValid;


public String getEmpName() {
	return empName;
}

public boolean isCheckValid() {
	return checkValid;
}

public void setnId(int nId)
{
	this.nId=nId;
}

public int getnId()
{
	return nId;
}

}
