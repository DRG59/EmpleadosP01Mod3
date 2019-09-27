package cl.duoc;

import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMontoBono {

    @Test
    public void testMontoBono() {
        System.out.println("MontoBono");
        String rut = "19";
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Buscar(rut).montoBono() == 200000);
    }

}
