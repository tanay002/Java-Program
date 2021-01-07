package com.practice;

import java.util.ArrayList;
import java.util.List;

public final class Student 
{
private final int sid;
private final String sname;
private final ArrayList<Address> ans;

public Student(int sid, String sname, ArrayList<Address> ans) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.ans = (ArrayList<Address>) ans.clone();
}
public int getSid() {
	return sid;
}
public String getSname() {
	return sname;
}
public ArrayList<Address> getAns() {
	return (ArrayList<Address>) ans.clone();
}


}
