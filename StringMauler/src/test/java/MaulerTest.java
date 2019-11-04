
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaulerTest {
    Mauler mauler= new Mauler();
    String result;
    @Test
    public void testManipulation(){

       result=mauler.manipulation("input: N");
       assertEquals("",result);
       result=mauler.manipulation("input: A xy");
       assertEquals("xy",result);
       result=mauler.manipulation("input: A z");
       assertEquals("xyz",result);
       result=mauler.manipulation("input: P abc");
       assertEquals("abcxyz",result);
       result=mauler.manipulation("input: R");
       assertEquals("zyxcba",result);

    }

}