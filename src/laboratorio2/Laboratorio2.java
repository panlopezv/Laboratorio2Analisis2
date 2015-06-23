/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import controladores.AutorJpaController;
import java.util.List;
import persistence.Autor;

/**
 *
 * @author EST1629311
 */
public class Laboratorio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Fabrica f = new Fabrica();
        Despliegue d = f.crearConexion("Autores");
        List<Autor> a = (List<Autor>) d.getLista(); 
        a.stream().forEach((a1) -> {
            System.out.println(a1.toString());
        });
        
        
        
        
    }   
    
}
