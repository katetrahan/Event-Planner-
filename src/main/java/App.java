//imports java components
import models.Events;
import models.Party;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//class
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


        System.out.println("Hello, we are so happy you have chosen Kate's Party Planning to help organize your party. Type 'begin' to start or 'opt out' to end program."); // initial prompt

        while (party) { //while party program is true
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {

                String userInput = bufferedReader.readLine();
                Events newEvents = new Events(userInput);

                Party small = new Party();//instance
                small.people = 100;
                small.food = 150;
                small.booze = 50;
                small.entertainment = 0;

                Party big = new Party();
                big.people = 200;
                big.food = 300;
                big.booze = 300;
                big.entertainment = 300;


                if (userInput.equals("begin")) {//userInput response
                    System.out.println(newEvents.getCurrentMessage());
                } else if (userInput.equals("opt out")) {
//                    System.out.println(newEvents.getOptOutMessage());
                    party = false;
                } else if (userInput.equals("less than 20")) {
                    System.out.println(small.people);
                    System.out.println(newEvents.scenarioOneMessage());
//                    System.out.println("Parties of less than 20 cost:$100. Parties of more than 20 cost: $200");
                } else if (userInput.equals("more than 20")) {
                    System.out.println(big.people);
                    System.out.println(newEvents.scenarioOneMessage());
                } else if (userInput.equals("full course meal")) {
                    System.out.println(big.food);
//                    System.out.println("Full Course Meal Cost: $300. Snacks Only Cost: $150");
                    System.out.println(newEvents.scenarioTwoMessage());
                } else if (userInput.equals("snacks")) {
                    System.out.println(small.food);
                    System.out.println(newEvents.scenarioTwoMessage());
                } else if (userInput.equals("non-alcoholic")) {
//                    System.out.println("Non-alcoholic beverages: $50. Alcoholic beverage: $300");
                    System.out.println(small.booze);
                    System.out.println(newEvents.scenarioThreeMessage());
                } else if (userInput.equals("full bar")) {
                    System.out.println(big.booze);
                    System.out.println(newEvents.scenarioThreeMessage());
                } else if (userInput.equals("band")) {
//                    System.out.println("Band cost: $300");
                    System.out.println(big.entertainment);
                    System.out.println("Thank you for your submission!");
//                    System.out.println(newEvents.returnCostOfSmallParty());
                } else if (userInput.equals("no band")) {
                    System.out.println(small.entertainment);
                } else if (userInput.equals("less than 20") && (userInput.equals("snacks") && (userInput.equals("non-alcoholic") && (userInput.equals("no band"))))) {
                    System.out.println(small);
                } else {
                    System.out.println("Input not recognized");
                }


//                    for (Party individualParty : allParty){
//                        System.out.println("-------------");
//                        System.out.println(individualParty.people);
//                        System.out.println(individualParty.food);
//                        System.out.println(individualParty.booze);
//                        System.out.println(individualParty.entertainment);
//
//
//              }


            } catch (IOException e) {
                e.printStackTrace();
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
}
