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
											 @RequestParam("contenttypeid") String contenttypeid,
											 @RequestParam("areaCode")		String areaCode,
											 @RequestParam("sigunguCode") 	String sigunguCode,
											 @RequestParam("cat1") 			String cat1,
											 @RequestParam("cat2") 			String cat2,
											 @RequestParam("cat3") 			String cat3) {
		
		Map<String, Object> response = dao.getAreaBasedList(numOfRows, pageNo, arrange,
															contenttypeid, areaCode, sigunguCode,
															cat1, cat2, cat3);
		
		return response;
	}
	
	
}