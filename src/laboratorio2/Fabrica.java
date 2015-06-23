/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import controladores.AutorJpaController;
import controladores.LibroJpaController;

/**
 *
 * @author EST1522712
 */
public class Fabrica {

    private final ConexionEspecifica ce;
    
    public Fabrica() {
        ce=ConexionEspecifica.getConexionEspecifica("Laboratorio2PU");
    }
    
    public Despliegue crearConexion(String tipo){
        Despliegue nuevo=null;
        switch(tipo){
            case "Libros":
                nuevo = new Libros(new LibroJpaController(ce.getEmf()));
                break;
            case "Autores":
                nuevo = new Autores(new AutorJpaController(ce.getEmf()));
                break;
        }
        return nuevo;
    }
    
}
