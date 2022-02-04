import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void subTest(){
        assertEquals(2, SkillDemo.subtract(5, 2)); //Fail
    }
}
