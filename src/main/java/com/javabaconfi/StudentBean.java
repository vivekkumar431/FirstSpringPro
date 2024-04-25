package com.javabaconfi;

public class StudentBean {
	private int stuId;
	private String stuName;
	private String cName;

	public StudentBean(int stuId, String stuName, String cName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.cName = cName;
	}

	public StudentBean() {
		super();
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "StudentBean [stuId=" + stuId + ", stuName=" + stuName + ", cName=" + cName + "]";
	}

}
