package org.example;

import org.example.controllers.EmpleadoController;
import org.example.entities.Empleado;


public class Main {
    public static void main(String[] args) {

        EmpleadoController empleadoCrontroller = new EmpleadoController();

        Empleado nuevoEmpleado = new Empleado(7, "Francisco", "Ortiz", "Formador", 1498.97,2012);
        empleadoCrontroller.create(nuevoEmpleado);
        System.out.println(nuevoEmpleado);


    }
}