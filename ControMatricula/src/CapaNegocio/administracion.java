
package CapaNegocio;

import java.util.ArrayList;


public class administracion {

    public administracion() {
        this.director = "";
        this.nroPersonal = 0;
        this.telefono = "";
    }

    public administracion(String director, int nroPersonal, String telefono) {
        this.director = director;
        this.nroPersonal = nroPersonal;
        this.telefono = telefono;
    }
    
    
    public String director;
    public int nroPersonal;
    public String telefono;
    //relaciones
    public ArrayList<matricula> realizaMatricula = new ArrayList();

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNroPersonal() {
        return nroPersonal;
    }

    public void setNroPersonal(int nroPersonal) {
        this.nroPersonal = nroPersonal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //metodos
    public String Asesorar()
        {
           return "No se ha implementado el metodo"; 
        }
    public String Contratar()
        {
           return "No se ha implementado el metodo"; 
        }
    public String Cobrar()
        {
           return "No se ha implementado el metodo"; 
        }
}
