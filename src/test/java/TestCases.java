import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 0)
    public void setup() {
        System.out.println("I am inside setup!!");
    }

    @Test(priority = 1)
    public void testSteps() {
        System.out.println("I am inside testSteps!!");
    }

    @Test(priority = 2)
    public void tearDown() {
        System.out.println("I am inside tearDown!!");
    }
}
