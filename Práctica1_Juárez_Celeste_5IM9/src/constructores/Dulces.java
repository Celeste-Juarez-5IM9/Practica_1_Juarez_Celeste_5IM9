
package constructores;


public class Dulces {
    
private String nombre;
private int existencia;
    
    public Dulces(String nombre, int existencia)
    {
        this.nombre = nombre;
        this.existencia = existencia;
       
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }



    
}
