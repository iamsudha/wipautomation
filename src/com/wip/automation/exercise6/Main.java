package com.wip.automation.exercise6;

import java.util.Date;
import java.util.Calendar;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // String[] mov = new String[5];
    // int totallength=0;


    Calendar cal1 = Calendar.getInstance();
    cal1.set(2002, Calendar.FEBRUARY, 10);
    Date moviedate1 = cal1.getTime();
    Calendar cal2 = Calendar.getInstance();
    cal2.set(2003, Calendar.FEBRUARY, 10);
    Date moviedate2 = cal2.getTime();
    Calendar cal3 = Calendar.getInstance();
    cal3.set(2004, Calendar.FEBRUARY, 10);
    Date moviedate3 = cal3.getTime();
    Calendar cal4 = Calendar.getInstance();
    cal4.set(2005, Calendar.FEBRUARY, 10);
    Date moviedate4 = cal4.getTime();
    Calendar cal5 = Calendar.getInstance();
    cal5.set(2017, Calendar.FEBRUARY, 10);
    Date moviedate5 = cal5.getTime();

    Movie[] mov = new Movie[5];
    mov[0] = new Movie("Finding Nemo", "Family", moviedate1, 80);
    mov[1] = new Movie("Jungle Book", "Comedy", moviedate2, 90);
    mov[2] = new Movie("Monster Calls", "Family", moviedate3, 95);
    mov[3] = new Movie("Lion King", "Family", moviedate4, 100);
    mov[4] = new Movie("Moana", "Family", moviedate5, 120);



    for (int i = 0; i < mov.length; i++) {
      mov[i].printMovieDetails();
    }
    
    int totallength = getTotalLength(mov);
    System.out.println("lenght of all movies =" + totallength);
    
    String title=getLatestMovie(mov);
    System.out.println("Latest Movie  =" + title);
    
    String title2=getOldestMovie(mov);
    System.out.println("Oldest Movie  =" + title2);
    
    String genre="Family";
    int genrecount=getCountMoviegenre(mov,genre);
    
    System.out.println("Number of " +  genre + "movies =" + genrecount);
    
  }//end Main

  private static int getTotalLength(Movie[] mov) {
    int totallength = 0;
    for (int i = 0; i < mov.length; i++) {
      totallength = totallength + mov[i].movieLength();
    }
    return totallength;
  }
  
  private static String getLatestMovie(Movie[] mov){
    Date maxreleasedate= new Date();
    String movietitle="";
    int maxtitleindex=1;
    maxreleasedate=mov[0].getreleaseDate();
    for (int i = 1; i < mov.length; i++) {
      if ( maxreleasedate.compareTo(mov[i].getreleaseDate()) < 0) {
        maxreleasedate = mov[i].getreleaseDate();
        maxtitleindex=i;
      }
     }
    return mov[maxtitleindex].getmovieTitle();
  }
  
  private static String getOldestMovie(Movie[] mov){
    Date minreleasedate= new Date();
    String movietitle="";
    int mintitleindex=0;
    minreleasedate=mov[0].getreleaseDate();
    for (int i = 0; i < mov.length; i++) {
      if ( minreleasedate.compareTo(mov[i].getreleaseDate()) > 0) {
        minreleasedate = mov[i].getreleaseDate();
        mintitleindex=i;
      }
     }
    return mov[mintitleindex].getmovieTitle();
  }
    
    
    private static int getCountMoviegenre(Movie[] mov, String genre){
      int count=0;
      for(int i =0; i < mov.length;i++){
        if (mov[i].getGenre() == genre){
          count++;
        }
      }
     return count;
   }
  
}//end class Main
  
  


