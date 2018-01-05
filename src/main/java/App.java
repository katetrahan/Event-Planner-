import models.Events;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        boolean party = true;

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
                    System.out.println(newEvents.scenarioOneMessage());
                } else if(userInput.equals("full course meal")||(userInput.equals("snacks"))) {
                    System.out.println(newEvents.scenarioTwoMessage());
                } else if(userInput.equals("non-alcoholic")|| (userInput.equals("full bar"))){
                    System.out.println(newEvents.scenarioThreeMessage());
                } else if (userInput.equals("band") || (userInput.equals("no band"))) {
                    System.out.println(newEvents.scenarioFourMessage());
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
