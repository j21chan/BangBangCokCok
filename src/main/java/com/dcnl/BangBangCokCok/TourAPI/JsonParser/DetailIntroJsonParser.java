package com.dcnl.BangBangCokCok.TourAPI.JsonParser;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.dcnl.BangBangCokCok.Dto.TourAPI.DetailIntro_TourDes;

public class DetailIntroJsonParser implements JsonParser {
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
	        	
	        	// 변수 초기화
	        	String contentid = null;
	           	// 기본 응답
	        	if(temp.containsKey("contentid")) {
	        		contentid = temp.get("contentid").toString();
	            	System.out.println("contentid : " + contentid);
	        	}
	        	
	        	String contenttypeid = null;
	        	if(temp.containsKey("contenttypeid")) {
	        		contenttypeid = temp.get("contenttypeid").toString();
	            	System.out.println("contenttypeid : " + contenttypeid);
	        	}
	        	
	        	
	        	// 관광지 (contentTypeId = 12)
	         	if(contenttypeid.equals("12")) {
	         		
	         		// 관광지 관련 객체 타입 생성
	         		DetailIntro_TourDes detailIntro_TourDes = new DetailIntro_TourDes();
	         		
	         		// contentid, contenttypeid 세팅
	         		detailIntro_TourDes.setContentid(contentid);
	         		detailIntro_TourDes.setContenttypeid(contenttypeid);
	         		
	         		if(temp.containsKey("accomcount")) {
	            		int accomcount = Integer.parseInt(temp.get("accomcount").toString());
	            		detailIntro_TourDes.setAccomcount(accomcount);
	                	System.out.println("accomcount : " + accomcount);
	            	}
	         		
	         		if(temp.containsKey("chkbabycarriage")) {
	            		String chkbabycarriage = temp.get("chkbabycarriage").toString();
	            		detailIntro_TourDes.setChkbabycarriage(chkbabycarriage);
	                	System.out.println("chkbabycarriage : " + chkbabycarriage);
	            	}
	         		
	         		if(temp.containsKey("chkpet")) {
	            		String chkpet = temp.get("chkpet").toString();
	            		detailIntro_TourDes.setChkpet(chkpet);
	                	System.out.println("chkpet : " + chkpet);
	            	}
	         		
	         		if(temp.containsKey("expagerange")) {
	            		int expagerange = Integer.parseInt(temp.get("expagerange").toString());
	            		detailIntro_TourDes.setExpagerange(expagerange);
	                	System.out.println("expagerange : " + expagerange);
	            	}
	         		
	         		if(temp.containsKey("expguide")) {
	            		String expguide = temp.get("expguide").toString();
	                	System.out.println("expguide : " + expguide);
	            	}
	         		
	         		if(temp.containsKey("heritage1")) {
	            		String heritage1 = temp.get("heritage1").toString();
	                	System.out.println("heritage1 : " + heritage1);
	            	}
	         		
	         		if(temp.containsKey("heritage2")) {
	            		String heritage2 = temp.get("heritage2").toString();
	                	System.out.println("heritage2 : " + heritage2);
	            	}
	         		
	         		if(temp.containsKey("heritage3")) {
	            		String heritage3 = temp.get("heritage3").toString();
	                	System.out.println("heritage3 : " + heritage3);
	            	}
	         		
	         		if(temp.containsKey("infocenter")) {
	            		String infocenter = temp.get("infocenter").toString();
	                	System.out.println("infocenter : " + infocenter);
	            	}
	         		
	         		if(temp.containsKey("opendate")) {
	            		String opendate = temp.get("opendate").toString();
	                	System.out.println("opendate : " + opendate);
	            	}
	         		
	         		if(temp.containsKey("parking")) {
	            		String parking = temp.get("parking").toString();
	                	System.out.println("parking : " + parking);
	            	}
	         		
	         		if(temp.containsKey("restdate")) {
	            		String restdate = temp.get("restdate").toString();
	                	System.out.println("restdate : " + restdate);
	            	}
	         		
	         		if(temp.containsKey("useseason")) {
	            		String useseason = temp.get("useseason").toString();
	                	System.out.println("useseason : " + useseason);
	            	}
	         		
	         		if(temp.containsKey("usetime")) {
	            		String usetime = temp.get("usetime").toString();
	                	System.out.println("usetime : " + usetime);
	            	}
	         		
	         		// 리스트에 객체 추가
	         		dtos.add(detailIntro_TourDes);
	         	}
	        	
