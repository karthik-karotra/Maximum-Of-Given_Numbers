package com.maximumproblem;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumOfGivenNumbers {

    //Test Methods for finding maximum value in 3 integers
    @Test
    public void givenIntegers_WhenMaximumAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertSame(12, MaximumOfGivenNumbers.checkMaximum(12, 10, 3 ));
    }

    @Test
    public void givenIntegers_WhenMaximumAtSecondPosition_ShouldReturnSecondNumber() {
        Assert.assertSame(12, MaximumOfGivenNumbers.checkMaximum(10, 12, 3 ));
    }

    @Test
    public void givenIntegers_WhenMaximumAtThirdPosition_ShouldReturnThirdNumber() {
        Assert.assertSame(12, MaximumOfGivenNumbers.checkMaximum(3, 10, 12 ));
    }

    //Test Methods for finding maximum value in 3 floating value
    @Test
    public void givenFloatingIntegers_WhenMaximumAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertEquals(12.1f, MaximumOfGivenNumbers.checkMaximum(12.1f, 10.3f, 3.2f ),0.0f);
    }

    @Test
    public void givenFloatingIntegers_WhenMaximumAtSecondPosition_ShouldReturnSecondNumber() {
        Assert.assertEquals(12.12f, MaximumOfGivenNumbers.checkMaximum(10.5f, 12.12f, 3.4f ),0.0f);
    }

    @Test
    public void givenFloatingIntegers_WhenMaximumAtThirdPosition_ShouldReturnThirdNumber() {
        Assert.assertEquals(12.5f, MaximumOfGivenNumbers.checkMaximum(3.4f, 10.1f, 12.5f ),0.0f);
    }

    //Test Methods for finding maximum value in 3 strings
    @Test
    public void givenStrings_WhenMaximumAtFirstPosition_ShouldReturnSameString() {
        Assert.assertEquals("Peach", MaximumOfGivenNumbers.checkMaximum("Peach","Apple","Banana"));
    }

    @Test
    public void givenStrings_WhenMaximumAtSecondPosition_ShouldReturnSecondString() {
        Assert.assertEquals("Peach", MaximumOfGivenNumbers.checkMaximum("Apple","Peach","Banana" ));
    }

    @Test
    public void givenStrings_WhenMaximumAtThirdPosition_ShouldReturnThirdString() {
        Assert.assertEquals("Peach", MaximumOfGivenNumbers.checkMaximum("Apple", "Banana", "Peach"));
    }

    //Test Method for finding maximum value in integer values passed in constructor
    @Test
    public void givenIntegersInConstructor_ShouldReturnMaximumValue() {
        Assert.assertSame(12, new MaximumOfGivenNumbers<>(12,10,9).checkMaximum());
    }

    //Test Method for finding maximum value in float values passed in constructor
    @Test
    public void givenFloatingNumbersInConstructor_ShouldReturnMaximumValue() {
        Assert.assertEquals(12.1f, new MaximumOfGivenNumbers<>(12.1f, 10.3f, 3.2f).checkMaximum(),0.0f);
    }

    //Test Method for finding maximum value in string values passed in constructor
    @Test
    public void givenStringsInConstructor_ShouldReturnMaximumValue() {
        Assert.assertEquals("Peach", new MaximumOfGivenNumbers("Peach","Apple","Banana").checkMaximum());
    }



    //Test Method for finding maximum value in multiple integers
    @Test
    public void givenMultipleIntegers_ShouldReturnMaximumValue() {
        Assert.assertSame(12, MaximumOfGivenNumbers.checkMaximum(12, 10, 3,4,9,7 ));
    }

    //Test Method for finding maximum value in multiple float values
    @Test
    public void givenMultipleFloatingNumbers_ShouldReturnMaximumValue() {
        Assert.assertEquals(12.1f, MaximumOfGivenNumbers.checkMaximum(12.1f, 10.3f, 3.2f,1.1f,2.5f,4.8f),0.0f);
    }

    //Test Method for finding maximum value in multiple strings
    @Test
    public void givenMultipleStrings_ShouldReturnMaximumValue() {
        Assert.assertEquals("Strawberry", MaximumOfGivenNumbers.checkMaximum("Peach","Apple","Banana","Mango","Pineapple","Strawberry"));
    }
}
