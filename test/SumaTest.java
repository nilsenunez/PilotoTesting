
import abms.Suma;
import static org.junit.Assert.*;
import org.junit.Test;

public class SumaTest extends Suma{

    @Test public void SumaTest1(){
        int num1 = 3;
        int num2 = 2;
        int total = 5;
        int sum = 0;
        sum = Suma.add(num1, num2);
 
        assertEquals(sum, total);
}
    
    @Test public void SumaTest2(){
        int num1 = 2;
        int num2 = 2;
        int total = 5;
        int sum2 = 0;
        sum2 = Suma.add(num1, num2);
 
        assertEquals(sum2, total);
}    
    }

