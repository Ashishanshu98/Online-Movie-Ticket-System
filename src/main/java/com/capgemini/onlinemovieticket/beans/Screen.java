package com.capgemini.onlinemovieticket.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Screen {

	private int screenId;
	private int theatreId;
	private String screenName;
	private Show[] shows;
	private LocalDate movieEndDate; 
	private int rows;
	private int columns;
	

	public Screen(int screenId, int theatreId, String screenName, Show[] addShowsToScreen, LocalDate movieEndDate,
			int rows, int columns) {
		super();
		this.shows = addShowsToScreen;
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.movieEndDate = movieEndDate;
		this.rows = rows;
		this.columns = columns;
	}

	public int getScreenId() {
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

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	public Show[] getShows() {
		return shows;
	}

	public void setShows(Show[] shows) {
		this.shows = shows;
	}
	 public Screen() {
		 
	 }
	public Show searchShow(String showName)
	{
		for(Show s : shows) 
		{
		   if(s.getShowName().equals(showName)) 
		   {
	
			   return s;
			
		   }
		}
		return null;
	}
	
	public Screen(List<Theatre> listOfTheatres2, String thre,List<Show> listOfShows) {
		System.out.println("Show Name || " + "Movie Name || " +" Show Start Time || " + "Show End Time");
		for(Theatre theatre : listOfTheatres2) 
		{
			if(theatre.getTheaterName().equals(thre)) 
			{
				
		       for(Show show: listOfShows) 
		       {
		    	   
		    	   System.out.println(show.getShowName()+ "||" + show.getMovieName()+ "||" + show.getShowEndTime()+ "||" + show.getShowEndTime());
		    	   
		       }
			}
		}
	}

	
	
}
