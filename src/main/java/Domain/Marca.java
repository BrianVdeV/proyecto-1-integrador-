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
public class Marca implements Comparable<Marca>{
    
    //identificador
    private Integer idMarca;
            
    //atributos
    private String marca;

    //getters y setters de atributos
    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //constructor
    public Marca(Integer idMarca, String marca) {
        this.idMarca = idMarca;
        this.marca = marca;
    }
    
    //constructor vacio
    public Marca() {
    }
    
    //toString
    @Override
    public String toString() {
        return "Marca{" + "idMarca=" + idMarca + ", marca=" + marca + '}';
    }
    
    //hashCode
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idMarca);
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
        final Marca other = (Marca) obj;
        return Objects.equals(this.idMarca, other.idMarca);
    }
    
    //compareTo

    @Override
    public int compareTo(Marca o) {
        return this.idMarca.compareTo(o.idMarca);
    }
    
    
}
