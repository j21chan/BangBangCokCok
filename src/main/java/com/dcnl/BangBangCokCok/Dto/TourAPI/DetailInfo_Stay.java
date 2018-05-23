package com.dcnl.BangBangCokCok.Dto.TourAPI;

public class DetailInfo_Stay {
	private String contentid;
	private String contenttypeid;
	private String roomcode;
	private String roomtitle;
	private double roomsize1;
	private int roomcount;
	private int roombasecount;
	private int roommaxcount;
	private int roomoffseasonminfee1;
	private int roomoffseasonminfee2;
	private int roompeakseasonminfee1;
	private int  roompeakseasonminfee2;
	private String roomintro;
	private String roombathfacility;
	private String roombath;
	private String roomhometheater;
	private String roomaircondition;
	private String roomtv;
	private String roompc;
	private String roomcable;
	private String roominternet;
	private String roomrefrigerator;
	private String roomtoiletries;
	private String roomsofa;
	private String roomcook;
	private String roomTable;
	private String roomhairdryer;
	private double roomsize2;
	private String roomimg1;
	private String roomimg1alt;
	private String roomimg2;
	private String roomimg2alt;
	private String roomimg3;
	private String roomimg3alt;
	private String roomimg4;
	private String roomimg4alt;
	private String roomimg5;
	private String roomimg5alt;
	
	// 디폴트 생성자
	public DetailInfo_Stay() {
		
	}
	
