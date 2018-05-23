package com.dcnl.BangBangCokCok.TourAPI.JsonParser;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.dcnl.BangBangCokCok.Dto.TourAPI.DetailInfo_Common;
import com.dcnl.BangBangCokCok.Dto.TourAPI.DetailInfo_Stay;
import com.dcnl.BangBangCokCok.Dto.TourAPI.DetailInfo_TourCourse;

public class DetailInfoJsonParser implements JsonParser {

	@Override
	public ArrayList<Object> parse(String jsonString) {
		
		// 객체 생성을 위한 선언 및 초기화
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
	        // json items value
	        JSONObject temps = (JSONObject) jsonBody.get("items");
	        
	        // jsonArray item value
	        JSONArray tempArray = (JSONArray) temps.get("item");
	        
	        // items json array에 담긴 각 json 오브젝트를 빼오는 작업
	        System.out.println("******** JSON Parser를 이용해서 파싱 ********" + "\n");
	        for (int i = 0; i < tempArray.size(); i++) {
	        	
	        	// 임시 json 객체
	        	JSONObject temp = (JSONObject) tempArray.get(i);
	        	
	        	// 1. 각 JSON 객체의 Key 값이 있는지 검사
	        	// 2. 값이 있으면 파싱해서 데이터를 넣음
	        	// 3. 데이터 값 출력
	        	System.out.println("------------ " + (i + 1) + "번째 인덱스 값 ------------");
	        	
	        	// 기본 응답
	        	String contentid = null;
	        	if(temp.containsKey("contentid")) {
	        		contentid = temp.get("contentid").toString();
	            	System.out.println("contentid : " + contentid);
	        	}
	        	
	        	String contenttypeid = null;
	        	if(temp.containsKey("contenttypeid")) {
	        		contenttypeid = temp.get("contenttypeid").toString();
	            	System.out.println("contenttypeid : " + contenttypeid);
	        	}
	        	
	        	// 숙박, 여행코스를 제외한 타입
	        	if(contenttypeid.equals("12") || contenttypeid.equals("14") || contenttypeid.equals("15") ||
	        	   contenttypeid.equals("28") || contenttypeid.equals("38") || contenttypeid.equals("39")) {
	        		
	        		// 숙박, 여행코스를 제외한 타입 객체 생성
	        		DetailInfo_Common detailInfo_Common = new DetailInfo_Common();
	        		
	        		// contentid, contentTypeId 세팅
	        		detailInfo_Common.setContentid(contentid);
	        		detailInfo_Common.setContenttypeid(contenttypeid);
	        		
	        		if(temp.containsKey("fldgubun")) {
	        			String fldgubun = temp.get("fldgubun").toString();
	        			detailInfo_Common.setFldgubun(fldgubun);
	                	System.out.println("fldgubun : " + fldgubun);
	            	}
	        		
	        		if(temp.containsKey("infoname")) {
	        			String infoname = temp.get("infoname").toString();
	        			detailInfo_Common.setInfoname(infoname);
	                	System.out.println("infoname : " + infoname);
	            	}
	        		
	        		if(temp.containsKey("infotext")) {
	        			String infotext = temp.get("infotext").toString();
	        			detailInfo_Common.setInfotext(infotext);
	                	System.out.println("infotext : " + infotext);
	            	}
	        		
	        		if(temp.containsKey("serialnum")) {
	        			String serialnum = temp.get("serialnum").toString();
	        			detailInfo_Common.setSerialnum(serialnum);
	                	System.out.println("serialnum : " + serialnum);
	            	}
		        	dtos.add(detailInfo_Common);

	        	}
	        	
	        	// 여행 코스 타입
	        	if(contenttypeid.equals("25")) {
	        		
	        		// 여행 코스 타입 객체 생성
	        		DetailInfo_TourCourse detailInfo_TourCourse = new DetailInfo_TourCourse();
	        		
	        		// contentid, contentTypeID 세팅
	        		detailInfo_TourCourse.setContentid(contentid);
	        		detailInfo_TourCourse.setContenttypeid(contenttypeid);
	        		
	        		if(temp.containsKey("subcontentid")) {
	        			String subcontentid = temp.get("subcontentid").toString();
	        			detailInfo_TourCourse.setSubcontentid(subcontentid);
	                	System.out.println("subcontentid : " + subcontentid);
	            	}
	        		if(temp.containsKey("subdetailalt")) {
	        			String subdetailalt = temp.get("subdetailalt").toString();
	        			detailInfo_TourCourse.setSubdetailalt(subdetailalt);
	                	System.out.println("subdetailalt : " + subdetailalt);
	            	}
	        		
	        		if(temp.containsKey("subdetailimg")) {
	        			String subdetailimg = temp.get("subdetailimg").toString();
	        			detailInfo_TourCourse.setSubdetailimg(subdetailimg);
	                	System.out.println("subdetailimg : " + subdetailimg);
	            	}
	        		
	        		if(temp.containsKey("subdetailoverview")) {
	        			String subdetailoverview = temp.get("subdetailoverview").toString();
	        			detailInfo_TourCourse.setSubdetailoverview(subdetailoverview);
	                	System.out.println("subdetailoverview : " + subdetailoverview);
	            	}
	        		
	        		if(temp.containsKey("subname")) {
	        			String subname = temp.get("subname").toString();
	        			detailInfo_TourCourse.setSubname(subname);
	                	System.out.println("subname : " + subname);
	            	}
	        		
	        		if(temp.containsKey("subnum")) {
	        			String subnum = temp.get("subnum").toString();
	        			detailInfo_TourCourse.setSubnum(subnum);
	                	System.out.println("subnum : " + subnum);
	            	}
	        		
		        	dtos.add(detailInfo_TourCourse);

	        	}	
	        	
	        	// 숙박 타입
	        	if(contenttypeid.equals("32")) {
	        		
	        		// 숙박 타입 객체 생성
	        		DetailInfo_Stay detailInfo_Stay = new DetailInfo_Stay();
	        		
	        		// contentid, contentTypeID 세팅
	        		detailInfo_Stay.setContentid(contentid);
	        		detailInfo_Stay.setContenttypeid(contenttypeid);
	        		
	        		if(temp.containsKey("roomcode")) {
	        			String roomcode = temp.get("roomcode").toString();
	        			detailInfo_Stay.setRoomcode(roomcode);
	                	System.out.println("roomcode : " + roomcode);
	            	}
	        		
	        		if(temp.containsKey("roomtitle")) {
	        			String roomtitle = temp.get("roomtitle").toString();
	        			detailInfo_Stay.setRoomtitle(roomtitle);
	                	System.out.println("roomtitle : " + roomtitle);
	            	}
	        		
	        		if(temp.containsKey("roomsize1")) {
	        			double roomsize1 = Double.parseDouble(temp.get("roomsize1").toString());
	        			detailInfo_Stay.setRoomsize1(roomsize1);
	                	System.out.println("roomsize1 : " + roomsize1);
	            	}
	        		
	        		if(temp.containsKey("roomcount")) {
	        			int roomcount = Integer.parseInt(temp.get("roomcount").toString());
	        			detailInfo_Stay.setRoomcount(roomcount);
	                	System.out.println("roomcount : " + roomcount);
	            	}
	        		
	        		if(temp.containsKey("roombasecount")) {
	        			int roombasecount = Integer.parseInt(temp.get("roombasecount").toString());
	        			detailInfo_Stay.setRoombasecount(roombasecount);
	                	System.out.println("roombasecount : " + roombasecount);
	            	}
	        		
	        		if(temp.containsKey("roommaxcount")) {
	        			int roommaxcount = Integer.parseInt(temp.get("roommaxcount").toString());
	        			detailInfo_Stay.setRoommaxcount(roommaxcount);
	                	System.out.println("roommaxcount : " + roommaxcount);
	            	}
	        		
	        		if(temp.containsKey("roomoffseasonminfee1")) {
	        			int roomoffseasonminfee1 = Integer.parseInt(temp.get("roomoffseasonminfee1").toString());
	                	detailInfo_Stay.setRoomoffseasonminfee1(roomoffseasonminfee1);
	        			System.out.println("roomoffseasonminfee1 : " + roomoffseasonminfee1);
	            	}
	        		
	        		if(temp.containsKey("roomoffseasonminfee2")) {
	        			int roomoffseasonminfee2 = Integer.parseInt(temp.get("roomoffseasonminfee2").toString());
	                	detailInfo_Stay.setRoomoffseasonminfee2(roomoffseasonminfee2);
	        			System.out.println("roomoffseasonminfee2 : " + roomoffseasonminfee2);
	            	}
	        		
	        		if(temp.containsKey("roompeakseasonminfee1")) {
	        			int roompeakseasonminfee1 = Integer.parseInt(temp.get("roompeakseasonminfee1").toString());
	                	detailInfo_Stay.setRoompeakseasonminfee1(roompeakseasonminfee1);
	        			System.out.println("roompeakseasonminfee1 : " + roompeakseasonminfee1);
	            	}
	        		
	        		if(temp.containsKey("roompeakseasonminfee2")) {
	        			int roompeakseasonminfee2 = Integer.parseInt(temp.get("roompeakseasonminfee2").toString());
	                	detailInfo_Stay.setRoompeakseasonminfee2(roompeakseasonminfee2);
	        			System.out.println("roompeakseasonminfee2 : " + roompeakseasonminfee2);
	            	}
	        		
	        		if(temp.containsKey("roomintro")) {
	        			String roomintro = temp.get("roomintro").toString();
	        			detailInfo_Stay.setRoomintro(roomintro);
	                	System.out.println("roomintro : " + roomintro);
	            	}
	        		
	        		if(temp.containsKey("roombathfacility")) {
	        			String roombathfacility = temp.get("roombathfacility").toString();
	        			detailInfo_Stay.setRoombathfacility(roombathfacility);
	                	System.out.println("roombathfacility : " + roombathfacility);
	            	}
	        		
	        		if(temp.containsKey("roombath")) {
	        			String roombath = temp.get("roombath").toString();
	                	detailInfo_Stay.setRoombath(roombath);
	        			System.out.println("roombath : " + roombath);
	            	}
	        		
	        		if(temp.containsKey("roomhometheater")) {
	        			String roomhometheater = temp.get("roomhometheater").toString();
	        			detailInfo_Stay.setRoomhometheater(roomhometheater);
	                	System.out.println("roomhometheater : " + roomhometheater);
	            	}
	        		
	        		if(temp.containsKey("roomaircondition")) {
	        			String roomaircondition = temp.get("roomaircondition").toString();
	        			detailInfo_Stay.setRoomaircondition(roomaircondition);
	                	System.out.println("roomaircondition : " + roomaircondition);
	            	}
	        		
	        		if(temp.containsKey("roomtv")) {
	        			String roomtv = temp.get("roomtv").toString();
	        			detailInfo_Stay.setRoomtv(roomtv);
	                	System.out.println("roomtv : " + roomtv);
	            	}
	        		
	        		if(temp.containsKey("roompc")) {
	        			String roompc = temp.get("roompc").toString();
	        			detailInfo_Stay.setRoompc(roompc);
	                	System.out.println("roompc : " + roompc);
	            	}
	        		
	        		if(temp.containsKey("roomcable")) {
	        			String roomcable = temp.get("roomcable").toString();
	        			detailInfo_Stay.setRoomcable(roomcable);
	                	System.out.println("roomcable : " + roomcable);
	            	}
	        		
	        		if(temp.containsKey("roominternet")) {
	        			String roominternet = temp.get("roominternet").toString();
	        			detailInfo_Stay.setRoominternet(roominternet);
	                	System.out.println("roominternet : " + roominternet);
	            	}
	        		
	        		if(temp.containsKey("roomrefrigerator")) {
	        			String roomrefrigerator = temp.get("roomrefrigerator").toString();
	        			detailInfo_Stay.setRoomrefrigerator(roomrefrigerator);
	                	System.out.println("roomrefrigerator : " + roomrefrigerator);
	            	}
	        		
	        		if(temp.containsKey("roomtoiletries")) {
	        			String roomtoiletries = temp.get("roomtoiletries").toString();
	                	detailInfo_Stay.setRoomtoiletries(roomtoiletries);
	        			System.out.println("roomtoiletries : " + roomtoiletries);
	            	}
	        		
	        		if(temp.containsKey("roomsofa")) {
	        			String roomsofa = temp.get("roomsofa").toString();
	        			detailInfo_Stay.setRoomsofa(roomsofa);
	                	System.out.println("roomsofa : " + roomsofa);
	            	}
	        		
	        		if(temp.containsKey("roomcook")) {
	        			String roomcook = temp.get("roomcook").toString();
	        			detailInfo_Stay.setRoomcook(roomcook);
	                	System.out.println("roomcook : " + roomcook);
	            	}
	        		
	        		if(temp.containsKey("roomTable")) {
	        			String roomTable = temp.get("roomTable").toString();
	        			detailInfo_Stay.setRoomTable(roomTable);
	                	System.out.println("roomTable : " + roomTable);
	            	}
	        		
	        		if(temp.containsKey("roomhairdryer")) {
	        			String roomhairdryer = temp.get("roomhairdryer").toString();
	        			detailInfo_Stay.setRoomhairdryer(roomhairdryer);
	                	System.out.println("roomhairdryer : " + roomhairdryer);
	            	}
	        		
	        		if(temp.containsKey("roomsize2")) {
	        			double roomsize2 = Double.parseDouble(temp.get("roomsize2").toString());
	        			detailInfo_Stay.setRoomsize2(roomsize2);
	                	System.out.println("roomsize2 : " + roomsize2);
	            	}
	        		
	        		if(temp.containsKey("roomimg1")) {
	        			String roomimg1 = temp.get("roomimg1").toString();
	        			detailInfo_Stay.setRoomimg1(roomimg1);
	                	System.out.println("roomimg1 : " + roomimg1);
	            	}
	        		
	        		if(temp.containsKey("roomimg1alt")) {
	        			String roomimg1alt = temp.get("roomimg1alt").toString();
	        			detailInfo_Stay.setRoomimg1alt(roomimg1alt);
	                	System.out.println("roomimg1alt : " + roomimg1alt);
	            	}
	        		
	        		if(temp.containsKey("roomimg2")) {
	        			String roomimg2 = temp.get("roomimg2").toString();
	        			detailInfo_Stay.setRoomimg2(roomimg2);
	                	System.out.println("roomimg2 : " + roomimg2);
	            	}
	        		
	        		if(temp.containsKey("roomimg2alt")) {
	        			String roomimg2alt = temp.get("roomimg2alt").toString();
	        			detailInfo_Stay.setRoomimg2alt(roomimg2alt);
	                	System.out.println("roomimg2alt : " + roomimg2alt);
	            	}
	        		
	        		if(temp.containsKey("roomimg3")) {
	        			String roomimg3 = temp.get("roomimg3").toString();
	        			detailInfo_Stay.setRoomimg3(roomimg3);
	                	System.out.println("roomimg3 : " + roomimg3);
	            	}
	        		
	        		if(temp.containsKey("roomimg3alt")) {
	        			String roomimg3alt = temp.get("roomimg3alt").toString();
	        			detailInfo_Stay.setRoomimg3alt(roomimg3alt);
	                	System.out.println("roomimg3alt : " + roomimg3alt);
	            	}
	        		
	        		if(temp.containsKey("roomimg4")) {
	        			String roomimg4 = temp.get("roomimg4").toString();
	        			detailInfo_Stay.setRoomimg4(roomimg4);
	                	System.out.println("roomimg4 : " + roomimg4);
	            	}
	        		
	        		if(temp.containsKey("roomimg4alt")) {
	        			String roomimg4alt = temp.get("roomimg4alt").toString();
	        			detailInfo_Stay.setRoomimg4alt(roomimg4alt);
	                	System.out.println("roomimg4alt : " + roomimg4alt);
	            	}
	        		
	        		if(temp.containsKey("roomimg5")) {
	        			String roomimg5 = temp.get("roomimg5").toString();
	        			detailInfo_Stay.setRoomimg5(roomimg5);
	                	System.out.println("roomimg5 : " + roomimg5);
	            	}
	        		
	        		if(temp.containsKey("roomimg5alt")) {
	        			String roomimg5alt = temp.get("roomimg5alt").toString();
	        			detailInfo_Stay.setRoomimg5alt(roomimg5alt);
	                	System.out.println("roomimg5alt : " + roomimg5alt);
	            	}
	        		
		        	dtos.add(detailInfo_Stay);

	        	}
	        	System.out.println("");
	        }
		}
		return dtos;
	}
}
