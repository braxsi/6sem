package braxxi.kursach.server.dao;

import braxxi.kursach.commons.entity.BaseEntity;
import braxxi.kursach.commons.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;

import java.util.List;

import static org.springframework.dao.support.DataAccessUtils.singleResult;

public class BaseDao extends NamedParameterJdbcDaoSupport {


	@Autowired
	public void setAutowiredDataSource(DataSource dataSource) {
		setDataSource(dataSource);
	}

	protected <T extends BaseEntity> T queryForOptionalObject(String sql, RowMapper<T> rowMapper) {
		return singleResult(getNamedParameterJdbcTemplate().query(sql, rowMapper));
	}

	protected <T extends BaseEntity> T queryForOptionalObject(String sql, SqlParameterSource sqlParameterSource, RowMapper<T> rowMapper) {
		return singleResult(getNamedParameterJdbcTemplate().query(sql, sqlParameterSource, rowMapper));
	}

	protected <T extends BaseEntity> List<T> query(String sql, SqlParameterSource sqlParameterSource, RowMapper<T> rowMapper) {
		return getNamedParameterJdbcTemplate().query(sql, sqlParameterSource, rowMapper);
	}

}
