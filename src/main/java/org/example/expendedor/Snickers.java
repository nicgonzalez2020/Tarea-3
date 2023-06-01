package org.example.expendedor;

/**
 * Clase Snicker, un tipo de dulce
 *
 */
class Snickers extends Dulce{
    /**
     * Metodo constructor de Snicker
     * @param a : numero de serie del Snicker
     */
    public Snickers(int a) {
        super(a);
    }

    /**
     * Metodo que retorna un string indicando que
     * fue consumido un Snicker
     * @return : un string que dice "snicker"
     */
    public String consumir() {
        return "snicker";
    }


}