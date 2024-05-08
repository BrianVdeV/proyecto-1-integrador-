/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.PuestoTrabajo.impl;
import java.util.Arrays;
import java.util.Comparator;
import Domain.PuestoTrabajo;
import Repository.PuestoTrabajo.PuestoTrabajoRepository;
/**
 *
 * @author Timothy
 *
 * Implementa un CRUD (Create, Read, Update y Delete) basado en Arreglos para la
 * clase PuestoTrabajo
 *
 *
 */
public class PuestoTrabajoArrayRepository implements PuestoTrabajoRepository {

    
    public static final int TAMANIO_INICIAL = 10;
    private static PuestoTrabajo[] puestotrabajos = new PuestoTrabajo[TAMANIO_INICIAL];
    private static int size = 0;
    private static int secuenciaId = 1;  // Variable estática para generar idPuestoTrabajoes

    
    
    // CREATE
    @Override
    public void create(PuestoTrabajo puestotrabajo) {
        if (size == puestotrabajos.length) {
            // Redimensionar el arreglo
            PuestoTrabajo[] nuevoArreglo = new PuestoTrabajo[size * 2];
            System.arraycopy(puestotrabajos, 0, nuevoArreglo, 0, size);
            puestotrabajos = nuevoArreglo;
        }
        
        puestotrabajo.setIdPuestoTrabajo(secuenciaId);  // Asignar el idPuestoTrabajo automático
        secuenciaId++;  // Incrementar el contador para el próximo artículo
        
        puestotrabajos[size] = puestotrabajo;
        size++;
    }

    @Override
    public PuestoTrabajo read(int idPuestoTrabajo) {
        for (int i = 0; i < size; i++) {
            if (puestotrabajos[i].getIdPuestoTrabajo() == idPuestoTrabajo) {
                return puestotrabajos[i];
            }
        }
        return null;
    }

    @Override
    public PuestoTrabajo[] readAll() {
        PuestoTrabajo[] activeArticles = new PuestoTrabajo[size];
        System.arraycopy(puestotrabajos, 0, activeArticles, 0, size);
        return activeArticles;
    }
    
    @Override
    public PuestoTrabajo[] readAllWithOrder(Comparator criterio) {
        PuestoTrabajo[] activeArticles = readAll();
        Arrays.sort(activeArticles, criterio);
        return activeArticles;
    }
    

    // UPDATE
    @Override
    public boolean update(int idPuestoTrabajo, PuestoTrabajo updatedPuestoTrabajo) {
        for (int i = 0; i < size; i++) {
            if (puestotrabajos[i].getIdPuestoTrabajo() == idPuestoTrabajo) {
                updatedPuestoTrabajo.setIdPuestoTrabajo(idPuestoTrabajo);
                puestotrabajos[i] = updatedPuestoTrabajo;
                return true;
            }
        }
        return false;
    }

    // DELETE
    @Override
    public boolean delete(int idPuestoTrabajo) {
        for (int i = 0; i < size; i++) {
            if (puestotrabajos[i].getIdPuestoTrabajo() == idPuestoTrabajo) {
                // Desplazar los elementos restantes
                System.arraycopy(puestotrabajos, i + 1, puestotrabajos, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }
}
  