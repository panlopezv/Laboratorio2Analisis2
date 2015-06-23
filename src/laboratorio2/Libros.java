/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import controladores.LibroJpaController;
import java.util.List;
import persistence.Libro;



/**
 *
 * @author EST1522712
 */
public class Libros extends Despliegue {
    private LibroJpaController controlador;
    private List<Libro> libros;

    public Libros(LibroJpaController controlador) {
        this.controlador=controlador;
        libros=controlador.findLibroEntities();
    }

    public LibroJpaController getControlador() {
        return controlador;
    }

    public void setControlador(LibroJpaController controlador) {
        this.controlador = controlador;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
}
