package org.example.expendedor;

/**
 * Clase CocaCola, un tipo de bebida
 *
 */
class CocaCola extends Bebida {
    /**
     * Metodo constructor de CocaCola
     * @param a : número de serie de la CocaCola
     */
    public CocaCola(int a) {
        super(a);
    }

    /**
     * Metodo que retorna un string indicando que
     * fue consumido una CocaCola
     * @return : un string que dice "cocacola"
     */
    public String consumir() {

        return "cocacola";

    }
}