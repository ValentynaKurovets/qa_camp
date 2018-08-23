import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sub {

    private int sub(int x, int y) {
        return x - y;
    }

    @Test(groups = "successful_group")
    public void subSuccess() {
        int expectedResult = 4;
        Assert.assertEquals(sub(9, 5), expectedResult);
    }

    @Test(groups = "failure_group")
    public void subFail() {
        int expectedResult = 10;
        Assert.assertEquals(sub(9, 5), expectedResult);
    }

    @BeforeClass
    private void beforeClass() {
        System.out.println("Test Class "+getClass().getName()+" is loaded");
    }
    @AfterClass
    private void afterClass() {
        System.out.println("Test Class "+getClass().getName()+" is finished");
    }
}
