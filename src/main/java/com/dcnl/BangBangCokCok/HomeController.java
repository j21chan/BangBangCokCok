package com.dcnl.BangBangCokCok;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dcnl.BangBangCokCok.Dto.TourAPI.AreaCode;
import com.dcnl.BangBangCokCok.TourAPI.JsonParser.JsonParserTest;
import com.dcnl.BangBangCokCok.TourAPI.UrlBuilder.UrlBuilder;
import com.dcnl.BangBangCokCok.TourAPI.UrlRequest.UrlRequest;
import com.dcnl.BangBangCokCok.test.SampleVO;

@RestController
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/ex")
	public List<AreaCode> test(Model model) {
		
//		JsonParser jsonParser = new AreaCodeJsonParser();
		List<AreaCode> list = new ArrayList<AreaCode>();
		list = null;
		
		try {
			list = JsonParserTest.parseAreaCode(((UrlRequest.urlRequest(UrlBuilder.areaCodeURLBuild("10", "1", "")))));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	@RequestMapping(value = "/sampleVO")
	public SampleVO sample(Model model) {
		SampleVO vo = new SampleVO();
		
		vo.setMno(123);
		vo.setFirstName("길동");
		vo.setLastName("홍");

		return vo;
	}
}
