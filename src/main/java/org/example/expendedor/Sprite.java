package org.example.expendedor;

/**
 * Clase Sprite, un tipo de bebida
 *
 */
class Sprite extends Bebida {
    /**
     * Metodo constructor de Sprite
     * @param a : numero de serie de la Sprite
     */
    public Sprite(int a) {
        super(a);
    }

    /**
     * Metodo que retorna un string indicando que
     * fue consumido una Sprite
     * @return : un string que dice "sprite"
     */
    public String consumir() {

        return "sprite";

    }
}