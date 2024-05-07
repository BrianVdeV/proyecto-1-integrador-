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
public class TipoMascota implements Comparable<TipoMascota>{
    
    //identificador
    private Integer idTipoMascota;
    
    //atributo
    private String mascota;
    
    //getters and setters
    public Integer getTipoMascota() {
        return idTipoMascota;
    }

    public void setTipoMascota(Integer idTipoMascota) {
        this.idTipoMascota = idTipoMascota;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    //constructor
    public TipoMascota(Integer idTipoMascota, String mascota) {
        this.idTipoMascota = idTipoMascota;
        this.mascota = mascota;
    }

    //constructor vacio
    public TipoMascota() {
    }

    //toString
    @Override
    public String toString() {
        return "TipoMascota{" + "idTipoMascota=" + idTipoMascota + ", mascota=" + mascota + '}';
    }

    //hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.idTipoMascota);
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
        final TipoMascota other = (TipoMascota) obj;
        return Objects.equals(this.idTipoMascota, other.idTipoMascota);
    }

    //compareTo
    @Override
    public int compareTo(TipoMascota o) {
        return this.idTipoMascota.compareTo(o.idTipoMascota);
    }
    
    
    
    
    
}
