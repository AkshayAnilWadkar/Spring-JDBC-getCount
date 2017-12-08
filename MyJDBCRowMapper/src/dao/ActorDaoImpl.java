package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import bean.Actor;

public class ActorDaoImpl implements ActorDao
{
   JdbcTemplate template;
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		int count=template.queryForObject("select count(*) from actor", Integer.class);
		return count;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public Actor getActor(int actor_id) {
		// TODO Auto-generated method stub
		
		Actor a=template.queryForObject("select * from actor where actor_id=?",new ActorMapper(),actor_id);
		return a;
	}

	class ActorMapper implements RowMapper<Actor>
	{
		
		@Override
		public Actor mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			Actor a=new Actor();
			a.setId(rs.getInt(1));
			a.setFn(rs.getString(2));
			a.setLn(rs.getString(3));
			a.setLast_update(rs.getDate(4));
			return a;
		}
		
	}
	
}
