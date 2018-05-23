package com.dcnl.BangBangCokCok.Dto.TourAPI;

public class DetailImage {
	private String contentid;
	private String imagename;
	private String originimgurl;
	private String serialnum;
	private String smallimageurl;
	
	
	// 디폴트 생성자
	public DetailImage() {
		
	}
	
	// 필드 값을 이용한 생성자
	public DetailImage(String contentid, String imagename, String originimgurl, String serialnum,
			String smallimageurl) {
		this.contentid = contentid;
		this.imagename = imagename;
		this.originimgurl = originimgurl;
		this.serialnum = serialnum;
		this.smallimageurl = smallimageurl;
	}
	
	// Getters and Setters
	public String getContentid() {
		return contentid;
	}
	public void setContentid(String contentid) {
		this.contentid = contentid;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	public String getOriginimgurl() {
		return originimgurl;
	}
	public void setOriginimgurl(String originimgurl) {
		this.originimgurl = originimgurl;
	}
	public String getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}
	public String getSmallimageurl() {
		return smallimageurl;
	}
	public void setSmallimageurl(String smallimageurl) {
		this.smallimageurl = smallimageurl;
	}
}
