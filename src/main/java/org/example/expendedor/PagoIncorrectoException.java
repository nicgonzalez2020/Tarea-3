package org.example.expendedor;

/**
 * Clase excepcion que se lanza cuando la moneda no es válida
 *
 */
class PagoIncorrectoException extends Exception {
    /**
     * Metodo constructor de la excepcion cuando la moneda no es válida
     * @param errorMessage: mensaje se muestra al comprador cuando la moneda no es válida
     */
    public PagoIncorrectoException(String errorMessage) {
        super(errorMessage);
    }
}