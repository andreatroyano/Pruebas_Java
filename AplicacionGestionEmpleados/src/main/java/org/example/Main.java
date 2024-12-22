package org.example;

import org.example.controllers.EmpleadoController;
import org.example.entities.Empleado;

import java.time.LocalDateTime;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        EmpleadoController empleadoCrontroller = new EmpleadoController();

        //Empleado nuevoEmpleado = new Empleado(null, "Lucas", "Mercero", "Administrativo",1300.65, LocalDateTime.of(2020,6,1,0,0,0));
        //empleadoCrontroller.create(nuevoEmpleado);
        //System.out.println(nuevoEmpleado);


        //Empleado empleado = empleadoCrontroller.findOne("adjunta");
        //System.out.println(empleado);


//        List<Empleado> todosLosEmpleados = empleadoCrontroller.findAll();
//        for (Empleado empleado : todosLosEmpleados ){
//            System.out.println(empleado);
//        }


        //Empleado actualizarEmpleado = empleadoCrontroller.findOne(2);
        //actualizarEmpleado.setNombre();
        //empleadoCrontroller.update(actualizarEmpleado);


        //Integer idEliminar = 2;
        //empleadoCrontroller.delete(2);
    }
}