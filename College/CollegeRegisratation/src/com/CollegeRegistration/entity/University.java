package com.CollegeRegistration.entity;

import java.util.List;

public class University {

	private int universityID;

	private String universityName;

	List<College> college;

	public int getUniversityID() {
		return universityID;
	}

	public void setUniversityID(int universityID) {
		this.universityID = universityID;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}

	public University(int universityID, String universityName, List<College> college) {
		super();
		this.universityID = universityID;
		this.universityName = universityName;
		this.college = college;
	}

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "University [universityID=" + universityID + ", universityName=" + universityName + ", college="
				+ college + "]";
	}

}
