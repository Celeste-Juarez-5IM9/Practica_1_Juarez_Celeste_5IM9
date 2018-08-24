
package abstracto;

public abstract class Ropa_a 
{
protected String prenda;
protected String color;


public Ropa_a ()
{
    
}


public void depliegarop()
{
    System.out.println("El" + prenda + " es de color " + color );
}

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
