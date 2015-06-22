/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author RealG4Life
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Libro.findNombreLike",query="Select l from Libro l where l.nombre LIKE :nombre")})
public class Libro implements Serializable {
    @Id
    private int id;
    
  
    @ManyToOne
    @JoinColumn(name="id")
    private Autor persona; 

    private String Nombre;
    private String ISBN;
    private String Editorial;
    private Date Fecha;
    private Date Fecha_Publicacion;

    public Libro() {
    }
    
    
    public Libro(int id, String Nombre, String ISBN, String Editorial, Date Fecha, Date Fecha_Publicacion) {
        this.id = id;
        this.Nombre = Nombre;
        this.ISBN = ISBN;
        this.Editorial = Editorial;
        this.Fecha = Fecha;
        this.Fecha_Publicacion = Fecha_Publicacion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getFecha_Publicacion() {
        return Fecha_Publicacion;
    }

    public void setFecha_Publicacion(Date Fecha_Publicacion) {
        this.Fecha_Publicacion = Fecha_Publicacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", Nombre=" + Nombre + ", ISBN=" + ISBN + ", Editorial=" + Editorial + ", Fecha=" + Fecha + ", Fecha_Publicacion=" + Fecha_Publicacion + '}';
    }


   
   
    
}
