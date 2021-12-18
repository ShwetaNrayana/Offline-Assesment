package com.yebelo.service;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.yebelo.db.DBOperation;

public class AssesmentService {

	public static String getAllCategories() {	
	List<Map<String,Object>> dataList = DBOperation.getAllCategory();
	if(!dataList.isEmpty()) {
	Gson gson = new Gson();
	String response = gson.toJson(dataList);
	return response;
	}else {
		return "0";
	}
	
	}
	
public static String getCategorieByCategoryId(String reqGson) {
		
		Gson gson = new Gson();
		Map<String,Object> map = gson.fromJson(reqGson, Map.class);
		String reqCategory = map.get("categoryCode").toString();
		
		List<Map<String,Object>> dataMap = DBOperation.getCategorieByCategoryId(reqCategory);
		if(!dataMap.isEmpty()) {
			String response = gson.toJson(dataMap);
			return response;
			}else {
				return "0";
			}
	}
}
