import jdk.jfr.Name;
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
    @Test
    @Name("Проверка, что getClassNumber возвращает число больше 45")
    public void testGetClassNumber() {
        Assert.assertTrue("Method getClassNumber did not return number, that bigger than 45",getClassNumber() > 45);
    }
}
