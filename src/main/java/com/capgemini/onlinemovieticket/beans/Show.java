package com.capgemini.onlinemovieticket.beans;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Show {
	
	private int showId;
	private LocalTime showStartTime;
	private LocalTime showEndTime;
	private List seats;
	private String showName;
	private String movieName;
	private int screenId;
	private int theatreId;
	
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public LocalTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalTime getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(LocalTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	public List getSeats() {
		return seats;
	}
	public void setSeats(ArrayList seats) {
		this.seats = seats;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
		
	}public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public Show(int showId, LocalTime showStartTime, LocalTime showEndTime, List<Integer> seat, String showName,
			String movieName, int screenId, int theatreId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.seats = seat;
		this.showName = showName;
		this.movieName = movieName;
		this.screenId = screenId;
		this.theatreId = theatreId;
	}

}

	
	
