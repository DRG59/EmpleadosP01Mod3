
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;


public class TestCrear {
    
        @Test
    public void testCrear(){
        System.out.println("Agregar");
        Empleado empleado = new Empleado("19", "Nueva", 44, 2);
        BussEmpleado instance=new BussEmpleado();
        boolean esperado=true;
        boolean obtenido=instance.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
        
    }

    
}
