package math.problems;


import org.junit.Assert;
import org.junit.Test;

public class UnitTestingMath {

    //Apply Unit testing into each classes and methods in this package.
    @Test
    public void testPositiveIsPrimeNumber() {
        boolean expectedResult = true;
        boolean actualOutPut = PrimeNumber.isPrimeNumber(13);

        Assert.assertEquals(expectedResult, actualOutPut);

    }

    @Test
    public void testNegativePrimeNumber() {
        boolean expectedOutcome = false;
        boolean actualOutCome = PrimeNumber.isPrimeNumber(8);
        Assert.assertEquals(expectedOutcome, actualOutCome);

    }

    @Test
    public void testPositiveFindfLowestDifference() {
        int expectResult = 1;
        int actualResult = FindLowestDifference.findlowestdiffference(new int[]{1, 0, 4, 5, 8});
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void testNegativeFindLowestDifference() {
        int expectResult = 5;
        int actualResult = FindLowestDifference.findlowestdiffference(new int[]{1, 0, 4, 5, 8});
        Assert.assertNotEquals(expectResult,actualResult);


    }
    @Test
    public void testPositiveRecursionFactorial(){
        long expectedResult=120;
        long actualResulat=Factorial.recursionFactorial(5);
        Assert.assertEquals(expectedResult,actualResulat);

    }

    @Test
    public void testNegativeRecursionFactorial() {
        long expectedResult = 123;
        long actualResulat = Factorial.recursionFactorial(5);
        Assert.assertNotEquals(expectedResult,actualResulat);
    }

}
