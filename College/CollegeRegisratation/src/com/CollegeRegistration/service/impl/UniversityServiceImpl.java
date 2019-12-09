package com.CollegeRegistration.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import com.CollegeRegistration.dao.UniversityDao;
import com.CollegeRegistration.dao.daoimpl.UniversityDaoImpl;
import com.CollegeRegistration.entity.Details;
import com.CollegeRegistration.exceptions.DaoException;
import com.CollegeRegistration.exceptions.DuplicateUniversityException;
import com.CollegeRegistration.exceptions.NoSuchUniversityException;
import com.CollegeRegistration.exceptions.ServiceException;
import com.CollegeRegistration.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {

	UniversityDao uDao = new UniversityDaoImpl();

	@Override
	public String inUniversity(int universityId, String universityName) throws ServiceException {
		// TODO Auto-generated method stub
		String msg;
		try {
			uDao.inUniversityDao(universityId, universityName);
			msg="data inserted successfully";
		}

		catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		}
		return msg;
	}

	@Override
	public ArrayList<Integer> getUids() throws ServiceException {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		try {
			al = uDao.getUidsDao();
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		}
		return al;
	}

	@Override
	public ArrayList<Details> getDetails(int uid) throws ServiceException {
		// TODO Auto-generated method stub
		ArrayList<Details> list;
		try {
			list = uDao.getDetailsDao(uid);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		}
		return list;
	}

	@Override
	public ArrayList<Details> getDetails(double rating) throws ServiceException {
		// TODO Auto-generated method stub
		ArrayList<Details> list;
		try {
			list = uDao.getDetailsDao(rating);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		}
		return list;
	}

	@Override
	public String validateUniversityID(int universityId) throws ServiceException {
		// TODO Auto-generated method stub
		String msg="";
		List<Integer> university;
		try {
			university=uDao.getUidsDao();
			
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		}
		if(university.contains(universityId))
		{
			try {
				throw new DuplicateUniversityException("duplicate id of university");
			} catch (DuplicateUniversityException e) {
				// TODO Auto-generated catch block
				throw new ServiceException(e);
			}
		}
		return msg;
		
	}

	@Override
	public ArrayList<Integer> getUniversity(int universityId1) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validateUniversity(int universityId1) throws ServiceException {
		// TODO Auto-generated method stub
		String msg="";
		List<Integer> university;
		try {
			university=uDao.getUidsDao();
			
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		}
		if(!(university.contains(universityId1)))
		{
			try {
				throw new NoSuchUniversityException("no such id of university");
			} catch (NoSuchUniversityException e) {
				// TODO Auto-generated catch block
				throw new ServiceException(e);
			}
		}
		return msg;
	}

	
	
	
	
	
}
