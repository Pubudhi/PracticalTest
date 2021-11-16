package com.arimac.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * container contains #n balls
 * identically divide the balls into the given 3 boxes
 * Pubudhi W
 */
public class Container {

    public static void main(String[] args) {

        //weight constraint
        int totalWeight = 5;

        //balls in tha main container
        String[] redBallsArray = {"r", "r", "r", "r", "r","r", "r", "r", "r", "r"};
        String[] yellowBallsArray = {"y", "y", "y", "y", "y", "y"};
        String[] blueBallsArray = {"b", "b", "b", "b", "b", "b", "b", "b"};

        ArrayList<String[]> container = new ArrayList<>();
        Map<String, Integer> countMaster = new HashMap<>();

        countMaster.put("r", 0);
        countMaster.put("y", 0);
        countMaster.put("b", 0);

        container.add(redBallsArray);
        container.add(yellowBallsArray);
        container.add(blueBallsArray);

        /*
        * checks the current array indexes pair with others and
        * if its true increases the map relevant kay's value
        * */
       for (int i = 0; i < totalWeight; i++){
          if(redBallsArray[i] != null && yellowBallsArray[i] != null && blueBallsArray[i] !=null){
              countMaster.put("r", countMaster.get(redBallsArray[i]) + 1);
              countMaster.put("y", countMaster.get(yellowBallsArray[i]) + 1);
              countMaster.put("b", countMaster.get(blueBallsArray[i]) + 1);
          }
       }
       //total counts
        System.out.println("Number of red balls in a box : " + countMaster.get("r"));
        System.out.println("Number of yellow balls in a box :" + countMaster.get("y"));
        System.out.println("Number of blue balls in a box : " + countMaster.get("b"));

    }
}
