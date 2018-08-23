import org.testng.Assert;
import org.testng.annotations.*;

public class Add {

    private int add(int x, int y) {
        return x + y;
    }

    @DataProvider(name = "CalcData")
    public static Object[][] calcData() {
        return new Object[][]{
                {10, 2},
                {10, 3},
                {2, -10}
        };
    }

    @Test(groups = "successful_group")
    @Parameters({"x", "y"})
    public void addSuccess(@Optional("2") int x, @Optional("3") int y) {
        int expectedResult = 5;
        Assert.assertEquals(add(x, y), expectedResult);
    }

    @Test(groups = "failure_group")
    @Parameters({"x", "y"})
    public void addFail(@Optional("2") int x, @Optional("3") int y) {
        int expectedResult = 12;
        Assert.assertEquals(add(x, y), expectedResult);
    }

    @Test(dataProvider = "CalcData")
    public void sum(int x, int y) {
        System.out.printf("Sum of %d + %d equals %d\n", x, y, x + y);
    }

    @BeforeClass
    private void beforeClass() {
        System.out.println("Test Class " + getClass().getName() + " is loaded");
    }

    @AfterClass
    private void afterClass() {
        System.out.println("Test Class " + getClass().getName() + " is finished");
    }
}
