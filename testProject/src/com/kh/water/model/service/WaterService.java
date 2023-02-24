package com.kh.water.model.service;

import java.sql.Connection;

import static com.kh.common.model.JDBCTemplate.*;

import com.kh.water.model.dao.WaterDao;
import com.kh.water.model.vo.Water;

public class WaterService {

	public int insertWater(Water w) {
		
		Connection conn = getConnection();
		
		int result = new WaterDao().insertWater(conn, w);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	
	
	
}
