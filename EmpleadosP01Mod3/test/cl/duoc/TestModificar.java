/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ANDROID
 */
public class TestModificar {

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Empleado empleado = new Empleado();
        BussEmpleado instance=new BussEmpleado();
        boolean esperado = true;
        empleado = new Empleado("19", "Vieja", 44, 4);
        boolean obtenido = instance.Modificar(empleado);
        Assert.assertEquals(esperado, obtenido);

    }

}
