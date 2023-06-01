import java.util.ArrayList;
/**
 * Clase depositoM donde se guarda una lista de <Monedas>
 * desde la cual el comprador obtiene el vuelto
 */
class DepositoM {
    /**
     * Propiedad privada arraylist con Moneda como generico
     * aquí se guardan las monedas que se devuelven al
     * comprador como vuelto
     */
    private ArrayList<Moneda> arr;
    /**
     * Constructor de depósito, inicializa la variable
     * privada arraylist arr
     *
     */
    public DepositoM() {
        arr = new ArrayList();
    }

    /**
     *
     * Añade la moneda @param m a la lista de monedas arr
     */
    public void addMoneda(Moneda m) {
        arr.add(m);
    }

    /**
     * Metodo que retorna el tamaño de arr
     * @return : el tamaño de arr
     */
    public int tam(){
        return arr.size();
    }

    /**
     * Metodo que retorna la última moneda de arr
     * @return : el último elemento<moneda> almacenada en arr
     */
    public Moneda getMoneda(){
        if (arr.size() > 0) {
            return arr.remove(0);
        } else {
            return null;
        }
    }
}