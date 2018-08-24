
package abstracto;

public abstract class Deportes_a 
{
protected String deporte;
protected String impacto;
protected String Tipo ;

public Deportes_a()
{
    
}


public void depliega()
{
    System.out.println(deporte + " es un deporte de " + impacto +" y es de tipo" + Tipo);
}

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getImpacto() {
        return impacto;
    }

    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
}
