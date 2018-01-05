package models;

import java.util.ArrayList;
import java.util.List;


public class Events {
    private String currentMessage;
    private List<String> scenarios;
    private String userInput;

  public Events (String userInput) {
      scenarios = new ArrayList<>();
       this.currentMessage = "Great, lets start with the number of guests. Type 'more than 20' or 'less than 20' for number of people attending";
  }

  public String getCurrentMessage () {
      return currentMessage;
  }


}
