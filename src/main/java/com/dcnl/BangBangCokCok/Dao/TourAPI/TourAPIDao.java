package com.dcnl.BangBangCokCok.Dao.TourAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.dcnl.BangBangCokCok.TourAPI.JsonParser.AreaBasedListJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.AreaCodeJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.CategoryCodeJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.DetailCommonJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.DetailImageJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.DetailInfoJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.DetailIntroJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.JsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.LocationBasedListJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.SearchFestivalJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.SearchKeywordJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.SearchStayJsonParser;
import com.dcnl.BangBangCokCok.TourAPI.UrlBuilder.UrlBuilder;
import com.dcnl.BangBangCokCok.TourAPI.UrlRequest.UrlRequest;
import com.dcnl.BangBangCokCok.Utility.MyResponse;

public class TourAPIDao {

	private MyResponse myResponse = new MyResponse();
	private UrlBuilder urlBuilder = new UrlBuilder();
	private UrlRequest urlRequest = new UrlRequest();
	private JsonParser jsonParser;
	
	// 지역코드 조회
	public Map<String, Object> getAreaCode(String numOfRows, String pageNo, String areaCode) {
		
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new AreaCodeJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.areaCodeURLBuild(numOfRows, pageNo, areaCode));
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
	
	// 서비스 분류코드 조회
	public Map<String, Object> getCategoryCode(String numOfRows, String pageNo,
											   String contentTypeId, String cat1, String cat2) {
		// json 파서 객체 생성, DTO 담을 리스트 생성
		jsonParser = new CategoryCodeJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.categoryCodeURLBuild(numOfRows, pageNo,
																			   contentTypeId, cat1, cat2));
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
	
	// 지역 기반 리스트 조회
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
			jsonString = urlRequest.urlRequest(urlBuilder.areaBasedListURLBuild(numOfRows, pageNo, arrange,
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
	
	// 위치 기반 리스트 조회
	public Map<String, Object> getLocationBasedList(String numOfRows, String pageNo, String arrange,
													String contentTypeId, String mapX, String mapY, String radius) {
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new LocationBasedListJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.locationBasedListURLBuild(numOfRows, pageNo, arrange,
											   										contentTypeId, mapX, mapY, radius));
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
	
	// 키워드 검색 조회
	public Map<String, Object> getSearchKeyword(String numOfRows, String pageNo, String arrange,
												String contentTypeId, String keyword,
												String areaCode, String sigunguCode,
												String cat1, String cat2, String cat3) {
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new SearchKeywordJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.searchKeywordURLBuild(numOfRows, pageNo, arrange,
																				contentTypeId, keyword,
																				areaCode, sigunguCode,
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
	
	// [행사/공연/축제] 날짜 조회
	public Map<String, Object> getSearchFestival(String numOfRows, String pageNo, String arrange,
										 		 String eventStartDate, String eventEndDate,
												 String areaCode, String sigunguCode) {
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new SearchFestivalJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.searchFestivalURLBuild(numOfRows, pageNo, arrange,
																				 eventStartDate, eventEndDate,
																				 areaCode, sigunguCode));
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
	
	
	// [숙박] 베니키아,한옥,굿스테이 목록 조회
	public Map<String, Object> getSearchStay(String numOfRows, String pageNo, String arrange,
										 	 String hanOk, String benikia, String goodStay,
											 String areaCode, String sigunguCode) {
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new SearchStayJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.searchStayURLBuild(numOfRows, pageNo, arrange,
																			 hanOk, benikia, goodStay,
																			 areaCode, sigunguCode));
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
	
	// 상세정보1 - 공통정보 조회
	public Map<String, Object> getDetailCommon(String contentId, String contentTypeId,
											   String defaultYN, String firstImageYN,
											   String areacodeYN, String catcodeYN,
											   String addrinfoYN, String mapinfoYN, String overviewYN) {
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new DetailCommonJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.detailCommonURLBuild(contentId, contentTypeId,
																			   defaultYN, firstImageYN,
																			   areacodeYN, catcodeYN, addrinfoYN,
																			   mapinfoYN, overviewYN));
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
	
	// 상세정보2 - 소개정보 조회
	public Map<String, Object> getDetailIntro(String contentId, String contentTypeId, String introYN) {
		
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new DetailIntroJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.detailIntroURLBuild(contentId, contentTypeId, introYN));
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
	
	// 상세정보3 - 반복정보 조회
	public Map<String, Object> getDetailInfo(String contentId, String contentTypeId, String detailYN) {
		
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new DetailInfoJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.detailInfoURLBuild(contentId, contentTypeId, detailYN));
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
	
	// 상세정보4 - 이미지정보 조회
	public Map<String, Object> getDetailImage(String contentId, String contentTypeId, String imageYN) {
		
		// json 파서 객체 생성, DTO담을 리스트 생성
		jsonParser = new DetailImageJsonParser();
		ArrayList<Object> list = new ArrayList<Object>();
		String jsonString = null;
		Map<String, Object> response = new HashMap<String, Object>();
		
		// TourAPI에 json 요청
		try {
			jsonString = urlRequest.urlRequest(urlBuilder.detailImageURLBuild(contentId, contentTypeId, imageYN));
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
