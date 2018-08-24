
package constructores;

public class Ropa
{
        
private String prenda;
private String descuento;
    
    public Ropa(String prenda, String desc)
    {
        this.prenda = prenda;
        this.descuento = desc; 
    }


    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }
    
}
    

