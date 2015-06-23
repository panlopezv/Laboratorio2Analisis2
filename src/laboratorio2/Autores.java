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
 * @author EST1522712
 */
public class Autores extends Despliegue {
    private AutorJpaController controlador;
    private List<Autor> autores;

    public Autores(AutorJpaController controlador) {
        this.controlador=controlador;
        autores=controlador.findAutorEntities();
    }

    public AutorJpaController getControlador() {
        return controlador;
    }

    public void setControlador(AutorJpaController controlador) {
        this.controlador = controlador;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    
    
}
