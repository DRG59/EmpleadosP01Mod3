
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;


public class TestBuscar {

    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "19";
        BussEmpleado instance = new BussEmpleado();
        String rutEsperado = instance.Buscar(rut).getRut();
        Assert.assertEquals(rut, rutEsperado);

    }

}
