
package CapaNegocio;

import java.util.ArrayList;


public class escuela {

    public escuela() {
        this.nombre = "";
        this.codigo = "";
        this.director = "";
        this.sede = "";
    }

    public escuela(String nombre, String codigo, String director, String sede) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.director = director;
        this.sede = sede;
    }
    
    
    public String nombre;
    public String codigo;
    public String director;
    public String sede;
    //relacion
    public facultad perteneceFacultad;
    public ArrayList<alumno> tieneAlumno = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
   //metodos
    public String AdmitirEstudiantes()
        {
           return "No se ha implementado el metodo"; 
        }
    
}
