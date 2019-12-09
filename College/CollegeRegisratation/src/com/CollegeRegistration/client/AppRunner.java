package com.CollegeRegistration.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.CollegeRegistration.entity.Details;
import com.CollegeRegistration.exceptions.DuplicateUniversityException;
import com.CollegeRegistration.exceptions.InvalidRatingException;
import com.CollegeRegistration.exceptions.ServiceException;
import com.CollegeRegistration.service.CollegeService;
import com.CollegeRegistration.service.UniversityService;
import com.CollegeRegistration.service.impl.CollegeServiceImpl;
import com.CollegeRegistration.service.impl.UniversityServiceImpl;

public class AppRunner {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		UniversityService uService = new UniversityServiceImpl();
		CollegeService cService = new CollegeServiceImpl();
		int choice;
		do {
			System.out.println(
					"1.Register university\n2.Register college\n3.Display college list on rating\n4.display details\n5.Exit\nEnter your choice ");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				ArrayList<Integer> list;
				System.out.println("ente uid");
				int universityId = scan.nextInt();
				System.out.println("enter uname");
				String universityName = scan.next();
				try {
					String ms = uService.validateUniversityID(universityId);
					String msg = uService.inUniversity(universityId, universityName);
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				ArrayList<Integer> list1;
				try {
					list1 = uService.getUids();
					System.out.println("universities are");
					for (Integer integer : list1) {
						System.out.println(integer);
					}
					System.out.println("enter university id");
					int universityId1 = scan.nextInt();
					try {
						String m = uService.validateUniversity(universityId1);

						System.out.println("enter college id");
						int collegeId = scan.nextInt();
						System.out.println("enter college name");
						String collegeName = scan.next();
						System.out.println("enter rating of the college");
						double rating = scan.nextDouble();

						try {
							String ms = cService.validateRating(rating);
							String msgg = cService.inCollege(universityId1, collegeId, collegeName, rating);
						}

						catch (ServiceException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
					} catch (ServiceException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}

				break;
			case 3:
				ArrayList<Details> details = new ArrayList<>();

				System.out.println("enter id of university");
				int uid = scan.nextInt();
				try {
					String m = uService.validateUniversity(uid);
					details = uService.getDetails(uid);
					Collections.sort(details, Details.ratingComparator);
					for (Details details2 : details) {
						System.out.println(details2);
					}
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 4:

				ArrayList<Details> dl = new ArrayList<>();

				System.out.println("enter rating");

				double ratingtoSearch = scan.nextDouble();
				try {
					String message = cService.validateRating(ratingtoSearch);
					dl = uService.getDetails(ratingtoSearch);
					for (Details details2 : dl) {
						System.out.println(details2);
					}
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

				}

				break;
			case 5:
				System.exit(0);
			}
		} while (choice <= 5);
	}
}
