package com.yebelo.service;

import java.util.List;
import java.util.Map;

import com.yebelo.db.DBOperation;

public class AssesmentService {

	public static String getAllCategories() {
	List<Map<String,Object>> dataList = DBOperation.getAllCategory();
	if(!dataList.isEmpty()) {

	return "";
	}else {
		return "0";
	}
}
}
