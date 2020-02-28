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

    @Test
    public void givenFloatingIntegers_WhenMaximumAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertEquals((Float)12.1f, MaximumOfGivenNumbers.checkMaximum(12.1f, 10.3f, 3.2f ));
    }

    @Test
    public void givenFloatingIntegers_WhenMaximumAtSecondPosition_ShouldReturnSecondNumber() {
        Assert.assertEquals((Float)12.12f, MaximumOfGivenNumbers.checkMaximum(10.5f, 12.12f, 3.4f ));
    }

    @Test
    public void givenFloatingIntegers_WhenMaximumAtThirdPosition_ShouldReturnThirdNumber() {
        Assert.assertEquals((Float)12.5f, MaximumOfGivenNumbers.checkMaximum(3.4f, 10.1f, 12.5f ));
    }
}
