package com.dcnl.BangBangCokCok;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dcnl.BangBangCokCok.Dao.TourAPI.TourAPIDao;

@RestController
@RequestMapping(value = "/TourAPI")
public class TourAPIController {
	
	private static TourAPIDao dao = new TourAPIDao();
	
	// 지역코드 조회
	@RequestMapping(value = "/areaCode")
	public Map<String, Object> areaCode(@RequestParam("numOfRows") String numOfRows,
										@RequestParam("pageNo")    String pageNo,
										@RequestParam("areaCode")  String areaCode) {
		
		Map<String, Object> response = dao.getAreaCode(numOfRows, pageNo, areaCode);
		
		return response;
	}
	
	// 서비스 분류코드 조회
	@RequestMapping(value = "/categoryCode")
	public Map<String, Object> categoryCode(@RequestParam("numOfRows") 		String numOfRows,
											@RequestParam("pageNo")    		String pageNo,
											@RequestParam("contentTypeId") 	String contentTypeId,
											@RequestParam("cat1") 			String cat1,
											@RequestParam("cat2") 			String cat2) {
		
		Map<String, Object> response = dao.getCategoryCode(numOfRows, pageNo, contentTypeId, cat1, cat2);
		
		return response;
	}
	
	// 지역 기반 관광정보 조회
	@RequestMapping(value = "/areaBasedList")
	public Map<String, Object> areaBasedList(@RequestParam("numOfRows") 	String numOfRows,
											 @RequestParam("pageNo") 		String pageNo,
											 @RequestParam("arrange") 		String arrange,
											 @RequestParam("contentTypeId") String contentTypeId,
											 @RequestParam("areaCode")		String areaCode,
											 @RequestParam("sigunguCode") 	String sigunguCode,
											 @RequestParam("cat1") 			String cat1,
											 @RequestParam("cat2") 			String cat2,
											 @RequestParam("cat3") 			String cat3) {
		
		Map<String, Object> response = dao.getAreaBasedList(numOfRows, pageNo, arrange,
															contentTypeId, areaCode, sigunguCode,
															cat1, cat2, cat3);
		
		return response;
	}
	
	// 위치 기반 관광정보 조회
	@RequestMapping(value = "/locationBasedList")
	public Map<String, Object> locationBasedList(@RequestParam("numOfRows") 	String numOfRows,
												 @RequestParam("pageNo") 		String pageNo,
												 @RequestParam("arrange") 		String arrange,
												 @RequestParam("contentTypeId") String contentTypeId,
												 @RequestParam("mapX") 			String mapX,
												 @RequestParam("mapY") 			String mapY,
												 @RequestParam("radius") 		String radius) {
		
		Map<String, Object> response = dao.getLocationBasedList(numOfRows, pageNo, arrange,
																contentTypeId, mapX, mapY, radius);
		
		return response;
	}
	
	// 키워드 검색 조회
	@RequestMapping(value = "/searchKeyword")
	public Map<String, Object> searchKeyword(@RequestParam("numOfRows") 	String numOfRows,
											 @RequestParam("pageNo") 		String pageNo,
											 @RequestParam("arrange") 		String arrange,
											 @RequestParam("contentTypeId") String contentTypeId,
											 @RequestParam("keyword") 		String keyword,
											 @RequestParam("areaCode") 		String areaCode,
											 @RequestParam("sigunguCode") 	String sigunguCode,
											 @RequestParam("cat1") 			String cat1,
											 @RequestParam("cat2") 			String cat2,
											 @RequestParam("cat3") 			String cat3) {
		
		Map<String, Object> response = dao.getSearchKeyword(numOfRows, pageNo, arrange,
															contentTypeId, keyword,
															areaCode, sigunguCode,
															cat1, cat2, cat3);
		
		return response;
	}
	
	// [행사/공연/축제] 날짜 조회
	@RequestMapping(value = "/searchFestival")
	public Map<String, Object> searchFestival(@RequestParam("numOfRows") 	String numOfRows,
											  @RequestParam("pageNo") 		String pageNo,
											  @RequestParam("arrange") 		String arrange,
											  @RequestParam("eventStartDate") String eventStartDate,
											  @RequestParam("eventEndDate") 		String eventEndDate,
											  @RequestParam("areaCode") 		String areaCode,
											  @RequestParam("sigunguCode") 	String sigunguCode) {
		
		Map<String, Object> response = dao.getSearchFestival(numOfRows, pageNo, arrange,
															 eventStartDate, eventEndDate,
															 areaCode, sigunguCode);
		
		return response;
	}
	
	// [숙박] 베니키아,한옥,굿스테이 목록 조회
	@RequestMapping(value = "/searchStay")
	public Map<String, Object> searchStay(@RequestParam("numOfRows")   String numOfRows,
										  @RequestParam("pageNo") 	   String pageNo,
										  @RequestParam("arrange") 	   String arrange,
										  @RequestParam("hanOk") 	   String hanOk,
										  @RequestParam("benikia") 	   String benikia,
										  @RequestParam("goodStay")    String goodStay,
										  @RequestParam("areaCode")    String areaCode,
										  @RequestParam("sigunguCode") String sigunguCode) {
		
		Map<String, Object> response = dao.getSearchStay(numOfRows, pageNo, arrange,
														 hanOk, benikia, goodStay,
														 areaCode, sigunguCode);
		
		return response;
	}
	
	// 상세정보1 - 공통정보 조회
	@RequestMapping(value = "/detailCommon")
	public Map<String, Object> detailCommon(@RequestParam("contentId")     String contentId,
											@RequestParam("contentTypeId") String contentTypeId,
											@RequestParam("defaultYN") 	   String defaultYN,
											@RequestParam("firstImageYN")  String firstImageYN,
											@RequestParam("areacodeYN")    String areacodeYN,
											@RequestParam("catcodeYN")     String catcodeYN,
											@RequestParam("addrinfoYN")    String addrinfoYN,
											@RequestParam("mapinfoYN") 	   String mapinfoYN,
											@RequestParam("overviewYN")    String overviewYN) {
		
		Map<String, Object> response = dao.getDetailCommon(contentId, contentTypeId,
														   defaultYN, firstImageYN,
														   areacodeYN, catcodeYN,
														   addrinfoYN, mapinfoYN, overviewYN);
		
		return response;
	}
	
	// 상세정보2 - 소개정보 조회
	@RequestMapping(value = "/detailIntro")
	public Map<String, Object> detailIntro(@RequestParam("contentId")     String contentId,
											@RequestParam("contentTypeId") String contentTypeId,
											@RequestParam("introYN") 	   String introYN) {
		
		Map<String, Object> response = dao.getDetailIntro(contentId, contentTypeId, introYN);
		
		return response;
	}
	
	// 상세정보3 - 반복정보 조회
	@RequestMapping(value = "/detailInfo")
	public Map<String, Object> detailInfo(@RequestParam("contentId")     String contentId,
											@RequestParam("contentTypeId") String contentTypeId,
											@RequestParam("detailYN") 	   String detailYN) {
		
		Map<String, Object> response = dao.getDetailInfo(contentId, contentTypeId, detailYN);
		
		return response;
	}
	
	// 상세정보4 - 이미지정보 조회
	@RequestMapping(value = "/detailImage")
	public Map<String, Object> detailImage(@RequestParam("contentId")     String contentId,
											@RequestParam("contentTypeId") String contentTypeId,
											@RequestParam("imageYN") 	   String imageYN) {
		
		Map<String, Object> response = dao.getDetailImage(contentId, contentTypeId, imageYN);
		
		return response;
	}
}