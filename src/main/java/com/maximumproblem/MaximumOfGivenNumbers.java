package com.maximumproblem;


import java.util.Arrays;
import java.util.Collections;

public class MaximumOfGivenNumbers<E extends Comparable> {
    E firstValueToCompare;
    E secondValueToCompare;
    E thirdValueToCompare;

    public MaximumOfGivenNumbers(E firstValueToCompare, E secondValueToCompare, E thirdValueToCompare) {
        this.firstValueToCompare = firstValueToCompare;
        this.secondValueToCompare = secondValueToCompare;
        this.thirdValueToCompare = thirdValueToCompare;
    }

    public <E extends Comparable> E checkMaximum() {
        return (E) checkMaximum(firstValueToCompare, secondValueToCompare, thirdValueToCompare);
    }

    public static <E extends Comparable> E checkMaximum(E firstValueToCompare, E secondValueToCompare, E thirdValueToCompare, E... extraParameters) {
        E maximumValue;
        E arrayMaximumValue = null;
        if (firstValueToCompare.compareTo(secondValueToCompare) > 0 && firstValueToCompare.compareTo(thirdValueToCompare) > 0) {
            maximumValue = firstValueToCompare;
        } else if (secondValueToCompare.compareTo(thirdValueToCompare) > 0) {
            maximumValue = secondValueToCompare;
        } else
            maximumValue = thirdValueToCompare;
        if (extraParameters.length != 0) {
            Arrays.sort(extraParameters, Collections.reverseOrder());
            if (maximumValue.compareTo(extraParameters[0]) < 0)
                maximumValue = extraParameters[0];
        }
        return maximumValue;

    }


}
