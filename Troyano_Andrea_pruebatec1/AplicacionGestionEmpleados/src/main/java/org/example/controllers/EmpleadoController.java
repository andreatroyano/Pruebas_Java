package org.example.controllers;

import org.example.entities.Empleado;
import org.example.persistence.EmpleadoJPA;

import java.util.List;

public class EmpleadoController {

    EmpleadoJPA empleadoJPA = new EmpleadoJPA();

    public void create(Empleado nuevoEmpleado) {
        empleadoJPA.create(nuevoEmpleado);
    }

    public Empleado findOne(String cargoBuscado) {
        return empleadoJPA.findOne(cargoBuscado);
    }

    public List<Empleado> findAll() {
        return empleadoJPA.findAll();
    }

    public void update(Empleado actualizarEmpleado) {
        empleadoJPA.update(actualizarEmpleado);
    }

    public void delete(Integer idEliminar) {
        empleadoJPA.delete(idEliminar);
    }

    public List<Empleado> buscarPorCargo(String cargoBuscado) {
        empleadoJPA.buscarPorCargo(cargoBuscado);
        return List.of();
    }
}





