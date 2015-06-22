/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.List;
import persistence.Autor;
import persistence.Libro;

/**
 *
 * @author EST1629311
 */
public abstract class Despliegue  {
    public ConexionEspecifica ce;
    public List<Autor> Autores;
    public List<Libro> Libros;

    public ConexionEspecifica getCe() {
        return ce;
    }

    public void setCe(ConexionEspecifica ce) {
        this.ce = ce;
    }
    
}
