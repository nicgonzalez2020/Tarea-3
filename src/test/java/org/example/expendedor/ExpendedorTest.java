package org.example.expendedor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {
    private Expendedor exp;
    @BeforeEach
    void setUp() {
        exp = new Expendedor(3,1000);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test Una Bebida")
    public void testComprarUnaBebida() throws Exception {
        Moneda m = new Moneda1000();
        assertNotNull(exp.comprarProducto(m,Expendedor.COCA));

    }
    @Test
    @DisplayName("Test Otra Bebida")
    public void testComprarUnaBebida2() throws Exception {
        Moneda m = new Moneda1000();
        assertNotNull(exp.comprarProducto(m,Expendedor.SPRITE));

    }

    @Test
    @DisplayName("Test Un Dulce")
    public void testComprarUnDulce() throws Exception {
        Moneda m = new Moneda1000();
        assertNotNull(exp.comprarProducto(m,Expendedor.SNKR));

    }
    @Test
    @DisplayName("Test Otro Dulce")
    public void testComprarUnDulce2() throws Exception {
        Moneda m = new Moneda1000();
        assertNotNull(exp.comprarProducto(m,Expendedor.SPR8));

    }
    @Test
    @DisplayName("Test Tres Bebida")
    public void testComprarTresBebida() throws Exception {
        Moneda m = new Moneda1000();
        assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
        assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
        assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
    }

    @Test
    @DisplayName("Test Dinero de Mas")
    public void testComprarConDineroDeMas() throws Exception {
        Moneda m = new Moneda1500();
        assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
        assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
        assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
    }

    @Test
    @DisplayName("Test NoHayProductoException")
    public void testComprarCuatroBebida(){
        Moneda m = new Moneda1000();
        Exception exception = assertThrows(NoHayProductoException.class,()->{
            assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
            assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
            assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
            assertNotNull(exp.comprarProducto(m,Expendedor.COCA));
            assertNotNull(exp.comprarProducto(m,Expendedor.SPRITE));
            assertNotNull(exp.comprarProducto(m,Expendedor.SPRITE));
            assertNotNull(exp.comprarProducto(m,Expendedor.SPRITE));
            assertNotNull(exp.comprarProducto(m,Expendedor.SPRITE));
            assertNotNull(exp.comprarProducto(m,Expendedor.SNKR));
            assertNotNull(exp.comprarProducto(m,Expendedor.SNKR));
            assertNotNull(exp.comprarProducto(m,Expendedor.SNKR));
            assertNotNull(exp.comprarProducto(m,Expendedor.SNKR));
            assertNotNull(exp.comprarProducto(m,Expendedor.SPR8));
            assertNotNull(exp.comprarProducto(m,Expendedor.SPR8));
            assertNotNull(exp.comprarProducto(m,Expendedor.SPR8));
            assertNotNull(exp.comprarProducto(m,Expendedor.SPR8));
            assertNotNull(exp.comprarProducto(m,565));
        });
    }
    @Test
    @DisplayName("Test PagoInsuficienteException")
    public void testComprarBebidaSinSuficienteMoneda(){
        Moneda m = new Moneda100();
        Exception exception = assertThrows(PagoInsuficienteException.class,
                ()->{
                    exp.comprarProducto(m,Expendedor.SPRITE);
                });
    }

    @Test
    @DisplayName("Test PagoInsuficienteException")
    public void testComprarBebidaSinSuficienteMoneda2(){
        Moneda m = new Moneda500();
        Exception exception = assertThrows(PagoInsuficienteException.class,
                ()->{
                    exp.comprarProducto(m,Expendedor.SPRITE);
                });
    }
    @Test
    @DisplayName("Test PagoIncorrectoException")
    public void testComprarBebidaSinMoneda(){
        Exception exception = assertThrows(PagoIncorrectoException.class,
                ()->{
                    exp.comprarProducto(null,Expendedor.SPRITE);
                });
    }
    @Test
    @DisplayName("Test Consumo de Producto")
    public void testConsumoDeProducto1() throws Exception {
        Moneda m = new Moneda1500();
        assertNotNull(exp.comprarProducto(m,Expendedor.COCA).consumir());
    }

    @Test
    @DisplayName("Test Consumo de Producto")
    public void testConsumoDeProducto2() throws Exception {
        Moneda m = new Moneda1500();
        assertNotNull(exp.comprarProducto(m,Expendedor.SPRITE).consumir());
    }

    @Test
    @DisplayName("Test Consumo de Producto")
    public void testConsumoDeProducto3() throws Exception {
        Moneda m = new Moneda1500();
        assertNotNull(exp.comprarProducto(m,Expendedor.SNKR).consumir());
    }

    @Test
    @DisplayName("Test Consumo de Producto")
    public void testConsumoDeProducto4() throws Exception {
        Moneda m = new Moneda1500();
        assertNotNull(exp.comprarProducto(m,Expendedor.SPR8).consumir());
    }

    @Test
    @DisplayName("Test Moneda1")
    public void testMoneda1() throws Exception {
        Moneda m = new Moneda1500();
        assertNotNull(m.getSerie());
    }

    @Test
    @DisplayName("Test Moneda2")
    public void testMoneda2() throws Exception {
        Moneda m = new Moneda1500();
        assertNotNull(m.getValor());
    }

    @Test
    @DisplayName("Test Vuelto")
    public void testVuelto() throws Exception {
        Moneda m = new Moneda1500();
        exp.comprarProducto(m,Expendedor.SPR8);
        assertNotNull(exp.getVuelto());
    }




}