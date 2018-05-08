package com.dcnl.BangBangCokCok.Dto.TourAPI;

public class AreaBasedList {
	String addr1;
	String addr2;
	String areacode;
	String cat1;
	String cat2;
	String cat3;
	String contentid;
	String contenttypeid;
	String createdtime;
	String firstimage;
	String firstimage2;
	double mapx;
	double mapy;
	String mlevel;
	String modifiedtime;
	int readcount;
	String sigungucode;
	String tel;
	String title;
	String zipcode;
	
	// 생성자
	public AreaBasedList() {
		
	}
	
	public AreaBasedList(String addr1, String addr2,
						 String areacode, String cat1, String cat2, String cat3,
						 String contentid, String contenttypeid, String createdtime,
						 String firstimage, String firstimage2,
						 double mapx, double mapy, String mlevel,
						 String modifiedtime, int readcount,
						 String sigungucode, String tel, String title, String zipcode) {
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.areacode = areacode;
		this.cat1 = cat1;
		this.cat2 = cat2;
		this.cat3 = cat3;
		this.contentid = contentid;
		this.contenttypeid = contenttypeid;
		this.createdtime = createdtime;
		this.firstimage = firstimage;
		this.firstimage2 = firstimage2;
		this.mapx = mapx;
		this.mapy = mapy;
		this.mlevel = mlevel;
		this.modifiedtime = modifiedtime;
		this.readcount = readcount;
		this.sigungucode = sigungucode;
		this.tel = tel;
		this.title = title;
		this.zipcode = zipcode;
	}
	
	
	// Setters and Getters
	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAreacode() {
		return areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public String getCat1() {
		return cat1;
	}

	public void setCat1(String cat1) {
		this.cat1 = cat1;
	}

	public String getCat2() {
		return cat2;
	}

	public void setCat2(String cat2) {
		this.cat2 = cat2;
	}

	public String getCat3() {
		return cat3;
	}

	public void setCat3(String cat3) {
		this.cat3 = cat3;
	}

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

	public String getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(String createdtime) {
		this.createdtime = createdtime;
	}

	public String getFirstimage() {
		return firstimage;
	}

	public void setFirstimage(String firstimage) {
		this.firstimage = firstimage;
	}

	public String getFirstimage2() {
		return firstimage2;
	}

	public void setFirstimage2(String firstimage2) {
		this.firstimage2 = firstimage2;
	}

	public double getMapx() {
		return mapx;
	}

	public void setMapx(double mapx) {
		this.mapx = mapx;
	}

	public double getMapy() {
		return mapy;
	}

	public void setMapy(double mapy) {
		this.mapy = mapy;
	}

	public String getMlevel() {
		return mlevel;
	}

	public void setMlevel(String mlevel) {
		this.mlevel = mlevel;
	}

	public String getModifiedtime() {
		return modifiedtime;
	}

	public void setModifiedtime(String modifiedtime) {
		this.modifiedtime = modifiedtime;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getSigungucode() {
		return sigungucode;
	}

	public void setSigungucode(String sigungucode) {
		this.sigungucode = sigungucode;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