	    	    // 문화시설 (contentTypeId = 14)
	    	 	if(contenttypeid.equals("14")) {
	    	 		
	    	 		if(temp.containsKey("accomcountculture")) {
	    	    		String accomcountculture = temp.get("accomcountculture").toString();
	    	        	System.out.println("accomcountculture : " + accomcountculture);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("chkbabycarriage")) {
	    	    		String chkbabycarriage = temp.get("chkbabycarriage").toString();
	    	        	System.out.println("chkbabycarriage : " + chkbabycarriage);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("chkcreditcardculture")) {
	    	    		String chkcreditcardculture = temp.get("chkcreditcardculture").toString();
	    	        	System.out.println("chkcreditcardculture : " + chkcreditcardculture);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("chkpetculture")) {
	    	    		String chkpetculture = temp.get("chkpetculture").toString();
	    	        	System.out.println("chkpetculture : " + chkpetculture);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("discountinfo")) {
	    	    		String discountinfo = temp.get("discountinfo").toString();
	    	        	System.out.println("discountinfo : " + discountinfo);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("infocenterculture")) {
	    	    		String infocenterculture = temp.get("infocenterculture").toString();
	    	        	System.out.println("infocenterculture : " + infocenterculture);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("parkingculture")) {
	    	    		String parkingculture = temp.get("parkingculture").toString();
	    	        	System.out.println("parkingculture : " + parkingculture);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("parkingfee")) {
	    	    		String parkingfee = temp.get("parkingfee").toString();
	    	        	System.out.println("parkingfee : " + parkingfee);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("restdateculture")) {
	    	    		String restdateculture = temp.get("restdateculture").toString();
	    	        	System.out.println("restdateculture : " + restdateculture);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("usefee")) {
	    	    		String usefee = temp.get("usefee").toString();
	    	        	System.out.println("usefee : " + usefee);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("usetimeculture")) {
	    	    		String usetimeculture = temp.get("usetimeculture").toString();
	    	        	System.out.println("parking : " + usetimeculture);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("scale")) {
	    	    		String scale = temp.get("scale").toString();
	    	        	System.out.println("scale : " + scale);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("spendtime")) {
	    	    		String spendtime = temp.get("spendtime").toString();
	    	        	System.out.println("spendtime : " + spendtime);
	    	    	}
	    	 	}
	        	
