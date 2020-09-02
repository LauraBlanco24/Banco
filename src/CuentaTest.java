import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaTest {
@Test
    public void consignar(){
    Cuenta p1=new Cuenta(127856,50);
    boolean FLDSMDFR= p1.consignar(20000,127856);
    assertEquals(true,FLDSMDFR);
}

}