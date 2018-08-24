
package abstracto;

public abstract class Juego_a 
{
protected String nombre;
protected int precio;
protected int descuento;

public Juego_a()
{
    
}


public void desc()
{
    System.out.println("El juego " + nombre + " de precio " + precio +" tiene un descuento de " + descuento +", por lo tanto tiene un precio total de " +(precio-descuento));
}




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    
}
