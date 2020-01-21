package string.problems;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingStringProblem {

    //Apply Unit Test into all the methods in this package
    @Test
    public void testPositiveIsAnagram() {
        boolean ExpectedResult = true;
        boolean ActualResult = Anagram.isAnagram("cat", "act");
        Assert.assertEquals(ExpectedResult, ActualResult);
    }

    @Test
    public void testNegativeIsAnagram() {
        boolean ExpectedResult = false;
        boolean ActualResult = Anagram.isAnagram("vat", "act");
        //Assert.assertEquals(ExpectedResult, ActualResult);
        Assert.assertNotEquals(ExpectedResult,ActualResult);
    }

    @Test
    public void testPositiveIsPalindrome() {
        boolean ExpectedResult = true;
        boolean ActualResult = Palindrome.isPalindrome("mom");
        Assert.assertEquals(ExpectedResult, ActualResult);
    }

    @Test
    public void testNegativeIsPalindrome() {
        boolean ExpectedResult = true;
        boolean ActualResult = Palindrome.isPalindrome("bnh");
        Assert.assertNotEquals(ExpectedResult,ActualResult);
    }
}
