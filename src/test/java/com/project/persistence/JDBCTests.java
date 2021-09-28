package com.project.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import com.mysql.cj.log.Log;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imfind", "root", "1234")) {
			System.out.println(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}

	}

}
