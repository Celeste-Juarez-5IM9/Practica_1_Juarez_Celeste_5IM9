
package Main;

import abstracto.*;
import constructores.*;

public class main {

    public static void main(String[] args) 
    {
       Deportes dep = new Deportes("Correr","Alto");
       Dulces du = new Dulces("Mazapan",5);
       Juegos j = new Juegos("The witcher 3: wild hunt", 1500);
       Ropa r = new Ropa("Camisa", "-40%");
       Zapatos z = new Zapatos("Power Pack Mid Skool 37", 800);
        
       
        System.out.println("---------------Constructor 1---------------");
        System.out.println("Deporte: " +dep.getNombre()+", Impacto: " + dep.getImpacto() + "\n");
        System.out.println("---------------Constructor 2---------------");
        System.out.println("Dulce: " +du.getNombre()+", Existencia: " + du.getExistencia()+"\n");
        System.out.println("---------------Constructor 3---------------");
        System.out.println("Juego: " +j.getNombre()+", Costo: " + j.getCosto()+"\n");
        System.out.println("---------------Constructor 4---------------");
        System.out.println("Prenda: " +r.getPrenda()+", Descuento: " + r.getDescuento()+"\n");
        System.out.println("---------------Constructor 5---------------");
        System.out.println("Modelo: " +z.getModelo()+", Costo: " + z.getCosto()+"\n");
      
        System.out.println("\n"+ "CLASE ABSTRACTA"+"\n");
        
        Juego_aa ja = new Juego_aa();
        Deportes_aa da = new Deportes_aa();
        Dulces_aa dua = new Dulces_aa(); 
        Ropa_aa roa = new Ropa_aa(); 
        Zapatos_aa zapa = new Zapatos_aa();
        
         System.out.println("\n"+"---------------1---------------");
         ja.desc();
         System.out.println("\n"+"---------------2---------------");
         da.depliega();
         System.out.println("\n"+"---------------3---------------");
         dua.depliegadul();
         System.out.println("\n"+"---------------4---------------");
         roa.depliegarop();
         System.out.println("\n"+"---------------5---------------");
         zapa.depliegazap();
         
    }
    
}
