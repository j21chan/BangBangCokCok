package com.dcnl.BangBangCokCok.Dto.TourAPI;

public class DetailInfo_TourCourse {
	private String contentid;
	private String contenttypeid;
	private String subcontentid;
	private String subdetailalt;
	private String subdetailimg;
	private String subdetailoverview;
	private String subname;
	private String subnum;
	

	// 디폴트 생성자
	public DetailInfo_TourCourse() {
		
	}
	
	// 필드를 이용한 생성자
	public DetailInfo_TourCourse(String contentid, String contenttypeid, String subcontentid, String subdetailalt,
			String subdetailimg, String subdetailoverview, String subname, String subnum) {
		this.contentid = contentid;
		this.contenttypeid = contenttypeid;
		this.subcontentid = subcontentid;
		this.subdetailalt = subdetailalt;
		this.subdetailimg = subdetailimg;
		this.subdetailoverview = subdetailoverview;
		this.subname = subname;
		this.subnum = subnum;
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
	public String getSubcontentid() {
		return subcontentid;
	}
	public void setSubcontentid(String subcontentid) {
		this.subcontentid = subcontentid;
	}
	public String getSubdetailalt() {
		return subdetailalt;
	}
	public void setSubdetailalt(String subdetailalt) {
		this.subdetailalt = subdetailalt;
	}
	public String getSubdetailimg() {
		return subdetailimg;
	}
	public void setSubdetailimg(String subdetailimg) {
		this.subdetailimg = subdetailimg;
	}
	public String getSubdetailoverview() {
		return subdetailoverview;
	}
	public void setSubdetailoverview(String subdetailoverview) {
		this.subdetailoverview = subdetailoverview;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getSubnum() {
		return subnum;
	}
	public void setSubnum(String subnum) {
		this.subnum = subnum;
	}
}
