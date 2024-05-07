/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.Objects;

/**
 *
 * @author JESSY
 */
public class PuestoTrabajo implements Comparable<PuestoTrabajo>{
    
    //identificador
    private Integer idPuestoTrabajo;
            
    //atributos
    private String nombrePuesto;
    private String descripción;
    
    //getters y setters
    public Integer getIdPuestoTrabajo() {
        return idPuestoTrabajo;
    }

    public void setIdPuestoTrabajo(Integer idPuestoTrabajo) {
        this.idPuestoTrabajo = idPuestoTrabajo;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
    //constructores
    public PuestoTrabajo(Integer idPuestoTrabajo, String nombrePuesto, String descripción) {
        this.idPuestoTrabajo = idPuestoTrabajo;
        this.nombrePuesto = nombrePuesto;
        this.descripción = descripción;
    }
    
    //constructor vacio
    public PuestoTrabajo() {
    }

    //toString
    @Override
    public String toString() {
        return "PuestoTrabajo{" + "idPuestoTrabajo=" + idPuestoTrabajo + ", nombrePuesto=" + nombrePuesto + ", descripci\u00f3n=" + descripción + '}';
    }

    //hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.idPuestoTrabajo);
        return hash;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PuestoTrabajo other = (PuestoTrabajo) obj;
        return Objects.equals(this.idPuestoTrabajo, other.idPuestoTrabajo);
    }

    //compareTo
    @Override
    public int compareTo(PuestoTrabajo o) {
        return this.idPuestoTrabajo.compareTo(o.idPuestoTrabajo);
    }
    
    
    
    
    
    
    
    
    
}
