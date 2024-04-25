package com.javabaconfi;

public class AddressBean {
	private int hno;
	private String city;
	private StudentBean stdbean;

	public AddressBean() {
		super();
	}

	@Override
	public String toString() {
		return "AddressBean [hno=" + hno + ", city=" + city + ", stdbean=" + stdbean + "]";
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public StudentBean getStdbean() {
		return stdbean;
	}

	public void setStdbean(StudentBean stdbean) {
		this.stdbean = stdbean;
	}

}
