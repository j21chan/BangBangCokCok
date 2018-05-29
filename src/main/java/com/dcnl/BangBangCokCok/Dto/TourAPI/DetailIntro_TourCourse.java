package com.dcnl.BangBangCokCok.Dto.TourAPI;

public class DetailIntro_TourCourse {
	private String contentid;
	private String contenttypeid;
	private String distance;
	private String infocentertourcourse;
	private String schedule;
	private String taketime;
	private String theme;
	
	// Default Constructor
	public DetailIntro_TourCourse() {
		
	}
	
	// Constructor Using Fields
	public DetailIntro_TourCourse(String contentid, String contenttypeid, String distance, String infocentertourcourse,
			String schedule, String taketime, String theme) {
		this.contentid = contentid;
		this.contenttypeid = contenttypeid;
		this.distance = distance;
		this.infocentertourcourse = infocentertourcourse;
		this.schedule = schedule;
		this.taketime = taketime;
		this.theme = theme;
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
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getInfocentertourcourse() {
		return infocentertourcourse;
	}
	public void setInfocentertourcourse(String infocentertourcourse) {
		this.infocentertourcourse = infocentertourcourse;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getTaketime() {
		return taketime;
	}
	public void setTaketime(String taketime) {
		this.taketime = taketime;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
}
