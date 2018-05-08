package com.dcnl.BangBangCokCok.Dao.TourAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.dcnl.BangBangCokCok.TourAPI.JsonParser.AreaBasedListJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.AreaCodeJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.JsonParser;
import com.dcnl.BangBangCokCok.TourAPI.UrlBuilder.UrlBuilder;
import com.dcnl.BangBangCokCok.TourAPI.UrlRequest.UrlRequest;
import com.dcnl.BangBangCokCok.Utility.MyResponse;

public class TourAPIDao {

	private static final MyResponse myResponse = new MyResponse();
	private JsonParser jsonParser;
	
	
	public Map<String, Object> getAreaCode(String numOfRows, String pageNo, String areaCode) {
		
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new AreaCodeJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = UrlRequest.urlRequest(UrlBuilder.areaCodeURLBuild(numOfRows, pageNo, areaCode));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// JSON 파싱
		try {
			list = jsonParser.parse(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 응답 객체 생성
		response = myResponse.toResponse(list);
		
		return response;
	}
	
	public Map<String, Object> getAreaBasedList(String numOfRows, String pageNo, String arrange,
												String contentTypeId, String areaCode, String sigunguCode,
												String cat1, String cat2, String cat3) {
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new AreaBasedListJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = UrlRequest.urlRequest(UrlBuilder.areaBasedListURLBuild(numOfRows, pageNo, arrange,
																				contentTypeId, areaCode, sigunguCode,
																				cat1, cat2, cat3));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// JSON 파싱
		try {
			list = jsonParser.parse(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 응답 객체 생성
		response = myResponse.toResponse(list);
		
		return response;
	}
}
