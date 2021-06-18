
package CapaNegocio;

import java.util.ArrayList;


public class asignatura {

    public asignatura() {
        this.nombre = "";
        this.creditos = 0;
        this.docente = "";
    }

    public asignatura(String nombre, int creditos, String docente) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
    }
    
    
    public String nombre;
    public int creditos;
    public String docente;
    //relacion
    public ArrayList<alumno> tieneAlumno = new ArrayList();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
    
//metodos
public String Enseñar()
        {
           return "No se ha implementado el metodo"; 
        }
    
}
