package com.CollegeRegistration.entity;

public class College {

	private int CollegeID;
	private double rating;
	private String CollegeName;
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int collegeID, double rating, String collegeName) {
		super();
		CollegeID = collegeID;
		this.rating = rating;
		CollegeName = collegeName;
	}
	public int getCollegeID() {
		return CollegeID;
	}
	public void setCollegeID(int collegeID) {
		CollegeID = collegeID;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	@Override
	public String toString() {
		return "College [CollegeID=" + CollegeID + ", rating=" + rating + ", CollegeName=" + CollegeName + "]";
	}
	
}
