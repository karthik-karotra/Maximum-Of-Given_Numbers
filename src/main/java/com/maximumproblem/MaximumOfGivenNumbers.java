package com.maximumproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumOfGivenNumbers {

    public static Integer checkMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            return firstNumber;
        } else if (secondNumber.compareTo(thirdNumber) > 0) {
            return secondNumber;
        }
        return thirdNumber;
    }

    public static Float checkMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            return firstNumber;
        } else if (secondNumber.compareTo(thirdNumber) > 0) {
            return secondNumber;
        }
        return thirdNumber;
    }

    public static String checkMaximum(String firstString, String secondString, String thirdString) {
        if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) > 0) {
            return firstString;
        } else if (secondString.compareTo(thirdString) > 0) {
            return secondString;
        }
        return thirdString;
    }
}
