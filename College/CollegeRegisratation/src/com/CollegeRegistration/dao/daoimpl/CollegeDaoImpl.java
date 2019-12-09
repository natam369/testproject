package com.CollegeRegistration.dao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.CollegeRegistration.dao.CollegeDao;
import com.CollegeRegistration.exceptions.DaoException;
import com.CollegeRegistration.utility.DbConnection;

public class CollegeDaoImpl implements CollegeDao {

	@Override
	public String inCollegeDao(int universityId1, int collegeId, String collegeName, double rating)
			throws DaoException {
		// TODO Auto-generated method stub

		String msg = "";
		Connection con = DbConnection.getConnection();
		try {
			if (con != null) {
				String sql = "insert into college" + "(cid,cname,rating,uid)" + "values(?,?,?,?)";
				PreparedStatement p = con.prepareStatement(sql);
				p.setInt(1, collegeId);
				p.setString(2, collegeName);
				p.setDouble(3, rating);
				p.setInt(4, universityId1);
				p.executeUpdate();
				DbConnection.closeConnection(con);
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return msg;
	}

}
