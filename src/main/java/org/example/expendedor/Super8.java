package org.example.expendedor;

/**
 * Clase Super8, un tipo de dulce
 *
 */
class Super8 extends Dulce{
    /**
     * Metodo constructor de Super8
     * @param a : numero de serie del Super8
     */
    public Super8(int a) {
        super(a);
    }

    /**
     * Metodo que retorna un string indicando que
     * fue consumido un Super8
     * @return : un string que dice "super8"
     */
    public String consumir() {

        return "super8";

    }
}