package org.example.expendedor;

/**
 * Clase expendedor,medio por el cual el comprador ingresa la moneda
 * obtiene su producto y recibe su vuelto
 */
class Expendedor {
    /**
     * Variables privadas de expendedor tipo depósito
     * para guardar los productos destinados de ser
     * comercializados
     */
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private Deposito sniker;
    private Deposito super8;

    /**
     * variable publica que guarda el precio de los productos
     */
    public int precioProductos;
    /**
     * varibles que guardan el codigo de compra de cada producto
     */
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int SNKR = 3;
    public static final int SPR8 = 4;
    public int numProductos;

    /**
     * Constructor de expendedor,
     * Inicializa los depositos de los productos y el deposito de vuelto
     * @param numProductoss: numero de productos creados
     * @param precioProductoss : precio de los productos
     */
    public Expendedor(int numProductoss, int precioProductoss) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();
        numProductos = numProductoss;
        sniker = new Deposito();
        super8 = new Deposito();

        precioProductos = precioProductoss;
        for (int i = 0; i < numProductos; i++) {
            CocaCola c = new CocaCola(i + 1000);
            coca.addProducto(c);
            Sprite s = new Sprite(i + 2000);
            sprite.addProducto(s);
            Snickers sk = new Snickers(i+3000);
            sniker.addProducto(sk);
            Super8 s8 = new Super8(i+4000);
            super8.addProducto(s8);
        }

    }

    /**
     * Metodo que retorna un número que refleja la cantidad de los productos
     * @return : la cantidad de productos
     */
    public int getNumeroBebidas(){
        return numProductos;
    }

    /**
     * Metodo utilizado en clase comprador para comprar un producto
     * @param m : la moneda utilizada para comprar el producto
     * @param cual: el codigo para seleccionar el tipo de producto
     * @return : el producto comprado, y el vuelto lo guarda en el deposito de vuelto
     * @throws PagoIncorrectoException: cuando la moneda no es valida
     * @throws PagoInsuficienteException: cuando la moneda no vale los suficiente
     * para comprar el producto
     * @throws NoHayProductoException:cuando el codigo de produto no es valido o
     * no quedan de ese tipo de productos
     */
    public Producto comprarProducto(Moneda m, int cual) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        Producto b;
        if (m == null) {
            throw new PagoIncorrectoException("Pago no valido, vuelto: 0");
        } else {

            if (m.getValor() >= precioProductos) {
                switch (cual) {
                    case 1:
                        b = coca.getProducto();
                        if (b == null) {
                            monVu.addMoneda(m);
                            throw new NoHayProductoException("No quedan CocaColas, vuelto: "+this.getVuelto().getValor());
                        } else {

                            for (int i = 0; i < (m.getValor() - precioProductos) / 100; i++) {
                                Moneda100 monv = new Moneda100();
                                monVu.addMoneda(monv);
                            }
                            return b;
                        }

                    case 2:
                        b = sprite.getProducto();
                        if (b == null) {
                            monVu.addMoneda(m);
                            throw new NoHayProductoException("No quedan Sprites, vuelto: "+this.getVuelto().getValor());
                        } else {

                            for (int i = 0; i < (m.getValor() - precioProductos) / 100; i++) {
                                Moneda100 monv = new Moneda100();
                                monVu.addMoneda(monv);
                            }
                            return b;

                        }
                    case 3:
                        b = sniker.getProducto();
                        if (b == null) {
                            monVu.addMoneda(m);
                            throw new NoHayProductoException("No quedan Snickers, vuelto: "+this.getVuelto().getValor());
                        } else {

                            for (int i = 0; i < (m.getValor() - precioProductos) / 100; i++) {
                                Moneda100 monv = new Moneda100();
                                monVu.addMoneda(monv);
                            }
                            return b;
                        }

                    case 4:
                        b = super8.getProducto();
                        if (b == null) {
                            monVu.addMoneda(m);
                            throw new NoHayProductoException("No quedan Super 8's, vuelto: "+this.getVuelto().getValor());
                        } else {

                            for (int i = 0; i < (m.getValor() - precioProductos) / 100; i++) {
                                Moneda100 monv = new Moneda100();
                                monVu.addMoneda(monv);
                            }
                            return b;

                        }

                    default:
                        monVu.addMoneda(m);
                        throw new NoHayProductoException("No existe ese producto, vuelto: "+this.getVuelto().getValor());
                }
            } else {
                monVu.addMoneda(m);
                if(cual!=1&&cual!=2&&cual!=3&&cual!=4){
                    throw new NoHayProductoException("No existe ese producto, vuelto: "+this.getVuelto().getValor());
                }else{
                throw new PagoInsuficienteException("Pago insuficiente, vuelto: "+this.getVuelto().getValor());}
            }
        }
    }

    /**
     * Metodo para obtener el vuelto de la compra
     * @return : retorna una moneda de 100 a la vez
     */
    public Moneda getVuelto() {
        return monVu.getMoneda();

    }




}