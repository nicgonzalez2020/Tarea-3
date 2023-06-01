package org.example.expendedor;

/**
 * Clase Comprador la cual se utiliza para realizar la compra del producto
 *
 */
class Comprador {
    /**
     * Propiedad que almacena el sonido que
     * denota el producto que consumio el
     * comprador
     */
    private String sonido;
    /**
     * Propiedad privada que guarda el valor del
     * vuelto del comprador
     */
    private int vuelto;

    /**
     * Metodo constructor de Comprador en el que
     * se realiza todo el proceso de compra,
     * consumo y obtencion del vuelto
     * @param m: moneda utilizada para comprar el producto
     * @param cualBebida: indica que tipo de producto se quiere comprar
     * @param exp : el expendedor al que se le realiza la compra
     * @throws NoHayProductoException : excepcion lanzada cuando el producto seleccionado no existe
     * o no le quedan unidades
     * @throws PagoInsuficienteException: excepcion lanzada cuando la moneda utilizada para comprar
     * no tiene suficiente valor para comprar el producto
     * @throws PagoIncorrectoException: excepcion lanzada cuando la moneda utilizada para comprar
     * el producto no es valida
     */
    public Comprador(Moneda m, int cualBebida, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        if (exp.getNumeroBebidas() > 0) {
            Producto b = exp.comprarProducto(m, cualBebida);
            if (b != null) {
                sonido = b.consumir();
                vuelto = 0;
                if (m.getValor() > exp.precioProductos) {
                    for(int i=0;i<((m.getValor())-(exp.precioProductos))/100;i++) {
                        vuelto = vuelto + exp.getVuelto().getValor();
                    }
                }
            } else {
                sonido = null;
                if (m == null) {
                    vuelto = 0;
                } else {
                    vuelto = exp.getVuelto().getValor();
                }
            }

        } else {
            sonido = null;
            vuelto = exp.getVuelto().getValor();
        }
    }

    /**
     * metodo que retorna el vuelto de la compra
     * @return
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * metodo que retorna el sonido que indica que producto se compro
     * @return
     */
    public String queConsumiste() {
        return sonido;
    }

}