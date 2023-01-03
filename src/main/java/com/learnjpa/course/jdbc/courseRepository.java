package com.learnjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learnjpa.course.Course;

@Repository
public class courseRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;

	/*
	 * private static String INSERT_QUERY = """ INSERT INTO COURSE(id, name, author)
	 * values (1, 'Learn AWS' , 'Stefen Bro');
	 * 
	 * """;
	 * 
	 * public void insert() { springJdbcTemplate.update(INSERT_QUERY); }
	 */

	private static String INSERT_QUERY = """
			INSERT INTO COURSE(id, name, author) values (?,?,?);

			""";

	private static String DELETE_QUERY = """
			DELETE FROM COURSE WHERE ID = (?);

			""";

	private static String SELECT_QUERY = """
			SELECT  * FROM COURSE where id = ?;

			""";

	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}

	public Course findById(long id) {
		// ResultSet -> Bean = Row Mapper
		// id
	return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);

	}
}
