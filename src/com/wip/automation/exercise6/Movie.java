package com.wip.automation.exercise6;
import java.util.Date;

public class Movie {

  private String title;
  private String genre;
  private Date releasedate;
  private int movielength;

  public Movie(String tit, String gen, Date reldate, int movlen) {
    title = tit;
    genre = gen;
    releasedate = reldate;
    movielength = movlen;
  }

  public String getmovieTitle() {
    return title;
  }

  public String getGenre() {
    return genre;
  }

  public Date getreleaseDate() {
    return releasedate;
  }

  public int movieLength() {
    return movielength;
  }

  public void printMovieDetails() {
    System.out.println(title);
    System.out.println(genre);
    System.out.println(releasedate);
    System.out.println(movielength);
  }


}
