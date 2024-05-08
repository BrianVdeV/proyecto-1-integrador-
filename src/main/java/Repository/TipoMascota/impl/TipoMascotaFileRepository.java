/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.TipoMascota.impl;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import Domain.TipoMascota;
import Repository.TipoMascota.TipoMascotaRepository;
/**
 *
 * 
 *
 * Implementa un CRUD (Create, Read, Update y Delete) basado en Arreglos para la
 * clase TipoMascota
 *
 *
 */
public class TipoMascotaFileRepository implements TipoMascotaRepository {

    private static final String RUTA_ARCHIVO = "tipomascotas.txt";
    public static final int TAMANIO_INICIAL = 10;
    private static TipoMascota[] tipomascotas = new TipoMascota[TAMANIO_INICIAL];
    private static int size = 0;
    private static int secuenciaId = 1;  // Variable estática para generar idTipoMascotaes

    // Constructor
    public TipoMascotaFileRepository() {
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
                if (size >= tipomascotas.length) {
                    tipomascotas = Arrays.copyOf(tipomascotas, tipomascotas.length * 2);
                }

                String line = scanner.nextLine();
                String[] fields = line.split("\\|");
                TipoMascota tipomascota = new TipoMascota();
                tipomascota.setIdTipoMascota(Integer.valueOf(fields[0]));
                tipomascotas[size++] = tipomascota;
                if (secuenciaId <= tipomascota.getIdTipoMascota()) {
                    secuenciaId = tipomascota.getIdTipoMascota() + 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveToFile() { //try with resources //AutoCloseable
        try (PrintWriter out = new PrintWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (int i = 0; i < size; i++) {
                TipoMascota tipomascota = tipomascotas[i];
                out.println(tipomascota.getIdTipoMascota());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    @Override
    public void create(TipoMascota tipomascota) {
        if (size == tipomascotas.length) {
            // Redimensionar el arreglo
            TipoMascota[] nuevoArreglo = new TipoMascota[size * 2];
            System.arraycopy(tipomascotas, 0, nuevoArreglo, 0, size);
            tipomascotas = nuevoArreglo;
        }

        tipomascota.setIdTipoMascota(secuenciaId);  // Asignar el idTipoMascota automático
        secuenciaId++;  // Incrementar el contador para el próximo artículo

        tipomascotas[size] = tipomascota;
        size++;
        saveToFile();
    }

    @Override
    public TipoMascota read(int idTipoMascota) {
        for (int i = 0; i < size; i++) {
            if (tipomascotas[i].getIdTipoMascota().equals(idTipoMascota)) {
                return tipomascotas[i];
            }
        }
        return null;
    }

    @Override
    public TipoMascota[] readAll() {
        TipoMascota[] activeArticles = new TipoMascota[size];
        System.arraycopy(tipomascotas, 0, activeArticles, 0, size);
        return activeArticles;
    }

    @Override
    public TipoMascota[] readAllWithOrder(Comparator criterio) {
        TipoMascota[] activeArticles = readAll();
        Arrays.sort(activeArticles, criterio);
        return activeArticles;
    }

    // UPDATE
    @Override
    public boolean update(int idTipoMascota, TipoMascota updatedTipoMascota) {
        for (int i = 0; i < size; i++) {
            if (tipomascotas[i].getIdTipoMascota().equals(idTipoMascota)) {
                updatedTipoMascota.setIdTipoMascota(idTipoMascota);
                tipomascotas[i] = updatedTipoMascota;
                saveToFile();
                return true;
            }
        }
        return false;
    }

    // DELETE
    @Override
    public boolean delete(int idTipoMascota) {
        for (int i = 0; i < size; i++) {
            if (tipomascotas[i].getIdTipoMascota().equals(idTipoMascota)) {
                // Desplazar los elementos restantes
                System.arraycopy(tipomascotas, i + 1, tipomascotas, i, size - i - 1);
                size--;
                saveToFile();
                return true;
            }
        }
        return false;
    }
}
