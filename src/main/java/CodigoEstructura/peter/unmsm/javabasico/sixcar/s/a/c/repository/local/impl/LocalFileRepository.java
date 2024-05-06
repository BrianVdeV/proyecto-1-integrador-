/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peter.unmsm.javabasico.sixcar.s.a.c.repository.local.impl;

import peter.unmsm.javabasico.sixcar.s.a.c.repository.local.impl.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import peter.unmsm.javabasico.sixcar.s.a.c.domain.Local;
import peter.unmsm.javabasico.sixcar.s.a.c.repository.local.LocalRepository;

/**
 *
 * @author Timothy
 *
 * Implementa un CRUD (Create, Read, Update y Delete) basado en Arreglos para la
 * clase Local
 *
 *
 */
public class LocalFileRepository implements LocalRepository {

    private static final String RUTA_ARCHIVO = "locals.txt";
    public static final int TAMANIO_INICIAL = 10;
    private static Local[] locals = new Local[TAMANIO_INICIAL];
    private static int size = 0;
    private static int secuenciaId = 1;  // Variable estática para generar idLocales

    // Constructor
    public LocalFileRepository() {
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
                if (size >= locals.length) {
                    locals = Arrays.copyOf(locals, locals.length * 2);
                }

                String line = scanner.nextLine();
                String[] fields = line.split("\\|");
                Local local = new Local();
                local.setIdLocal(Integer.valueOf(fields[0]));
                local.setDireccion(fields[1]);
                local.setNumero(Integer.parseInt(fields[2]));
                local.setNombre(fields[3]);
                locals[size++] = local;
                if (secuenciaId <= local.getIdLocal()) {
                    secuenciaId = local.getIdLocal() + 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveToFile() { //try with resources //AutoCloseable
        try (PrintWriter out = new PrintWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (int i = 0; i < size; i++) {
                Local local = locals[i];
                out.println(local.getIdLocal() + "|"
                        + local.getDireccion()+ "|"
                        + local.getNumero()+ "|"
                        + local.getNombre());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    @Override
    public void create(Local local) {
        if (size == locals.length) {
            // Redimensionar el arreglo
            Local[] nuevoArreglo = new Local[size * 2];
            System.arraycopy(locals, 0, nuevoArreglo, 0, size);
            locals = nuevoArreglo;
        }

        local.setIdLocal(secuenciaId);  // Asignar el idLocal automático
        secuenciaId++;  // Incrementar el contador para el próximo artículo

        locals[size] = local;
        size++;
        saveToFile();
    }

    @Override
    public Local read(int idLocal) {
        for (int i = 0; i < size; i++) {
            if (locals[i].getIdLocal().equals(idLocal)) {
                return locals[i];
            }
        }
        return null;
    }

    @Override
    public Local[] readAll() {
        Local[] activeArticles = new Local[size];
        System.arraycopy(locals, 0, activeArticles, 0, size);
        return activeArticles;
    }

    @Override
    public Local[] readAllWithOrder(Comparator criterio) {
        Local[] activeArticles = readAll();
        Arrays.sort(activeArticles, criterio);
        return activeArticles;
    }

    // UPDATE
    @Override
    public boolean update(int idLocal, Local updatedLocal) {
        for (int i = 0; i < size; i++) {
            if (locals[i].getIdLocal().equals(idLocal)) {
                updatedLocal.setIdLocal(idLocal);
                locals[i] = updatedLocal;
                saveToFile();
                return true;
            }
        }
        return false;
    }

    // DELETE
    @Override
    public boolean delete(int idLocal) {
        for (int i = 0; i < size; i++) {
            if (locals[i].getIdLocal().equals(idLocal)) {
                // Desplazar los elementos restantes
                System.arraycopy(locals, i + 1, locals, i, size - i - 1);
                size--;
                saveToFile();
                return true;
            }
        }
        return false;
    }
}
