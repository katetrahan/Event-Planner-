import models.Events;
//import models.Party;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        boolean party = true;

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String userInput = bufferedReader.readLine();
//
//            Party small = new Party();
//            small.people= 100;
//            small.food = 150;
//            small.booze = 50;
//            small.entertainment= 0;
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Events partyOne = new Events();
//        partyOne.getPeople("20");
//        partyOne.getFood("snacks");
//        partyOne.getBooze("no booze");
//        partyOne.getEntertainment("no band");


        System.out.println("Hello, we are so happy you have chosen Kate's Party Planning to help organize your party. Type 'begin' to start or 'opt out' to end program.");

        while (party) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            try {

                String userInput = bufferedReader.readLine();
                Events newEvents = new Events(userInput);

                if (userInput.equals("begin")) {
                    System.out.println(newEvents.getCurrentMessage());
                } else if (userInput.equals("opt out")) {
//                    System.out.println(newEvents.getOptOutMessage());
                    party = false;
                } else if(userInput.equals("less than 20")||(userInput.equals("more than 20"))){
                    System.out.println("Parties of less than 20 cost:$100. Parties of more than 20 cost: $200");
                    System.out.println(newEvents.scenarioOneMessage());
                } else if(userInput.equals("full course meal")||(userInput.equals("snacks"))) {
                    System.out.println("Full Course Meal Cost: $300. Snacks Only Cost: $150");
                    System.out.println(newEvents.scenarioTwoMessage());
                } else if(userInput.equals("non-alcoholic")|| (userInput.equals("full bar"))){
                    System.out.println("Non-alcoholic beverages: $50. Alcoholic beverage: $300");
                    System.out.println(newEvents.scenarioThreeMessage());
                } else if (userInput.equals("band") || (userInput.equals("no band"))) {
                    System.out.println("Band cost: $300");
                    System.out.println(newEvents.scenarioFourMessage());
                } else {
                    System.out.println("Input not recognized");
                }


            }catch (IOException e) {
            e.printStackTrace();
        }

        }
//        Events[] allEvents = {partyOne};
//        System.out.println("Your Event:");
//       for (Events individualEvent: allEvents){
//           System.out.println("------------");
//            System.out.println(individualEvent.getPeople);
//              System.out.println(individualEvent.getFood);
//       }
    }
}
