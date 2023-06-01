/**
 * Clase excepcion que se lanza cuando el valor
 * de la moneda no es suficiente
 *
 */
class PagoInsuficienteException extends Exception {
    /**
     * Metodo constructor de la excepcion cuando el valor
     * de la moneda no es suficiente
     * @param errorMessage: mensaje se muestra al comprador cuando el valor
     * de la moneda no es suficiente
     */
    public PagoInsuficienteException(String errorMessage) {
        super(errorMessage);
    }
}