	    	 	// 행사/공연/축제 (contentTypeId = 15)
	    	 	if(contenttypeid.equals("15")) {
	    	 		
	    	 		if(temp.containsKey("agelimit")) {
	    	    		String agelimit = temp.get("agelimit").toString();
	    	        	System.out.println("agelimit : " + agelimit);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("bookingplace")) {
	    	    		String bookingplace = temp.get("bookingplace").toString();
	    	        	System.out.println("bookingplace : " + bookingplace);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("discountinfofestival")) {
	    	    		String discountinfofestival = temp.get("discountinfofestival").toString();
	    	        	System.out.println("discountinfofestival : " + discountinfofestival);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("eventenddate")) {
	    	    		String eventenddate = temp.get("eventenddate").toString();
	    	        	System.out.println("eventenddate : " + eventenddate);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("eventhomepage")) {
	    	    		String eventhomepage = temp.get("eventhomepage").toString();
	    	        	System.out.println("eventhomepage : " + eventhomepage);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("eventplace")) {
	    	    		String eventplace = temp.get("eventplace").toString();
	    	        	System.out.println("eventplace : " + eventplace);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("eventstartdate")) {
	    	    		String eventstartdate = temp.get("eventstartdate").toString();
	    	        	System.out.println("eventstartdate : " + eventstartdate);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("festivalgrade")) {
	    	    		String festivalgrade = temp.get("festivalgrade").toString();
	    	        	System.out.println("festivalgrade : " + festivalgrade);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("placeinfo")) {
	    	    		String placeinfo = temp.get("placeinfo").toString();
	    	        	System.out.println("placeinfo : " + placeinfo);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("playtime")) {
	    	    		String playtime = temp.get("playtime").toString();
	    	        	System.out.println("playtime : " + playtime);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("program")) {
	    	    		String program = temp.get("program").toString();
	    	        	System.out.println("program : " + program);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("spendtimefestival")) {
	    	    		String spendtimefestival = temp.get("spendtimefestival").toString();
	    	        	System.out.println("spendtimefestival : " + spendtimefestival);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("sponsor1")) {
	    	    		String sponsor1 = temp.get("sponsor1").toString();
	    	        	System.out.println("sponsor1 : " + sponsor1);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("sponsor1tel")) {
	    	    		String sponsor1tel = temp.get("sponsor1tel").toString();
	    	        	System.out.println("sponsor1tel : " + sponsor1tel);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("sponsor2")) {
	    	    		String sponsor2 = temp.get("sponsor2").toString();
	    	        	System.out.println("sponsor2 : " + sponsor2);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("sponsor2tel")) {
	    	    		String sponsor2tel = temp.get("sponsor2tel").toString();
	    	        	System.out.println("sponsor2tel : " + sponsor2tel);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("subevent")) {
	    	    		String subevent = temp.get("subevent").toString();
	    	        	System.out.println("subevent : " + subevent);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("usetimefestival")) {
	    	    		String usetimefestival = temp.get("usetimefestival").toString();
	    	        	System.out.println("usetimefestival : " + usetimefestival);
	    	    	}
	    	 	}
	    	 	
