package com.cfs.adminpanel.models;

import java.util.Arrays;
import java.util.Date;

public class AdminPanelAttributes {

	private String titleOfTraining;
	private String trainerName;
	private Date startDate;
	private Date endDate;
	private int daysSurveyAvailable;
	private String[] questions;
	
	public AdminPanelAttributes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdminPanelAttributes(String titleOfTraining, String trainerName, Date startDate, Date endDate,
			int daysSurveyAvailable, String[] questions) {
		super();
		this.titleOfTraining = titleOfTraining;
		this.trainerName = trainerName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.daysSurveyAvailable = daysSurveyAvailable;
		this.questions = questions;
	}
	
	public String getTitleOfTraining() {
		return titleOfTraining;
	}
	
	public void setTitleOfTraining(String titleOfTraining) {
		this.titleOfTraining = titleOfTraining;
	}
	
	public String getTrainerName() {
		return trainerName;
	}
	
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public int getDaysSurveyAvailable() {
		return daysSurveyAvailable;
	}
	
	public void setDaysSurveyAvailable(int daysSurveyAvailable) {
		this.daysSurveyAvailable = daysSurveyAvailable;
	}
	
	public String[] getQuestions() {
		return questions;
	}
	
	public void setQuestions(String[] questions) {
		this.questions = questions;
	}
	
	@Override
	public String toString() {
		return "AdminPanelAttributes [titleOfTraining=" + titleOfTraining + ", trainerName=" + trainerName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", daysSurveyAvailable=" + daysSurveyAvailable
				+ ", questions=" + Arrays.toString(questions) + "]";
	}
	
	
}
