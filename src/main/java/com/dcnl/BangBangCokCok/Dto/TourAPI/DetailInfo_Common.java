package com.dcnl.BangBangCokCok.Dto.TourAPI;

public class DetailInfo_Common {
	private String contentid;
	private String contenttypeid;
	private String fldgubun;
	private String infoname;
	private String infotext;
	private String serialnum;
	
	// 디폴트 생성자
	public DetailInfo_Common() {
		
	}
	
	// 필드를 이용한 생성자
	public DetailInfo_Common(String contentid, String contenttypeid, String fldgubun, String infoname, String infotext,
			String serialnum) {
		this.contentid = contentid;
		this.contenttypeid = contenttypeid;
		this.fldgubun = fldgubun;
		this.infoname = infoname;
		this.infotext = infotext;
		this.serialnum = serialnum;
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
	public String getFldgubun() {
		return fldgubun;
	}
	public void setFldgubun(String fldgubun) {
		this.fldgubun = fldgubun;
	}
	public String getInfoname() {
		return infoname;
	}
	public void setInfoname(String infoname) {
		this.infoname = infoname;
	}
	public String getInfotext() {
		return infotext;
	}
	public void setInfotext(String infotext) {
		this.infotext = infotext;
	}
	public String getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}
}
