package org.example;

import org.example.controllers.EmpleadoController;
import org.example.entities.Empleado;
import org.example.persistence.EmpleadoJPA;

import java.time.LocalDateTime;
import java.util.List;


//public class Main {
//    public static void main(String[] args) {
//       INSTRUCCIONES:
//        create(Empleado nuevoEmpleado) - Para crear un nuevo empleado.
//        findOne(String cargoBuscado) - Para encontrar un empleado por su cargo.
//        buscarPorCargo - Para buscar todos los empleados con un determinado cargo.
//        findAll() - Para listar todos los empleados.
//        update(Empleado actualizarEmpleado) - Para actualizar los datos de un empleado.
//        delete(Integer idEliminar) - Para eliminar un empleado por su ID.
//
//
//        //EmpleadoController empleadoCrontroller = new EmpleadoController();
//
//        Empleado nuevoEmpleado = new Empleado(null, "Lucas", "Mercero", "Administrativo",1300.65, LocalDateTime.of(2020,6,1,0,0,0));
//        empleadoCrontroller.create(nuevoEmpleado);
//        System.out.println(nuevoEmpleado);
//
//
//        Empleado empleado = empleadoCrontroller.findOne(1);
//        System.out.println(empleado);
//
//
//        // Buscar empleados con el cargo "Adjunta"
//        EmpleadoJPA empleadoJPA = new EmpleadoJPA();
//        List<Empleado> empleadosPorCargo = empleadoJPA.buscarPorCargo("Adjunta");
//
//        System.out.println("Número de empleados encontrados: " + empleadosPorCargo.size());
//        for (Empleado empleado : empleadosPorCargo) {
//            System.out.println(empleado.getNombre() + " " + empleado.getApellido());//        }
//    }
//}
//        List<Empleado> todosLosEmpleados = empleadoCrontroller.findAll();
//        for (Empleado empleado : todosLosEmpleados ){
//            System.out.println(empleado);
//        }
//
//
//        Empleado actualizarEmpleado = empleadoCrontroller.findOne(2);
//        actualizarEmpleado.setNombre();
//        empleadoCrontroller.update(actualizarEmpleado);
//
//
//        Integer idEliminar = 2;
//        empleadoCrontroller.delete(2);
//    }
//}