package dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class ActorDaoImpl implements ActorDao {

	JdbcTemplate jdbcTemplate;
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		
		int count=jdbcTemplate.queryForObject("select count(*) from actor", Integer.class);
		
		return count;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
