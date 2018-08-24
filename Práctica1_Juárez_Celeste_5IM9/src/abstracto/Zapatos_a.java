
package abstracto;

public class Zapatos_a 
{
protected String zapatos;
protected String material;


public Zapatos_a()
{
    
}


public void depliegazap()
{
    System.out.println("Los " + zapatos + " son de " + material );
}

    public String getZapatos() {
        return zapatos;
    }

    public void setZapatos(String zapatos) {
        this.zapatos = zapatos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }



}
