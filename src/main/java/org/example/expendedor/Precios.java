package org.example.expendedor;

enum Precios {
    COCACOLA(1000),
    SPRITE(1000),
    SNICKER(500),
    SUPER8(500);

    private int precio;

    Precios(int precioM) {
        this.precio = precioM;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString(){
        return "Producto " +this.name() +" y su precio es: "+ this.getPrecio();
    }
}