package com.yebelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DBOperation {
	
	public static List<Map<String,Object>> getAllCategory() {
	List<Map<String,Object>> categoryList = new LinkedList<>();
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step2 create the connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "YEBELO",
				"12345@Yebelo");

		// step3 create the statement object
		Statement stmt = con.createStatement();

		// step4 execute query
		
		
		ResultSet rs = stmt.executeQuery("select * from category ");
		while (rs.next())
		{
			Map<String,Object> resultMap = new LinkedHashMap<>();
			resultMap.put("id", rs.getInt(1));
			resultMap.put("categoryCode",rs.getString(2));
			resultMap.put("oldValue",rs.getString(3));
			resultMap.put("newValue", rs.getString(4));
			categoryList.add(resultMap);
		}
		// step5 close the connection object
		con.close();
		return categoryList;
	} catch (Exception e) {
		System.out.println(e);
	}
	return categoryList;


	}
}
