package models;

import java.util.ArrayList;
import java.util.List;



public class Events {
    private String currentMessage;
    private List<String> scenarios;
    private String optOutMessage;
//    private Integer costMessage;
//    private List<Integer> costs;
//    private Integer costTotal;
    private String userInput;
//    private String people;
//    private String food;
//    private String booze;
//    private String entertainment;


    public class Party {
        public String people;
        public String food;
        public String booze;
        public String entertainment;


    }

//    public Events( String people,String food,booze,entertainment) {
//        mPeople = people;
//        mFood = food;
//        mBooze = booze;
//        mEntertainment = entertainment;
//    }


  public Events (String userInput) {
      scenarios = new ArrayList<>();
       this.currentMessage = "Great, lets start with the number of guests. Type 'more than 20' or 'less than 20' for number of people attending";
       optOutMessage = "You have opted out. Please visit again soon!";

       scenarios.add("We provide a variety of food. Would you like to have a full course mean at this event or just snacks? Type 'full course meal' or 'snacks'");
       scenarios.add("We also provide a wide array of beverages? We always provide non-alcoholic beverages but we also offer a full bar. Type 'non-alcoholic' or 'full bar'");
       scenarios.add("We have the option of entertainment as well. Type 'band' or 'no band'");
       scenarios.add("Thank you for your submission!We will contact you shortly");
  }

//  public Events (Integer userInput){
//        costs = new ArrayList<>();
//        this.costMessage = 300;
//
//        costs.add(600);
//        costs.add(700);
//        costs.add(900);
//  }



//    public String getPeople(){
//        return mPeople;
//    }
//
//    public String getFood(){
//        return currentMessage;
//    }
//
//    public String getBooze(){
//        return currentMessage;
//    }
//
//    public String getEntertainment(){
//        return currentMessage;
//    }

    public String getResponse(){
      return currentMessage;
    }

//    public Integer getCost(){
//        return costMessage;
//    }



    public String getOptOutMessage() {
      return optOutMessage;
  }

  public String getCurrentMessage () {
      return currentMessage;
  }

  public Integer getScenarioSize() {
      return scenarios.size();
  }

//  public Integer getCostMessage() {return costMessage;}

  public String scenarioOneMessage(){
      currentMessage = scenarios.get(0);
      return currentMessage;
  }

  public String scenarioTwoMessage(){
      currentMessage = scenarios.get(1);
      return currentMessage;
  }

  public String scenarioThreeMessage(){
      currentMessage = scenarios.get(2);
      return currentMessage;
  }

  public String scenarioFourMessage(){
      currentMessage = scenarios.get(3);
      return currentMessage;
  }

//  public Integer returnCostOfSmallParty() {
//      costMessage = this.costMessage;
//      return costMessage;

  }


