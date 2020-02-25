package com.capgemini.onlinemovieticket.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import com.capgemini.onlinemovieticket.beans.*;

public class DataHandler {

	public  static List<Movie> getMovies()
	{
		List<Movie> movies = new ArrayList<Movie>();
		String[] lang = {"Hindi","English"};
		movies.add(new Movie(3001,"Chhichhore", "Nitesh Tiwari", 154, lang, LocalDate.parse("2019-09-06")));
		movies.add(new Movie(3002,"Dream Girl", "Raaj Shaandilyaa", 140, lang, LocalDate.parse("2019-09-13")));
		movies.add(new Movie(3003,"War", "Siddharth Anand", 139, lang, LocalDate.parse("2019-10-02")));
		movies.add(new Movie(3004,"Bala", "Amar Kaushik", 153, lang, LocalDate.parse("2019-11-22")));
		movies.add(new Movie(3005,"Marjaavaan", "Milap Milan Zaveri", 150, lang, LocalDate.parse("2019-11-22")));
		movies.add(new Movie(3006,"Dabangg 3", "Prabhu Deva", 159, lang, LocalDate.parse("2019-12-20")));
		movies.add(new Movie(3007,"Panipat", "Ashutosh Gowariker", 145, lang, LocalDate.parse("2019-12-06")));
		movies.add(new Movie(3008,"Good News", "Raj Mehta", 160, lang, LocalDate.parse("2019-12-20")));
		movies.add(new Movie(3009,"Mardaani 2", "Gopi Puthran", 163, lang, LocalDate.parse("2019-12-13")));
		movies.add(new Movie(3010,"Housefull 4", "Farhad Samji", 154, lang, LocalDate.parse("2019-10-25")));
		
		return movies;
	}
	public  static List<Show> getShows()
	{  
	   List<Integer> seat = new ArrayList<Integer>();
	    seat.add(1); seat.add(2); seat.add(3);  seat.add(4); seat.add(5); 
	    seat.add(6); seat.add(7); seat.add(8); seat.add(9);  seat.add(10);
	   	
		List<Show> shows = new ArrayList<Show>();
		shows.add(new Show(4001,LocalTime.of(8,12,00),LocalTime.of(10,00,12), seat, "Morning Show","War",101,2001));
		shows.add(new Show(4002,LocalTime.of(12,12,00),LocalTime.of(2,00,12), seat, "Afternoon Show"," DDAY",102,2002));
		shows.add(new Show(4003,LocalTime.of(4,12,00),LocalTime.of(6,00,12), seat, "Evenng Show","Baby",103,2003));
		shows.add(new Show(4004,LocalTime.of(9,12,00),LocalTime.of(11,00,12), seat, "Late Night Show"," Alex",104,2004));
		return shows;
	}
	
	public static List<Screen> getListOfScreens(List<Show> shows) {
	
		List<Screen> listOfScreens = new ArrayList<Screen>();
		listOfScreens.add(new Screen(102001,2001,"Screen1",addShowsToScreen(shows, 4001,1),LocalDate.parse("2019-10-31"),25,20));
		//listOfScreens.add(new Screen(102001,2001,"Screen1",addShowsToScreen(shows, 4002,2),LocalDate.parse("2019-10-31"),25,20));
		listOfScreens.add(new Screen(102001,2002,"Screen2",addShowsToScreen(shows, 4002,2),LocalDate.parse("2019-09-01"),25,20));
		listOfScreens.add(new Screen(102001,2003,"Screen3",addShowsToScreen(shows, 4003,3),LocalDate.parse("2019-09-30"),25,20));
		listOfScreens.add(new Screen(102001,2004,"Screen4",addShowsToScreen(shows, 4004,4),LocalDate.parse("2019-09-30"),25,20));
			
		return listOfScreens;
	
	}
	
	
	
	public static List<Theatre> getListOfTheatres(List<Movie> movies, List<Screen> listOfScreens)
	{
		List<Theatre> listOfTheatres = new ArrayList<Theatre>();
		
		listOfTheatres.add(new Theatre(2001,"PVR Cinemas","Delhi",addMoviesToTheatre(movies, 2),addScreenToTheatre(listOfScreens, 2001,1),"Aditya Singh","9876543210"));
		listOfTheatres.add(new Theatre(2002,"Cinepolis Cinemas","Noida",addMoviesToTheatre(movies, 3),addScreenToTheatre(listOfScreens, 2002,2),"Mohd. Ikram","8876543210"));
		listOfTheatres.add(new Theatre(2003,"INOX Cinemas","Greater Noida",addMoviesToTheatre(movies, 2),addScreenToTheatre(listOfScreens, 2003,3),"Divyans Singh","7876543211"));
		listOfTheatres.add(new Theatre(2003,"INOX Cinemas","Noida",addMoviesToTheatre(movies, 3),addScreenToTheatre(listOfScreens, 2004,4),"Divyansh Singh","7876543210"));
	//	listOfTheatres.add(new Theatre(2003,"PVR Cinemas","Greater Noida",addMoviesToTheatre(movies, 3),addScreenToTheatre(listOfScreens, 2001,3),"Divyansh Singh","7876543210"));
		
		return listOfTheatres;
	}
	
	public static Movie[] addMoviesToTheatre(List<Movie> movies,int n)
	{	Movie[] movie = new Movie[n];
		for(int i=0;i<n;i++)
			movie[i]= movies.get(i);
		return movie;	
	}
	 
	public static Screen[] addScreenToTheatre(List<Screen> listOfScreens,int theatreId,int n)
	{
		Screen[] screen = new Screen[n];
		int j=0;
		for(int i=0;i<n;i++)
			if(listOfScreens.get(i).getTheatreId()==theatreId)
			{
				screen[j]= listOfScreens.get(i);
				j++;
			}
		return screen;
		
	}
	public static Show[] addShowsToScreen(List<Show> listOfShows, int showId, int n)
	{
		Show[] show = new Show[n];
		int k=0;
		for(int i=0;i<n;i++)
			if(listOfShows.get(i).getShowId()==showId)
			{
				show[k]=listOfShows.get(i);
				k++;
			}
		return show;
	}
	
}
