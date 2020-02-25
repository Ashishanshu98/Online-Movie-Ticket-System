package com.capg;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import com.capgemini.onlinemovieticket.beans.Movie;
import com.capgemini.onlinemovieticket.beans.Screen;
import com.capgemini.onlinemovieticket.beans.Show;
import com.capgemini.onlinemovieticket.beans.Theatre;
import com.capgemini.onlinemovieticket.dao.DataHandler;

public class ScreenTest {

	@Test
	public void test() {
		
		List<Theatre> listOfTheatres2 = new ArrayList<Theatre>();
		String thre="PVR Cinemas";
		
		System.out.println(thre);
		List<Show> listOfShows = new ArrayList<Show>();
		List<Movie> movies = new ArrayList<Movie>();
		listOfShows = DataHandler.getShows();
		
		List<Screen> listOfScreens = new ArrayList<Screen>();
		listOfScreens = DataHandler.getListOfScreens(listOfShows);
		listOfTheatres2 = DataHandler.getListOfTheatres(movies, listOfScreens);
		
		// new Screen(listOfTheatres2,thre,listOfShows);
		String s="Morning Show";
		
    Screen sc = new Screen();
    Show show[]=sc.getShows();
    System.out.println(show[0].getShowId());
    Show sh = (Show) sc.searchShow(s);
    System.out.println(sh.getShowId());
    assertEquals(4001, sh.getShowId());
	}
	
	
			
	

}
