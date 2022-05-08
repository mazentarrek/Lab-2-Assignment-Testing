import org.junit.Test;
import static org.junit.Assert.*;
public class OddEvenCheckerTest {

    @Test
    public void EvenOne(){
        OddEvenChecker x = new OddEvenChecker();
        int n = 2;
        assertEquals("Even number",x.checking(n));
    }
    @Test
    public void EvenTwo(){
        OddEvenChecker x = new OddEvenChecker();
        int n = 4004;
        assertEquals("Even number",x.checking(n));
    }
    @Test
    public void EvenThree(){
        OddEvenChecker x = new OddEvenChecker();
        int n = 0;
        assertEquals("Even number",x.checking(n));
    }
    @Test
    public void OddOne(){
        OddEvenChecker x = new OddEvenChecker();
        int n = 13;
        assertEquals("Odd number",x.checking(n));
    }
    @Test
    public void OddTwo(){
        OddEvenChecker x = new OddEvenChecker();
        int n = 791;
        assertEquals("Odd number",x.checking(n));
    }
    @Test(expected = IllegalArgumentException.class)
    public void negative(){
        OddEvenChecker x = new OddEvenChecker();
        int n = -3;
        x.checking(n);
    }


}
