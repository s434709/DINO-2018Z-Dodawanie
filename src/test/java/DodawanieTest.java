import org.junit.Test;
import org.junit.Assert.*;

public class DodawanieTest {

    @Test
    public void test1(){
        org.junit.Assert.assertEquals("0", DodawanieLib.dodaj("0","0"));
    }
    @Test
    public void test2(){
        org.junit.Assert.assertEquals("2", DodawanieLib.dodaj("1","1"));
    }
}
