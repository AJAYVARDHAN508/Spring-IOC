package com.slokam;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseBeanRowMapper implements RowMapper<Course>{

	@Override
	public Course mapRow(ResultSet arg0, int arg1) throws SQLException {
		Course course = new Course();
		course.setId(arg0.getInt("id"));
		course.setName(arg0.getString("name"));
		course.setDuration(arg0.getInt("duration"));
		course.setFee(arg0.getInt("fee"));
		return course;
	}
}
