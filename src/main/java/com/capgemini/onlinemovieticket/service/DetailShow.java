package com.capgemini.onlinemovieticket.service;

import java.util.List;
import java.util.Scanner;

import com.capgemini.onlinemovieticket.beans.Movie;
import com.capgemini.onlinemovieticket.beans.Screen;
import com.capgemini.onlinemovieticket.beans.Show;
import com.capgemini.onlinemovieticket.beans.Theatre;
import com.capgemini.onlinemovieticket.dao.DataHandler;

public class DetailShow {
	
	static List<Movie> listOfMovies;
	static List<Screen> listOfScreens; 
	static List<Theatre> listOfTheatres;
	static List<Show> listOfShows;
	
	public DetailShow() {
		
		listOfMovies = DataHandler.getMovies();
		listOfShows = DataHandler.getShows();
		listOfScreens = DataHandler.getListOfScreens(listOfShows);
		listOfTheatres = DataHandler.getListOfTheatres(listOfMovies,listOfScreens);
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\tONLINE MOVIE TICKET SYSTEM");
		System.out.println("------------------------------------------------------------------------------------");
		int s1;
		do 
		{
			
			System.out.println("Enter the name of Theatre:\n1.PVR Cinemas\n2.Cinepolis Cinemas\n3.INOX Cinemas");
			String theatre = sc1.nextLine();
			
		    for(Theatre t: listOfTheatres)
			{	
		    	
				if(t.getTheaterName().equals(theatre))
				{	
					System.out.println();
					System.out.println("\t1).To Search Show:-\n"
							+ "Press:\n\t2).For show the List of Shows:- ");
					int ch = sc.nextInt();
					switch(ch)
					{
						case 1 :
							       System.out.println("Enter the name of show from the below list:-\n1.Morning Show\n2.Afternoon Show\n3.Evening Show\n4.Late Night Show"); 
							       String shows = sc1.nextLine();								
							       for(Screen screen:listOfScreens){	
							       Show s = screen.searchShow(shows);
							       if(s!=null)
							       {
								     System.out.println("Show ID           : "+s.getShowId());
								     System.out.println("Show Start Time   : "+s.getShowStartTime());
								     System.out.println("Show End Time     : "+s.getShowEndTime());
								     System.out.println("Seats             : "+s.getSeats());
								     System.out.println("Show Name         : "+s.getShowName());
								     System.out.println("Movie Name        : "+s.getMovieName());
								     System.out.println("Screen ID         : "+s.getScreenId());
								     System.out.println("Theatre ID        : "+s.getTheatreId());
								     break;
							       }
							      else
							       {
								     System.out.println("Show Not Available");
								     break;
							       }
							      }break;
					
							
						case 2 :
							        System.out.println("Here is the list of all shows:-");
									new Screen(listOfTheatres,theatre,listOfShows);
									break;
						        
						
						default : System.out.println("You entered wrong option.");
					            }
					break;
					
				}
			}
			System.out.println("\n\nPress 1 to perform more");
			s1 = sc2.nextInt();
		
		}while(s1==1);
		sc.close();
		sc1.close();
		sc2.close();
		
		
	}

}
