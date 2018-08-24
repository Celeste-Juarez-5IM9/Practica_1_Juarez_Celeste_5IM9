
package constructores;

public class Deportes 
{
   private String nombre;
    private String impacto;
    
    public Deportes(String nombre, String impacto)
    {
        this.nombre = nombre;
        this.impacto = impacto;
       
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImpacto() {
        return impacto;
    }

    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }


    
}

