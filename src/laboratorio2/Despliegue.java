/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author EST1629311
 */
public abstract class Despliegue {
    protected ConexionEspecifica ce;

    public ConexionEspecifica getCe() {
        return ce;
    }

    public void setCe(ConexionEspecifica ce) {
        this.ce = ce;
    }
    
}