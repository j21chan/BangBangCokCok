package com.dcnl.BangBangCokCok.TourAPI.JsonParser;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.dcnl.BangBangCokCok.Dto.TourAPI.AreaCode;

public class AreaCodeJsonParser implements JsonParser {

	@Override
	public ArrayList<Object> parse(String jsonString) {

		// 객체 생성을 위한 선언
		String code = null;
		String name = null;
		String rnum = null;
		ArrayList<Object> dtos = new ArrayList<Object>();
		
		// JSON 객체 출력
		System.out.println("******** Tour API에서 받아온 JSON ********");
		System.out.println(jsonString + "\n");
           
		// JSON Parser 객체 만들기
		JSONParser parser = new JSONParser();
       
		// TourAPI에서 받은 Json 파일을 obj로 받기
		Object obj = null;
		try {
			obj = parser.parse(jsonString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
               
		// Object에서 JSON으로 Type Casting
		JSONObject jsonObj = (JSONObject) obj;
               
		// Json response value
		JSONObject jsonResponse = (JSONObject) jsonObj.get("response");
               
		// json body value
		JSONObject jsonBody = (JSONObject) jsonResponse.get("body");
       
		// num Of rows
		int numOfRows = Integer.parseInt(jsonBody.get("numOfRows").toString());
       
		// pageNo
		int pageNo = Integer.parseInt(jsonBody.get("pageNo").toString());
		
		System.out.println("******** Response 기본 정보 ********");
		System.out.println("관광지 개수 : " + numOfRows + " 개");
		System.out.println("페이지 : " + pageNo + "\n");
		
		
		// json items value null 값 확인
		if (jsonBody.get("items").toString().equals("")) {
			
			// items가 없을 때
			dtos = null;
		} else {
			
			// items가 있을 때
			JSONObject jsonItems = (JSONObject) jsonBody.get("items");
			
			// jsonArray item value
			JSONArray jsonItemArray = (JSONArray) jsonItems.get("item");
			
			// items json array에 담긴 각 json 오브젝트를 빼오는 작업
			System.out.println("******** JSON Parser를 이용해서 파싱 ********");
			for (int i = 0; i < jsonItemArray.size(); i++) {
				
				// 임시 json 객체
				JSONObject temp = (JSONObject) jsonItemArray.get(i);
				
				// 1. 각 JSON 객체의 Key 값이 있는지 검사
				// 2. 값이 있으면 파싱해서 데이터를 넣음
				// 3. 데이터 값 출력
				System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
				
				// 변수 초기화
				code = null;
				name = null;
				rnum = null;
				
				if(temp.containsKey("code")) {
					code = temp.get("code").toString();
					System.out.println("code : " + code);
				}
				
				if(temp.containsKey("name")) {
					name = temp.get("name").toString();
					System.out.println("name : " + name);
				}
				
				if(temp.containsKey("rnum")) {
					rnum = temp.get("rnum").toString();
					System.out.println("rnum : " + rnum);
				}
				
				System.out.println("");
				
				// AreaCode List에 넣기
				AreaCode areaCode = new AreaCode(code, name, rnum);
				dtos.add(areaCode);
			}
		}
		return dtos;
	}
}