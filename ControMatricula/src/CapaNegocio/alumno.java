
package CapaNegocio;

import java.util.ArrayList;
import java.util.Date;


public class alumno {

    public alumno() {
        this.nombres = "";
        this.apellidos = "";
        this.codigo = "";
        this.fechaNac = null;
    }

    public alumno(String nombres, String apellidos, String codigo, Date fechaNac) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.fechaNac = fechaNac;
    }
    
    
    public String nombres;
    public String apellidos;
    public String codigo;
    public Date fechaNac;
    //relaciones
    public escuela perteneceEscuela;
    public matricula inscribeMatricula;
    public ArrayList<asignatura> tieneAsignaturas = new ArrayList();

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    //metodos
    public String Aprender()
        {
           return "No se ha implementado el metodo"; 
        }
    public String Pagar()
        {
           return "No se ha implementado el metodo"; 
        }
    public String Aprobar()
        {
           return "No se ha implementado el metodo"; 
        }
}
