/**
 * Clase excepcion que se lanza cuando no hay productos
 *
 */
class NoHayProductoException extends Exception {
    /**
     * Metodo constructor de la excepcion cuando no hay productos
     * @param errorMessage: mensaje se muestra al comprador cuando no hay productos
     */
    public NoHayProductoException(String errorMessage) {
        super(errorMessage);
    }
}
