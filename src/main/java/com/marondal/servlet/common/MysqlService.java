package com.marondal.servlet.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlService  {

	// 클래스를 설계하는 입장에서
	// 해당 클래스에 대한 객체 생성을 직접 관리하고,
	// 하나의 객채를 고유해서 사용하도록 구성한다.
	// Singleton pattern (Design pattern)
	private static MysqlService mysqlService = null;
	
	private Connection connection;
	
	// 자신 스스로의 클래스에 대한 객체를 돌려주는 메소드
	// static : 객체 생성 없이 사용하도록 하는 메소드, 멤버 변수사용 불가(static 붙여줘야함)
	// 객체가 생성되면 멤버변수 만들 공간이 생기니까, 객체 생성없이도 사용하려면 멤버변수에 static
	public static MysqlService getInstance() {
		if(mysqlService == null) {
			mysqlService = new MysqlService();	
		}
		return mysqlService;
	}
	
	
	// 접속 기능
	public void connect(){
		// 데이터베이스 접속
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/vamos";
			String id = "root";
			String password = "root";
			
			connection = DriverManager.getConnection(url,id,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	// 접속 해제 기능
	public void disconnect() {
		try {
			connection.close();
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
	}
	
	// 조회 쿼리 수행 기능
	public List<Map<String, Object>> select(String query) {
		
		 
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			// 조회된 결과의 컬럼 목록 , (사용법)
			// 이거 안쓰면 특정 테이블에서밖에못쓰니, 해당 테이블에서 값을 바로 추출할수있게
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnCount = rsmd.getColumnCount();
			
			// 컬럼 이름 리스트
			List<String> columnList = new ArrayList<>();
			for(int i = 1; i <= columnCount; i++) {
				columnList.add(rsmd.getColumnName(i));
			}
			
			List<Map<String, Object>> resultList = new ArrayList<>();
			
			while(resultSet.next()) {
				
				Map<String,Object> resultMap = new HashMap<>();
				// 컬럼 이름을 통해 resultSet이 가르키는 행으로 부터 Object 형태의 값을 얻어오고
				// 해당 컬럼 이름을 키로 얻어온 값을 맵에 저장한다.
				for(String column:columnList) {
					Object value = resultSet.getObject(column);
					resultMap.put(column, value);
				}
				resultList.add(resultMap);
				
//				int id = resultSet.getInt("id");
//				String address = resultSet.getString("address");
//			
//				// 20  1 휴먼시아 드림빌 208동 604호 111 전세 60000
//				// {"id":20, "realtorId":1, "address":휴먼시아 드림빌 208동 604호", "area":111, "type":"전세","price":60000}
//				Map<String,Object> resultMap = new HashMap<>();
//				resultMap.put("id",id);
//				resultMap.put("address", address);
//				resultList.add(resultMap);
//				
			}
			statement.close();
			return resultList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	// 삽입, 수정, 삭제 쿼리 수행 기능
	public int update(String query) {
		Statement statement;
		try {
			statement = connection.createStatement();
			int count = statement.executeUpdate(query);
			statement.close();
			return count;
			
		} catch (SQLException e) { 
			e.printStackTrace();
			return -1;
		}
		
	
	}
	
}
