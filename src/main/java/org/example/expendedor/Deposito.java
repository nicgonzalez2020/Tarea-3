package org.example.expendedor;

import java.util.ArrayList;

/**
 * Clase depositó donde se guarda una lista de <Productos>
 * desde la cual el expendedor obtiene los productos a vender
 */
class Deposito{
    /**
     * Propiedad privada arraylist con Producto como generico
     * aquí se guardan los productos que se crean en el constructor
     * de expendedor
     */
    private ArrayList<Producto> var;

    /**
     * Constructor de depósito, inicializa la variable
     * privada arraylist var
     */
    public Deposito(){
        var = new ArrayList();
    }

    /**
     * Metodo que añade un producto al depósito
     * @param a : el producto añadido al depósito
     *
     */
    public void addProducto(Producto a){
        var.add(a) ;
    }

    /**
     * Metodo que retorna el último producto del arraylist var
     * @return : el último elemento<producto> del arraylist var
     */
    public Producto getProducto(){
        if(var.size()>0){
            Producto b =  var.remove(0);
            return b;
        } else{
            Producto b = null;
            return null ;
        }

    }
}