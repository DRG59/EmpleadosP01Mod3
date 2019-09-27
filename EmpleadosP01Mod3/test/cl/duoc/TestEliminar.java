
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;


public class TestEliminar {

    @Test
    public void testEliminar() {
        System.out.println("Elimnar");
        String codigo = "19";
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);

    }

}