	    	 	// 여행코스 (contentTypeId = 25)
	     	 	if(contenttypeid.equals("25")) {
	     	 		
	     	 		if(temp.containsKey("distance")) {
	     	    		String distance = temp.get("distance").toString();
	     	        	System.out.println("distance : " + distance);
	     	    	}
	     	 		
	     	 		if(temp.containsKey("infocentertourcourse")) {
	     	    		String infocentertourcourse = temp.get("infocentertourcourse").toString();
	     	        	System.out.println("infocentertourcourse : " + infocentertourcourse);
	     	    	}
	     	 		
	     	 		if(temp.containsKey("schedule")) {
	     	    		String schedule = temp.get("schedule").toString();
	     	        	System.out.println("schedule : " + schedule);
	     	    	}
	     	 		
	     	 		if(temp.containsKey("taketime")) {
	     	    		String taketime = temp.get("taketime").toString();
	     	        	System.out.println("taketime : " + taketime);
	     	    	}
	     	 		
	     	 		if(temp.containsKey("theme")) {
	     	    		String theme = temp.get("theme").toString();
	     	        	System.out.println("theme : " + theme);
	     	    	}
	     	 	}
	    	    // 레포츠 (contentTypeId = 28)
	    	 	if(contenttypeid.equals("28")) {
	    	 		
	    	 		if(temp.containsKey("accomcountleports")) {
	    	    		String accomcountleports = temp.get("accomcountleports").toString();
	    	        	System.out.println("accomcountleports : " + accomcountleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("chkbabycarriageleports")) {
	    	    		String chkbabycarriageleports = temp.get("chkbabycarriageleports").toString();
	    	        	System.out.println("chkbabycarriageleports : " + chkbabycarriageleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("chkcreditcardleports")) {
	    	    		String chkcreditcardleports = temp.get("chkcreditcardleports").toString();
	    	        	System.out.println("chkcreditcardleports : " + chkcreditcardleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("chkpetleports")) {
	    	    		String chkpetleports = temp.get("chkpetleports").toString();
	    	        	System.out.println("chkpetleports : " + chkpetleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("expagerangeleports")) {
	    	    		String expagerangeleports = temp.get("expagerangeleports").toString();
	    	        	System.out.println("expagerangeleports : " + expagerangeleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("infocenterleports")) {
	    	    		String infocenterleports = temp.get("infocenterleports").toString();
	    	        	System.out.println("infocenterleports : " + infocenterleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("openperiod")) {
	    	    		String openperiod = temp.get("openperiod").toString();
	    	        	System.out.println("openperiod : " + openperiod);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("parkingfeeleports")) {
	    	    		String parkingfeeleports = temp.get("parkingfeeleports").toString();
	    	        	System.out.println("parkingfeeleports : " + parkingfeeleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("parkingleports")) {
	    	    		String parkingleports = temp.get("parkingleports").toString();
	    	        	System.out.println("parkingleports : " + parkingleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("reservation")) {
	    	    		String reservation = temp.get("reservation").toString();
	    	        	System.out.println("usefee : " + reservation);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("restdateleports")) {
	    	    		String restdateleports = temp.get("restdateleports").toString();
	    	        	System.out.println("parking : " + restdateleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("scaleleports")) {
	    	    		String scaleleports = temp.get("scaleleports").toString();
	    	        	System.out.println("scaleleports : " + scaleleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("usefeeleports")) {
	    	    		String usefeeleports = temp.get("usefeeleports").toString();
	    	        	System.out.println("usefeeleports : " + usefeeleports);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("usetimeleports")) {
	    	    		String usetimeleports = temp.get("usetimeleports").toString();
	    	        	System.out.println("usetimeleports : " + usetimeleports);
	    	    	}
	    	 	}
	    	 	
	    	    // 숙박 (contentTypeId = 32)
	    	 	if(contenttypeid.equals("32")) {
	    	 		
	    	 		if(temp.containsKey("accomcountlodging")) {
	    	    		String accomcountlodging = temp.get("accomcountlodging").toString();
	    	        	System.out.println("accomcountlodging : " + accomcountlodging);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("benikia")) {
	    	    		String benikia = temp.get("benikia").toString();
	    	        	System.out.println("benikia : " + benikia);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("checkintime")) {
	    	    		String checkintime = temp.get("checkintime").toString();
	    	        	System.out.println("checkintime : " + checkintime);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("chkcooking")) {
	    	    		String chkcooking = temp.get("chkcooking").toString();
	    	        	System.out.println("chkcooking : " + chkcooking);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("foodplace")) {
	    	    		String foodplace = temp.get("foodplace").toString();
	    	        	System.out.println("foodplace : " + foodplace);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("goodstay")) {
	    	    		String goodstay = temp.get("goodstay").toString();
	    	        	System.out.println("goodstay : " + goodstay);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("hanok")) {
	    	    		String hanok = temp.get("hanok").toString();
	    	        	System.out.println("hanok : " + hanok);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("infocenterlodging")) {
	    	    		String infocenterlodging = temp.get("infocenterlodging").toString();
	    	        	System.out.println("infocenterlodging : " + infocenterlodging);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("parkinglodging")) {
	    	    		String parkinglodging = temp.get("parkinglodging").toString();
	    	        	System.out.println("parkinglodging" + parkinglodging);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("pickup")) {
	    	    		String pickup = temp.get("pickup").toString();
	    	        	System.out.println("pickup : " + pickup);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("roomcount")) {
	    	    		String roomcount = temp.get("roomcount").toString();
	    	        	System.out.println("roomcount : " + roomcount);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("reservationlodging")) {
	    	    		String reservationlodging = temp.get("reservationlodging").toString();
	    	        	System.out.println("reservationlodging	 : " + reservationlodging);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("reservationurl")) {
	    	    		String reservationurl = temp.get("reservationurl").toString();
	    	        	System.out.println("reservationurl : " + reservationurl);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("roomtype")) {
	    	    		String roomtype = temp.get("roomtype").toString();
	    	        	System.out.println("roomtype : " + roomtype);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("scalelodging")) {
	    	    		String scalelodging = temp.get("scalelodging").toString();
	    	        	System.out.println("scalelodging : " + scalelodging);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("subfacility")) {
	    	    		String subfacility = temp.get("subfacility").toString();
	    	        	System.out.println("subfacility : " + subfacility);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("barbecue")) {
	    	    		String barbecue = temp.get("barbecue").toString();
	    	        	System.out.println("barbecue : " + barbecue);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("beauty")) {
	    	    		String beauty = temp.get("beauty").toString();
	    	        	System.out.println("beauty : " + beauty);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("beverage")) {
	    	    		String beverage = temp.get("beverage").toString();
	    	        	System.out.println("beverage : " + beverage);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("bicycle")) {
	    	    		String bicycle = temp.get("bicycle").toString();
	    	        	System.out.println("bicycle : " + bicycle);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("campfire")) {
	    	    		String campfire = temp.get("campfire").toString();
	    	        	System.out.println("campfire : " + campfire);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("fitness")) {
	    	    		String fitness = temp.get("fitness").toString();
	    	        	System.out.println("fitness : " + fitness);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("karaoke")) {
	    	    		String karaoke = temp.get("karaoke").toString();
	    	        	System.out.println("karaoke : " + karaoke);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("publicbath")) {
	    	    		String publicbath = temp.get("publicbath").toString();
	    	        	System.out.println("publicbath : " + publicbath);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("publicpc")) {
	    	    		String publicpc = temp.get("publicpc").toString();
	    	        	System.out.println("publicpc : " + publicpc);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("sauna")) {
	    	    		String sauna = temp.get("sauna").toString();
	    	        	System.out.println("sauna : " + sauna);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("seminar")) {
	    	    		String seminar = temp.get("seminar").toString();
	    	        	System.out.println("seminar : " + seminar);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("Sports")) {
	    	    		String Sports = temp.get("Sports").toString();
	    	        	System.out.println("Sports : " + Sports);
	    	    	}
	    	 	}

	    	    // 쇼핑 (contentTypeId = 38)
	    	 	if(contenttypeid.equals("38")) {
	    	 		
	    	 		if(temp.containsKey("chkbabycarriageshopping")) {
	    	    		String chkbabycarriageshopping = temp.get("chkbabycarriageshopping").toString();
	    	        	System.out.println("chkbabycarriageshopping : " + chkbabycarriageshopping);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("chkcreditcardshopping")) {
	    	    		String chkcreditcardshopping = temp.get("chkcreditcardshopping").toString();
	    	        	System.out.println("chkcreditcardshopping : " + chkcreditcardshopping);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("chkpetshopping")) {
	    	    		String chkpetshopping = temp.get("chkpetshopping").toString();
	    	        	System.out.println("chkpetshopping : " + chkpetshopping);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("culturecenter")) {
	    	    		String culturecenter = temp.get("culturecenter").toString();
	    	        	System.out.println("culturecenter : " + culturecenter);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("fairday")) {
	    	    		String fairday = temp.get("fairday").toString();
	    	        	System.out.println("fairday : " + fairday);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("infocentershopping")) {
	    	    		String infocentershopping = temp.get("infocentershopping").toString();
	    	        	System.out.println("infocentershopping : " + infocentershopping);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("opendateshopping")) {
	    	    		String opendateshopping = temp.get("opendateshopping").toString();
	    	        	System.out.println("opendateshopping : " + opendateshopping);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("opentime")) {
	    	    		String opentime = temp.get("opentime").toString();
	    	        	System.out.println("opentime : " + opentime);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("parkingshopping")) {
	    	    		String parkingshopping = temp.get("parkingshopping").toString();
	    	        	System.out.println("parkingshopping" + parkingshopping);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("restdateshopping")) {
	    	    		String restdateshopping = temp.get("restdateshopping").toString();
	    	        	System.out.println("restdateshopping : " + restdateshopping);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("restroom")) {
	    	    		String restroom = temp.get("restroom").toString();
	    	        	System.out.println("restroom : " + restroom);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("saleitem")) {
	    	    		String saleitem = temp.get("saleitem").toString();
	    	        	System.out.println("saleitem : " + saleitem);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("saleitemcost")) {
	    	    		String saleitemcost = temp.get("saleitemcost").toString();
	    	        	System.out.println("saleitemcost : " + saleitemcost);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("scaleshopping")) {
	    	    		String scaleshopping = temp.get("scaleshopping").toString();
	    	        	System.out.println("scaleshopping : " + scaleshopping);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("shopguide")) {
	    	    		String shopguide = temp.get("shopguide").toString();
	    	        	System.out.println("shopguide : " + shopguide);
	    	    	}
	    	 	}
	    	    // 음식점 (contentTypeId = 39)
	    	 	if(contenttypeid.equals("39")) {
	    	 		
	    	 		if(temp.containsKey("chkcreditcardfood")) {
	    	    		String chkcreditcardfood = temp.get("chkcreditcardfood").toString();
	    	        	System.out.println("chkcreditcardfood : " + chkcreditcardfood);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("discountinfofood")) {
	    	    		String discountinfofood = temp.get("discountinfofood").toString();
	    	        	System.out.println("discountinfofood : " + discountinfofood);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("firstmenu")) {
	    	    		String firstmenu = temp.get("firstmenu").toString();
	    	        	System.out.println("firstmenu : " + firstmenu);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("infocenterfood")) {
	    	    		String infocenterfood = temp.get("infocenterfood").toString();
	    	        	System.out.println("infocenterfood : " + infocenterfood);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("kidsfacility")) {
	    	    		String kidsfacility = temp.get("kidsfacility").toString();
	    	        	System.out.println("kidsfacility : " + kidsfacility);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("opendatefood")) {
	    	    		String opendatefood = temp.get("opendatefood").toString();
	    	        	System.out.println("opendatefood : " + opendatefood);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("opentimefood")) {
	    	    		String opentimefood = temp.get("opentimefood").toString();
	    	        	System.out.println("opentimefood : " + opentimefood);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("packing")) {
	    	    		String packing = temp.get("packing").toString();
	    	        	System.out.println("packing : " + packing);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("parkingfood")) {
	    	    		String parkingfood = temp.get("parkingfood").toString();
	    	        	System.out.println("parkingfood : " + parkingfood);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("reservationfood")) {
	    	    		String reservationfood = temp.get("reservationfood").toString();
	    	        	System.out.println("reservationfood : " + reservationfood);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("restdatefood")) {
	    	    		String restdatefood = temp.get("restdatefood").toString();
	    	        	System.out.println("restdatefood : " + restdatefood);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("scalefood")) {
	    	    		String scalefood = temp.get("scalefood").toString();
	    	        	System.out.println("scalefood : " + scalefood);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("seat")) {
	    	    		String seat = temp.get("seat").toString();
	    	        	System.out.println("seat : " + seat);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("smoking")) {
	    	    		String smoking = temp.get("smoking").toString();
	    	        	System.out.println("smoking : " + smoking);
	    	    	}
	    	 		
	    	 		if(temp.containsKey("treatmenu")) {
	    	    		String treatmenu = temp.get("treatmenu").toString();
	    	        	System.out.println("treatmenu : " + treatmenu);
	    	    	}
	    	 	}
	        	System.out.println("");
	        	
	        	// List에 넣기
//	        	dtos.add();
	        }
		}
		return dtos;
	}
}
