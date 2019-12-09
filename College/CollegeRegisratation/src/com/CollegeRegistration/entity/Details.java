package com.CollegeRegistration.entity;

import java.util.Comparator;

public class Details {
	
	private int universityID;
	private String universityName;
	private int CollegeID;
	private double rating;
	private String CollegeName;

	public Details(int universityID, String universityName, int collegeID, double rating, String collegeName) {
		super();
		this.universityID = universityID;
		this.universityName = universityName;
		CollegeID = collegeID;
		this.rating = rating;
		CollegeName = collegeName;
	}

	public Details() {
		super();
		// TODO Auto-generated constructor stub

	}

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
		return "Details [universityID=" + universityID + ", universityName=" + universityName + ", CollegeID="
				+ CollegeID + ", rating=" + rating + ", CollegeName=" + CollegeName + "]";
	}

	public static Comparator<Details> ratingComparator = new Comparator<Details>()

	{

		@Override
		public int compare(Details d1, Details d2) {
			// TODO Auto-generated method stub
			if (d1.rating == d2.rating)
				return 0;
			else if (d1.rating < d2.rating)
				return 1;
			else
				return -1;
		}

	};

}
