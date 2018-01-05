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

       scenarios.add("We provide a variety of food. Would you like to have a full course mean at this event or just snacks? Type 'full course meal' or 'snacks'");
       scenarios.add("We also provide a wide array of beverages? We always provide non-alcoholic beverages but we also offer a full bar. Type 'non-alcoholic' or 'full bar'");
       scenarios.add("We have the option of entertainment as well. Type 'band' or 'no band'");
       scenarios.add("Thank you for your submission! We will contact you shortly");
  }

  public String getCurrentMessage () {
      return currentMessage;
  }

  public int getScenarioSize() {
      return scenarios.size();
  }


}
