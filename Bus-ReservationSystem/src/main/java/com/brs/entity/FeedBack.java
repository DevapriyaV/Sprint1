package com.brs.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FeedBack {
	@Id
	private int feedBackId;
	private int driverRating;
	private int serviceRating;
	private int overallRating;
	private String comments;
	private LocalDate feedbackdate;
	@OneToOne(targetEntity = User.class)
	private User users;
	@OneToOne(targetEntity = Bus.class)
	private Bus bus;
	public int getFeedBackId() {
		return feedBackId;
	}
	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}
	public int getDriverRating() {
		return driverRating;
	}
	public void setDriverRating(int driverRating) {
		this.driverRating = driverRating;
	}
	public int getServiceRating() {
		return serviceRating;
	}
	public void setServiceRating(int serviceRating) {
		this.serviceRating = serviceRating;
	}
	public int getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public LocalDate getFeedbackdate() {
		return feedbackdate;
	}
	public void setFeedbackdate(LocalDate feedbackdate) {
		this.feedbackdate = feedbackdate;
	}
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	

}
