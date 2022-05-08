import org.junit.Test;
import static org.junit.Assert.*;
public class MinAndMaxProblemTest {
    @Test
    public void CaseOne(){
        MinAndMaxProblem y = new MinAndMaxProblem();
        int[] x = {1,22,47,986,3400,6877};
        assertEquals(1,y.FindMin(x));
        assertEquals(6877, y.FindMax(x));
        }
    @Test
    public void CaseTwo(){
        MinAndMaxProblem y = new MinAndMaxProblem();
        int[] x = {3434,44,38,32,22,14,2};
        assertEquals(2,y.FindMin(x));
        assertEquals(3434, y.FindMax(x));
    }
    @Test
    public void CaseThree(){
        MinAndMaxProblem y = new MinAndMaxProblem();
        int[] x = {7,9};
        assertEquals(7,y.FindMin(x));
        assertEquals(9, y.FindMax(x));
    }
    @Test
    public void CaseFour(){
        MinAndMaxProblem y = new MinAndMaxProblem();
        int[] x = {5};
        assertEquals(5,y.FindMin(x));
        assertEquals(5, y.FindMax(x));
    }
    @Test
    public void CaseFive(){
        MinAndMaxProblem y = new MinAndMaxProblem();
        int[] x = {4984,64625,6575,332,445,6,7,8,9,954};
        assertEquals(6,y.FindMin(x));
        assertEquals(64625, y.FindMax(x));
    }

    }
