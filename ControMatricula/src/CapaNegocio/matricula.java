
package CapaNegocio;

import java.util.Date;


public class matricula {

    public matricula() {
        this.fechaMat = null;
        this.semestre = "";
    }

    public matricula(Date fechaMat, String semestre) {
        this.fechaMat = fechaMat;
        this.semestre = semestre;
    }
    
    
    public Date fechaMat;
    public String semestre;
    //relacion
    public alumno InscribeAlumno;
    public administracion realizaMatricula;

    public Date getFechaMat() {
        return fechaMat;
    }

    public void setFechaMat(Date fechaMat) {
        this.fechaMat = fechaMat;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    //metodos
    public String Cobrar()
        {
           return "No se ha implementado el metodo"; 
        }
    
}
