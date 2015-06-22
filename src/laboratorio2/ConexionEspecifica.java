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
 * @author EST1629311
 */
public class ConexionEspecifica extends Conexion{
    private static ConexionEspecifica unicaConexion;
    private AutorJpaController controladorAutor;
    private LibroJpaController controladorLibro;
    
    private ConexionEspecifica(String persistenceUnitName) {
        iniciarConexion(persistenceUnitName);  
        controladorAutor=new AutorJpaController(getEmf());
        controladorLibro= new LibroJpaController(getEmf());
    }
    
    public static ConexionEspecifica getConexionEspecifica(String persistenceUnitName){
        if(unicaConexion == null){
            unicaConexion=new ConexionEspecifica(persistenceUnitName);
        }
        return unicaConexion;
    }
}