	// 필드를 이용한 생성자
	public DetailInfo_Stay(String contentid, String contenttypeid, String roomcode, String roomtitle, double roomsize1,
			int roomcount, int roombasecount, int roommaxcount, int roomoffseasonminfee1, int roomoffseasonminfee2,
			int roompeakseasonminfee1, int roompeakseasonminfee2, String roomintro, String roombathfacility,
			String roombath, String roomhometheater, String roomaircondition, String roomtv, String roompc,
			String roomcable, String roominternet, String roomrefrigerator, String roomtoiletries, String roomsofa,
			String roomcook, String roomTable, String roomhairdryer, double roomsize2, String roomimg1,
			String roomimg1alt, String roomimg2, String roomimg2alt, String roomimg3, String roomimg3alt,
			String roomimg4, String roomimg4alt, String roomimg5, String roomimg5alt) {
		this.contentid = contentid;
		this.contenttypeid = contenttypeid;
		this.roomcode = roomcode;
		this.roomtitle = roomtitle;
		this.roomsize1 = roomsize1;
		this.roomcount = roomcount;
		this.roombasecount = roombasecount;
		this.roommaxcount = roommaxcount;
		this.roomoffseasonminfee1 = roomoffseasonminfee1;
		this.roomoffseasonminfee2 = roomoffseasonminfee2;
		this.roompeakseasonminfee1 = roompeakseasonminfee1;
		this.roompeakseasonminfee2 = roompeakseasonminfee2;
		this.roomintro = roomintro;
		this.roombathfacility = roombathfacility;
		this.roombath = roombath;
		this.roomhometheater = roomhometheater;
		this.roomaircondition = roomaircondition;
		this.roomtv = roomtv;
		this.roompc = roompc;
		this.roomcable = roomcable;
		this.roominternet = roominternet;
		this.roomrefrigerator = roomrefrigerator;
		this.roomtoiletries = roomtoiletries;
		this.roomsofa = roomsofa;
		this.roomcook = roomcook;
		this.roomTable = roomTable;
		this.roomhairdryer = roomhairdryer;
		this.roomsize2 = roomsize2;
		this.roomimg1 = roomimg1;
		this.roomimg1alt = roomimg1alt;
		this.roomimg2 = roomimg2;
		this.roomimg2alt = roomimg2alt;
		this.roomimg3 = roomimg3;
		this.roomimg3alt = roomimg3alt;
		this.roomimg4 = roomimg4;
		this.roomimg4alt = roomimg4alt;
		this.roomimg5 = roomimg5;
		this.roomimg5alt = roomimg5alt;
	}
	
	
	// Getters and Setters 
	public String getContentid() {
		return contentid;
	}
	public void setContentid(String contentid) {
		this.contentid = contentid;
	}
	public String getContenttypeid() {
		return contenttypeid;
	}
	public void setContenttypeid(String contenttypeid) {
		this.contenttypeid = contenttypeid;
	}
	public String getRoomcode() {
		return roomcode;
	}
	public void setRoomcode(String roomcode) {
		this.roomcode = roomcode;
	}
	public String getRoomtitle() {
		return roomtitle;
	}
	public void setRoomtitle(String roomtitle) {
		this.roomtitle = roomtitle;
	}
	public double getRoomsize1() {
		return roomsize1;
	}
	public void setRoomsize1(double roomsize1) {
		this.roomsize1 = roomsize1;
	}
	public int getRoomcount() {
		return roomcount;
	}
	public void setRoomcount(int roomcount) {
		this.roomcount = roomcount;
	}
	public int getRoombasecount() {
		return roombasecount;
	}
	public void setRoombasecount(int roombasecount) {
		this.roombasecount = roombasecount;
	}
	public int getRoommaxcount() {
		return roommaxcount;
	}
	public void setRoommaxcount(int roommaxcount) {
		this.roommaxcount = roommaxcount;
	}
	public int getRoomoffseasonminfee1() {
		return roomoffseasonminfee1;
	}
	public void setRoomoffseasonminfee1(int roomoffseasonminfee1) {
		this.roomoffseasonminfee1 = roomoffseasonminfee1;
	}
	public int getRoomoffseasonminfee2() {
		return roomoffseasonminfee2;
	}
	public void setRoomoffseasonminfee2(int roomoffseasonminfee2) {
		this.roomoffseasonminfee2 = roomoffseasonminfee2;
	}
	public int getRoompeakseasonminfee1() {
		return roompeakseasonminfee1;
	}
	public void setRoompeakseasonminfee1(int roompeakseasonminfee1) {
		this.roompeakseasonminfee1 = roompeakseasonminfee1;
	}
	public int getRoompeakseasonminfee2() {
		return roompeakseasonminfee2;
	}
	public void setRoompeakseasonminfee2(int roompeakseasonminfee2) {
		this.roompeakseasonminfee2 = roompeakseasonminfee2;
	}
	public String getRoomintro() {
		return roomintro;
	}
	public void setRoomintro(String roomintro) {
		this.roomintro = roomintro;
	}
	public String getRoombathfacility() {
		return roombathfacility;
	}
	public void setRoombathfacility(String roombathfacility) {
		this.roombathfacility = roombathfacility;
	}
	public String getRoombath() {
		return roombath;
	}
	public void setRoombath(String roombath) {
		this.roombath = roombath;
	}
	public String getRoomhometheater() {
		return roomhometheater;
	}
	public void setRoomhometheater(String roomhometheater) {
		this.roomhometheater = roomhometheater;
	}
	public String getRoomaircondition() {
		return roomaircondition;
	}
	public void setRoomaircondition(String roomaircondition) {
		this.roomaircondition = roomaircondition;
	}
	public String getRoomtv() {
		return roomtv;
	}
	public void setRoomtv(String roomtv) {
		this.roomtv = roomtv;
	}
	public String getRoompc() {
		return roompc;
	}
	public void setRoompc(String roompc) {
		this.roompc = roompc;
	}
	public String getRoomcable() {
		return roomcable;
	}
	public void setRoomcable(String roomcable) {
		this.roomcable = roomcable;
	}
	public String getRoominternet() {
		return roominternet;
	}
	public void setRoominternet(String roominternet) {
		this.roominternet = roominternet;
	}
	public String getRoomrefrigerator() {
		return roomrefrigerator;
	}
	public void setRoomrefrigerator(String roomrefrigerator) {
		this.roomrefrigerator = roomrefrigerator;
	}
	public String getRoomtoiletries() {
		return roomtoiletries;
	}
	public void setRoomtoiletries(String roomtoiletries) {
		this.roomtoiletries = roomtoiletries;
	}
	public String getRoomsofa() {
		return roomsofa;
	}
	public void setRoomsofa(String roomsofa) {
		this.roomsofa = roomsofa;
	}
	public String getRoomcook() {
		return roomcook;
	}
	public void setRoomcook(String roomcook) {
		this.roomcook = roomcook;
	}
	public String getRoomTable() {
		return roomTable;
	}
	public void setRoomTable(String roomTable) {
		this.roomTable = roomTable;
	}
	public String getRoomhairdryer() {
		return roomhairdryer;
	}
	public void setRoomhairdryer(String roomhairdryer) {
		this.roomhairdryer = roomhairdryer;
	}
	public double getRoomsize2() {
		return roomsize2;
	}
	public void setRoomsize2(double roomsize2) {
		this.roomsize2 = roomsize2;
	}
	public String getRoomimg1() {
		return roomimg1;
	}
	public void setRoomimg1(String roomimg1) {
		this.roomimg1 = roomimg1;
	}
	public String getRoomimg1alt() {
		return roomimg1alt;
	}
	public void setRoomimg1alt(String roomimg1alt) {
		this.roomimg1alt = roomimg1alt;
	}
	public String getRoomimg2() {
		return roomimg2;
	}
	public void setRoomimg2(String roomimg2) {
		this.roomimg2 = roomimg2;
	}
	public String getRoomimg2alt() {
		return roomimg2alt;
	}
	public void setRoomimg2alt(String roomimg2alt) {
		this.roomimg2alt = roomimg2alt;
	}
	public String getRoomimg3() {
		return roomimg3;
	}
	public void setRoomimg3(String roomimg3) {
		this.roomimg3 = roomimg3;
	}
	public String getRoomimg3alt() {
		return roomimg3alt;
	}
	public void setRoomimg3alt(String roomimg3alt) {
		this.roomimg3alt = roomimg3alt;
	}
	public String getRoomimg4() {
		return roomimg4;
	}
	public void setRoomimg4(String roomimg4) {
		this.roomimg4 = roomimg4;
	}
	public String getRoomimg4alt() {
		return roomimg4alt;
	}
	public void setRoomimg4alt(String roomimg4alt) {
		this.roomimg4alt = roomimg4alt;
	}
	public String getRoomimg5() {
		return roomimg5;
	}
	public void setRoomimg5(String roomimg5) {
		this.roomimg5 = roomimg5;
	}
	public String getRoomimg5alt() {
		return roomimg5alt;
	}
	public void setRoomimg5alt(String roomimg5alt) {
		this.roomimg5alt = roomimg5alt;
	}
}