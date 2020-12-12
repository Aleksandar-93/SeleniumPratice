package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssortionTest {

    @Test
    public void test(){
        Assert.assertEquals("apple", "apple" );

        String[] fruits = {"apple", "orange"};
        String[] fruits2 = {"pear", "orange"};

//        Assert.assertEquals(fruits, fruits2);

        Assert.assertTrue(5 > 3);
        Assert.assertFalse(40 - 4 < 40);

    }
    @Test
    public void softAssertiontes(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("apple", "apple" );

        String[] fruits = {"apple", "orange"};
        String[] fruits2 = {"pear", "orange"};

        softAssert.assertEquals(fruits, fruits2);

        softAssert.assertNotEquals("apple", "apple" );

        softAssert.assertAll("End of test Execution!");

    }
}
