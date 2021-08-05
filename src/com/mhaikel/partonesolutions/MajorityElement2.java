package com.mhaikel.partonesolutions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] inputArray = {2,3,6,4,5,4,4,7,2,4,4,4,4};
        System.out.println("Majority Element::: " + majorityElement(inputArray));
    }
    static int majorityElement(int[] inputArray) {
        if (inputArray.length == 1) {
            return inputArray[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int currentNumber : inputArray){
            if (map.containsKey(currentNumber) && map.get(currentNumber) + 1 > inputArray.length/2){
                return currentNumber;
            }else if (map.containsKey(currentNumber)){
                map.put(currentNumber, map.get(currentNumber) + 1);
            }else {
                map.put(currentNumber, 1);
            }
        }

        //if no majority element
        return -1;

    }
}
