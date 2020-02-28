package com.maximumproblem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumOfGivenNumbers {
    public static Integer checkMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        List arraylist=new ArrayList();
        arraylist.add(firstNumber);
        arraylist.add(secondNumber);
        arraylist.add(thirdNumber);
        Collections.sort(arraylist, Collections.reverseOrder());
        return (Integer)arraylist.get(0);
    }
}
