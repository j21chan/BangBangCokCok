package com.dcnl.BangBangCokCok.Dto.TourAPI;

public class DetailIntro_Culture {
	private String contentid;
	private String contenttypeid;
	private int accomcountculture;
	private String chkbabycarriageculture;
	private String chkcreditcardculture;
	private String chkpetculture;
	private String discountinfo;
	private String infocenterculture;
	private String parkingculture;
	private int parkingfee;
	private String restdateculture;
	private int usefee;
	private String usetimeculture;
	private String scale;
	private String spendtime;
	
	// Default Contructor
	public DetailIntro_Culture() {
		
	}
	
	// Constructor using Fields
	public DetailIntro_Culture(String contentid, String contenttypeid, int accomcountculture,
			String chkbabycarriageculture, String chkcreditcardculture, String chkpetculture, String discountinfo,
			String infocenterculture, String parkingculture, int parkingfee, String restdateculture, int usefee,
			String usetimeculture, String scale, String spendtime) {
		this.contentid = contentid;
		this.contenttypeid = contenttypeid;
		this.accomcountculture = accomcountculture;
		this.chkbabycarriageculture = chkbabycarriageculture;
		this.chkcreditcardculture = chkcreditcardculture;
		this.chkpetculture = chkpetculture;
		this.discountinfo = discountinfo;
		this.infocenterculture = infocenterculture;
		this.parkingculture = parkingculture;
		this.parkingfee = parkingfee;
		this.restdateculture = restdateculture;
		this.usefee = usefee;
		this.usetimeculture = usetimeculture;
		this.scale = scale;
		this.spendtime = spendtime;
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
	public int getAccomcountculture() {
		return accomcountculture;
	}
	public void setAccomcountculture(int accomcountculture) {
		this.accomcountculture = accomcountculture;
	}
	public String getChkbabycarriageculture() {
		return chkbabycarriageculture;
	}
	public void setChkbabycarriageculture(String chkbabycarriageculture) {
		this.chkbabycarriageculture = chkbabycarriageculture;
	}
	public String getChkcreditcardculture() {
		return chkcreditcardculture;
	}
	public void setChkcreditcardculture(String chkcreditcardculture) {
		this.chkcreditcardculture = chkcreditcardculture;
	}
	public String getChkpetculture() {
		return chkpetculture;
	}
	public void setChkpetculture(String chkpetculture) {
		this.chkpetculture = chkpetculture;
	}
	public String getDiscountinfo() {
		return discountinfo;
	}
	public void setDiscountinfo(String discountinfo) {
		this.discountinfo = discountinfo;
	}
	public String getInfocenterculture() {
		return infocenterculture;
	}
	public void setInfocenterculture(String infocenterculture) {
		this.infocenterculture = infocenterculture;
	}
	public String getParkingculture() {
		return parkingculture;
	}
	public void setParkingculture(String parkingculture) {
		this.parkingculture = parkingculture;
	}
	public int getParkingfee() {
		return parkingfee;
	}
	public void setParkingfee(int parkingfee) {
		this.parkingfee = parkingfee;
	}
	public String getRestdateculture() {
		return restdateculture;
	}
	public void setRestdateculture(String restdateculture) {
		this.restdateculture = restdateculture;
	}
	public int getUsefee() {
		return usefee;
	}
	public void setUsefee(int usefee) {
		this.usefee = usefee;
	}
	public String getUsetimeculture() {
		return usetimeculture;
	}
	public void setUsetimeculture(String usetimeculture) {
		this.usetimeculture = usetimeculture;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getSpendtime() {
		return spendtime;
	}
	public void setSpendtime(String spendtime) {
		this.spendtime = spendtime;
	}
}
