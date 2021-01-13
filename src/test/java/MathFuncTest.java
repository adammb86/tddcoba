import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathFuncTest {
    @Test
    public void testTambah(){
        MathFunc mathFunc=new MathFunc();
        Assertions.assertEquals(30,mathFunc.tambah());
    }
}
