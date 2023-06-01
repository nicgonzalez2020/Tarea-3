package org.example.expendedor;

/**
 * Clase Producto, la cual es utilizada para crear
 * distintos tipos de productos
 *
 */
public abstract class Producto {
    /**
     * Variable privada que guarda el número de
     * serie del producto creado
     */
    private int serie;

    /**
     * Metodo constructor de producto
     * @param a: número de serie que se le
     * asigna al producto creado.
     */
    public Producto(int a){
        serie= a;
    }

    /**
     * Metodo para obtener la serie del producto
     * @return : retorna la serie del producto
     */
    public int getSerie(){
        return serie;
    }

    /**
     * metodo que retorna un sonido, que indica que producto fue consumido
     * @return : un string que indica el nombre del producto consumido
     */
    public abstract String consumir();
}
