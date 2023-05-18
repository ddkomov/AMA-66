import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        if(getLocalNumber() == 14) {
        System.out.println("Method getLocalNumber returned 14");
        } else {
           Assert.fail("Method getLocalNumber did not return 14");
        }
    }
}
