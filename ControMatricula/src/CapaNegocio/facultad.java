
package CapaNegocio;

import java.util.ArrayList;


public class facultad {

    public facultad() {
        this.nombre = "";
        this.codigo = "";
        this.decano = "";
    }

    public facultad(String nombre, String codigo, String decano) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.decano = decano;
    }
    
    
    public String nombre;
    public String codigo;
    public String decano;
    //relacion
    public ArrayList<escuela> tieneEscuela = new ArrayList();

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

    public String getDecano() {
        return decano;
    }

    public void setDecano(String decano) {
        this.decano = decano;
    }
    
    //metodos
    public String OrganizarPlanEstudio()
        {
           return "No se ha implementado el metodo"; 
        }
}
