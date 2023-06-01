package org.example.expendedor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {
    private Expendedor exp;

    @BeforeEach
    void setUp() {
        exp = new Expendedor(3,1000);
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("Test Comprador")
    public void testComprador() throws Exception {
        Moneda m = new Moneda1500();
        Comprador c;
        assertNotNull(c= new Comprador(m,Expendedor.COCA,exp));

    }
    @Test
    @DisplayName("Test vuelto")
    public void testComprador2() throws Exception {
        Moneda m = new Moneda1500();
        Comprador c;
        c= new Comprador(m,Expendedor.COCA,exp);
        assertNotNull(c.cuantoVuelto());

    }
    @Test
    @DisplayName("Test Consumo")
    public void testComprador3() throws Exception {
        Moneda m = new Moneda1500();
        Comprador c;
        c= new Comprador(m,Expendedor.COCA,exp);
        assertNotNull(c.queConsumiste());
    }
}