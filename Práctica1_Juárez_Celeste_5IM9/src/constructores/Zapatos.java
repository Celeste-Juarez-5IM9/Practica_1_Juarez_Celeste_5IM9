
package constructores;

public class Zapatos 
{
     
private String modelo;
private float costo;
    
    public Zapatos(String modelo, float costo)
    {
        this.modelo = modelo;
        this.costo = costo;
       
    }   

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
  
    
}
