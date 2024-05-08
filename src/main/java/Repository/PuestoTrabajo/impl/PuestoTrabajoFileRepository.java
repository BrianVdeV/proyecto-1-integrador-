/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.PuestoTrabajo.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
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
public class PuestoTrabajoFileRepository implements PuestoTrabajoRepository {

    private static final String RUTA_ARCHIVO = "puestotrabajos.txt";
    public static final int TAMANIO_INICIAL = 10;
    private static PuestoTrabajo[] puestotrabajos = new PuestoTrabajo[TAMANIO_INICIAL];
    private static int size = 0;
    private static int secuenciaId = 1;  // Variable estática para generar idPuestoTrabajoes

    // Constructor
    public PuestoTrabajoFileRepository() {
        loadFromFile();
    }

    private void loadFromFile() {
        File file = new File(RUTA_ARCHIVO);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)) {
            while (scanner.hasNextLine()) {
                if (size >= puestotrabajos.length) {
                    puestotrabajos = Arrays.copyOf(puestotrabajos, puestotrabajos.length * 2);
                }

                String line = scanner.nextLine();
                String[] fields = line.split("\\|");
                PuestoTrabajo puestotrabajo = new PuestoTrabajo();
                puestotrabajo.setIdPuestoTrabajo(Integer.valueOf(fields[0]));
                puestotrabajos[size++] = puestotrabajo;
                if (secuenciaId <= puestotrabajo.getIdPuestoTrabajo()) {
                    secuenciaId = puestotrabajo.getIdPuestoTrabajo() + 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveToFile() { //try with resources //AutoCloseable
        try (PrintWriter out = new PrintWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (int i = 0; i < size; i++) {
                PuestoTrabajo puestotrabajo = puestotrabajos[i];
                out.println(puestotrabajo.getIdPuestoTrabajo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
        saveToFile();
    }

    @Override
    public PuestoTrabajo read(int idPuestoTrabajo) {
        for (int i = 0; i < size; i++) {
            if (puestotrabajos[i].getIdPuestoTrabajo().equals(idPuestoTrabajo)) {
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
            if (puestotrabajos[i].getIdPuestoTrabajo().equals(idPuestoTrabajo)) {
                updatedPuestoTrabajo.setIdPuestoTrabajo(idPuestoTrabajo);
                puestotrabajos[i] = updatedPuestoTrabajo;
                saveToFile();
                return true;
            }
        }
        return false;
    }

    // DELETE
    @Override
    public boolean delete(int idPuestoTrabajo) {
        for (int i = 0; i < size; i++) {
            if (puestotrabajos[i].getIdPuestoTrabajo().equals(idPuestoTrabajo)) {
                // Desplazar los elementos restantes
                System.arraycopy(puestotrabajos, i + 1, puestotrabajos, i, size - i - 1);
                size--;
                saveToFile();
                return true;
            }
        }
        return false;
    }
}
