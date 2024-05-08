/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Empleado;

import java.util.Comparator;
import Domain.Empleado;

/**
 *
 *
 */
public interface EmpleadoRepository {

    void create(Empleado empleado);

    Empleado read(int IdEmpleado);

    Empleado[] readAll();

    Empleado[] readAllWithOrder(Comparator criterio);

    boolean update(int IdEmpleado, Empleado updatedAlarma);

    boolean delete(int IdEmpleado);

    default boolean delete2(int IdEmpleado) {
        return true;
    }

}
