package models;


public class Party {
    public int people;
    public int food;
    public int booze;
    public int entertainment;


    public int partyCost(int totalCost){
        return ( people+ food + booze + entertainment);
    }



}
