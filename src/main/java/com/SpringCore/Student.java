package com.SpringCore;

public class Student {

	private int id;
	private String sName;
	private String sAdd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAdd() {
		return sAdd;
	}

	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String sName, String sAdd) {
		super();
		this.id = id;
		this.sName = sName;
		this.sAdd = sAdd;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sName=" + sName + ", sAdd=" + sAdd + "]";
	}
}
