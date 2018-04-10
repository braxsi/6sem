package braxxi.kursach.server.dao;


import braxxi.kursach.commons.entity.UserEntity;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserDao extends BaseDao {

	public UserEntity getUser(String login, String password) {
		final SqlParameterSource parameterSource = new MapSqlParameterSource()
				.addValue("login", login)
				.addValue("password", password);
		return queryForOptionalObject("SELECT * FROM users_info WHERE login=:login AND password=:password",
				parameterSource, USER_ROW_MAPPER);
	}

	public Long addUser(UserEntity user_info) {
		final MapSqlParameterSource sqlParameterSource = getMapSqlParameterSource(user_info);
		final GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
		getNamedParameterJdbcTemplate().update(
				"INSERT INTO users_info " +
						"(login, password, email)" +
						" VALUES " +
						"(:login, :password, :email)",
				sqlParameterSource, generatedKeyHolder);
		return generatedKeyHolder.getKey().longValue();
	}

	public void updateUser(UserEntity user_info) {
		final MapSqlParameterSource sqlParameterSource = getMapSqlParameterSource(user_info);
		getNamedParameterJdbcTemplate().update(
				"UPDATE users_info SET " +
						"login=:login, password=:password, email=:email" +
						//", user_id=:user_id" +
						" WHERE user_id=:user_id",
				sqlParameterSource);
	}

	public void addResourses(UserEntity user_info) {
		final MapSqlParameterSource sqlParameterSource = getMapSqlParameterSource(user_info);
		final GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
		getNamedParameterJdbcTemplate().update(
				"INSERT INTO resourses " +
						"(user_id, bandage, cartridges, radiation, gold)" +
						" VALUES " +
						"(:user_id, :bandage, :cartridges, :radiation, :gold)",
				sqlParameterSource, generatedKeyHolder);
		// return generatedKeyHolder.getKey().longValue();
	}

	public void updateResourses(UserEntity resourses) {
		final MapSqlParameterSource sqlParameterSource = getMapSqlParameterSource(resourses);
		getNamedParameterJdbcTemplate().update(
				"UPDATE resourses SET " +
						"bandage=:bandage, cartridges=:cartridges, radiation=:radiation, gold=:gold" +
						//", user_id=:user_id" +
						" WHERE user_id=:user_id",
				sqlParameterSource);
	}

	public UserEntity getResourses(Long user_id) {
		final SqlParameterSource parameterSource = new MapSqlParameterSource()
				.addValue("user_id", user_id);
		return queryForOptionalObject("SELECT * FROM resourses WHERE user_id=:user_id",
				parameterSource, RESOURSES_ROW_MAPPER);
	}
	public void updateGroup(UserEntity user_info) {
		final MapSqlParameterSource sqlParameterSource = getMapSqlParameterSource(user_info);
		getNamedParameterJdbcTemplate().update(
				"UPDATE users_info SET " +
						"group_id=:group_id" +
						//", user_id=:user_id" +
						" WHERE user_id=:user_id",
				sqlParameterSource);
	}
	public UserEntity login(String login) {
		final SqlParameterSource parameterSource = new MapSqlParameterSource()
				.addValue("login", login);
		return queryForOptionalObject("SELECT * FROM users_info WHERE login=:login",
				parameterSource, USER_ROW_MAPPER);
	}

	private MapSqlParameterSource getMapSqlParameterSource(UserEntity user) {
		return new MapSqlParameterSource()
				.addValue("user_id", user.getId())
				.addValue("login", user.getLogin())
				.addValue("password", user.getPassword())
				.addValue("email", user.getEmail())
				.addValue("group_id", user.getGroup_id())
				.addValue("bandage", user.getBandage())
				.addValue("cartridges", user.getCartridges())
				.addValue("radiation", user.getRadiation())
				.addValue("gold", user.getGold()) ;
	}

	public static final RowMapper<UserEntity> USER_ROW_MAPPER = new RowMapper<UserEntity>() {
		@Override
		public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserEntity userEntity = new UserEntity();
			userEntity.setId(rs.getLong("user_id"));
			userEntity.setLogin(rs.getString("login"));
			userEntity.setPassword(rs.getString("password"));
			userEntity.setEmail(rs.getString("email"));
			userEntity.setGroup_id(rs.getInt("group_id"));
			return userEntity;
		}
	};
	public static final RowMapper<UserEntity> RESOURSES_ROW_MAPPER = new RowMapper<UserEntity>() {
		@Override
		public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserEntity userEntity = new UserEntity();
			userEntity.setId(rs.getLong("user_id"));
			userEntity.setBandage(rs.getInt("bandage"));
			userEntity.setCartridges(rs.getInt("cartridges"));
			userEntity.setRadiation(rs.getInt("radiation"));
			userEntity.setGold(rs.getInt("gold"));
			return userEntity;
		}
	};
}
