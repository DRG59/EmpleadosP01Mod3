package cl.duoc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

    @RunWith(Suite.class)
    @Suite.SuiteClasses(
            {
                TestCrear.class, TestModificar.class,
                TestBuscar.class, TestMontoBono.class,
                TestEliminar.class
            }
    )

    public class TestTodos {}

