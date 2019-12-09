package com.CollegeRegistration.dao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.CollegeRegistration.dao.UniversityDao;
import com.CollegeRegistration.entity.Details;
import com.CollegeRegistration.exceptions.DaoException;
import com.CollegeRegistration.exceptions.UtilityException;
import com.CollegeRegistration.utility.DbConnection;

public class UniversityDaoImpl implements UniversityDao {

	@Override
	public String inUniversityDao(int universityId, String universityName) throws DaoException {
		// TODO Auto-generated method stub
		String msg = "";
		Connection con = DbConnection.getConnection();
		try {
			if (con != null) {
				String sql = "insert into university" + "(uid,uname)" + "values(?,?)";
				PreparedStatement p = con.prepareStatement(sql);
				p.setInt(1, universityId);
				p.setString(2, universityName);
				p.executeUpdate();
				DbConnection.closeConnection(con);

			}
		}

		catch (SQLException e) {
			throw new DaoException(e);
		}
		return msg;
	}

	@Override
	public ArrayList<Integer> getUidsDao() throws DaoException {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		;
		Connection con = DbConnection.getConnection();
		try {
			if (con != null) {
				String sql = "select uid from university";
				PreparedStatement p = con.prepareStatement(sql);
				ResultSet rs = p.executeQuery();
				while (rs.next()) {
					int id = rs.getInt(1);
					al.add(id);
				}
				DbConnection.closeConnection(con);

			}
			
		} 
		catch (UtilityException e) {
			throw new DaoException(e);
		}
		catch (SQLException e) {
			throw new DaoException(e);
		}
		return al;
	}

	@Override
	public ArrayList<Details> getDetailsDao(int uid) throws DaoException {
		// TODO Auto-generated method stub
		Connection con = null;
		ArrayList<Details> list = new ArrayList<>();
		try {
			con = DbConnection.getConnection();
			if (con != null) {
				String sql = "select college.cid,college.cname,college.rating,university.uid,university.uname from college inner join university on college.uid=university.uid where university.uid=?";
				PreparedStatement p = con.prepareStatement(sql);
				p.setInt(1, uid);
				ResultSet rs = p.executeQuery();
				while (rs.next()) {
					Details d = new Details();
					d.setCollegeID(rs.getInt(1));
					d.setCollegeName(rs.getString(2));
					d.setRating(rs.getDouble(3));
					d.setUniversityID(rs.getInt(4));
					d.setUniversityName(rs.getString(5));
					list.add(d);
				}
				DbConnection.closeConnection(con);
			}
		} catch (UtilityException e) {
			throw new DaoException(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException(e);
		}
		return list;
	}

	@Override
	public ArrayList<Details> getDetailsDao(double rating) throws DaoException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement p=null;
		ArrayList<Details> list = new ArrayList<>();
		try {
			con = DbConnection.getConnection();
			if (con != null) {
				String sql = "select college.cid,college.cname,college.rating,university.uid,university.uname from college inner join university on college.uid=university.uid where college.rating>?";
				p = con.prepareStatement(sql);
				p.setDouble(1, rating);
				ResultSet rs = p.executeQuery();
				while (rs.next()) {
					Details d = new Details();
					d.setCollegeID(rs.getInt(1));
					d.setCollegeName(rs.getString(2));
					d.setRating(rs.getDouble(3));
					d.setUniversityID(rs.getInt(4));
					d.setUniversityName(rs.getString(5));
					list.add(d);
				}
				DbConnection.closeConnection(con);
			}
		} catch (UtilityException e) {
			throw new DaoException(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException(e);
		}
		finally {
			try {
			
				p.close();
				
			}
			catch(SQLException e) {
				throw new DaoException(e);
			}
		}
		return list;
	}

}
