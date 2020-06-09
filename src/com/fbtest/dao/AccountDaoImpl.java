package com.fbtest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fbtest.models.Account;

@Repository
public class AccountDaoImpl {

	@Autowired
	public AccountDaoImpl(@Qualifier("dataSource")DataSource mySqlDataSource) {
		this.jdbc = new JdbcTemplate(mySqlDataSource);
	}
	
	private JdbcTemplate jdbc;
	
	private static final String SIMPLE_QUERY = "SELECT * FROM accounts WHERE uid = ? ";
	
	public Account findAccountByUid(Account account){
		System.out.println("getUid:"+account.getUid());
		return this.jdbc.queryForObject(SIMPLE_QUERY, new Object[]{account.getUid()}, new AccountRowMapper());
	}
	
	private static class AccountRowMapper implements RowMapper<Account>{
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account account = new Account();
			account.setUid(rs.getString("uid"));
			account.setPwd(rs.getString("pwd"));
			account.setUsername(rs.getString("user_name"));
			account.setEmail(rs.getString("email"));
			account.setManager(rs.getString("manager"));
			account.setDeportment(rs.getString("deportment"));
			account.setTitle(rs.getString("title"));
			account.setExtno(rs.getString("extno"));
			return account;
		}
	}
}
