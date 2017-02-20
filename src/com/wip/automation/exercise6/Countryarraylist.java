package com.wip.automation.exercise6;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

public class Countryarraylist {

  public static void main(String[] args) {
    // Create an arraylist of countries and access through the list with the methods
    
    ArrayList<String> countries = new ArrayList<String>();
    countries.add("America");
    countries.add("Germany");
    countries.add("Spain");
    countries.add("France");
    countries.add("Brazil");
    countries.add("India");

    for (int i = 0; i < countries.size(); i++) {
      Collections.sort(countries);

    }
  System.out.println(countries);
  }
}
