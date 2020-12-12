package TestNG;


import javafx.scene.layout.Priority;
import org.apache.hc.core5.reactor.Command;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGDemo {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before Suit");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before method");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("Before method");
    }


    @Test (priority = 2)
    public void test1(){
        String word1 = "java";
        String word2 = "java";
        System.out.println("Test1");
        Assert.assertEquals(word1, word2);
    }
    @Test (priority = 3)
    public void test2(){
        String word1 = "java";
        String word2 = "java";
        System.out.println("Test2");
        Assert.assertEquals(word1, word2);
    }
    //@Ignore ignore test
    @Test (priority = 1)
    public void test3(){
        System.out.println("Test3");
        Assert.assertTrue(15 > 10);
        //throw new SkipException("just skiped"); // skip this test
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Before method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("After Suit");
    }

}
