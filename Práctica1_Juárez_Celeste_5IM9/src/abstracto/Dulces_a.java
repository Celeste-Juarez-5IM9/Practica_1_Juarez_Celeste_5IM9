
package abstracto;

public class Dulces_a 
{
protected String dulce;
protected String origen;
protected int precio ;

public Dulces_a ()
{
    
}


public void depliegadul()
{
    System.out.println("El" + dulce + " tiene ingredientes de origen " + origen +" y tiene un precio unitario de " + precio);
}

    public String getDulce() {
        return dulce;
    }

    public void setDulce(String dulce) {
        this.dulce = dulce;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }




}
