package com.maximumproblem;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumOfGivenNumbers {

    @Test
    public void givenIntegers_WhenMaximumAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertEquals((Integer)12, MaximumOfGivenNumbers.checkMaximum(12, 10, 3 ));
    }

    @Test
    public void givenIntegers_WhenMaximumAtSecondPosition_ShouldReturnSecondNumber() {
        Assert.assertEquals((Integer)12, MaximumOfGivenNumbers.checkMaximum(10, 12, 3 ));
    }

    @Test
    public void givenIntegers_WhenMaximumAtThirdPosition_ShouldReturnThirdNumber() {
        Assert.assertEquals((Integer)12, MaximumOfGivenNumbers.checkMaximum(3, 10, 12 ));
    }
}
