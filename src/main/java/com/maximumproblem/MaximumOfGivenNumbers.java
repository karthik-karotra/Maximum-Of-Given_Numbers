package com.maximumproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumOfGivenNumbers <E extends Comparable>{
    E firstValueToCompare;
    E secondValueToCompare;
    E thirdValueToCompare;

    public MaximumOfGivenNumbers(E firstValueToCompare, E secondValueToCompare, E thirdValueToCompare) {
        this.firstValueToCompare = firstValueToCompare;
        this.secondValueToCompare = secondValueToCompare;
        this.thirdValueToCompare = thirdValueToCompare;
    }

    public <E extends Comparable> E checkMaximum() {
        return (E) checkMaximum(firstValueToCompare,secondValueToCompare,thirdValueToCompare);
    }

    public static<E extends Comparable> E checkMaximum(E firstValueToCompare, E secondValueToCompare, E thirdValueToCompare) {
        if (firstValueToCompare.compareTo(secondValueToCompare) > 0 && firstValueToCompare.compareTo(thirdValueToCompare) > 0) {
            return firstValueToCompare;
        } else if (secondValueToCompare.compareTo(thirdValueToCompare) > 0) {
            return secondValueToCompare;
        }
        return thirdValueToCompare;
    }


}
