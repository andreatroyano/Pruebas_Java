package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Empleado;

import java.util.List;


public class EmpleadoJPA {


    public void create(Empleado nuevoEmpleado) {

        try (EntityManager em = ConfigJPA.getEntityManager()) {
            // guardar algo en la DB
            em.getTransaction().begin(); // Iniciar una transacción
            em.persist(nuevoEmpleado);
            em.getTransaction().commit();

        }
    }

    public Empleado findOne(Integer idBuscado) {
        try (EntityManager em = ConfigJPA.getEntityManager()) {
            return em.find(Empleado.class, idBuscado);
        }

    }

    public List<Empleado> findAll() {
        try (EntityManager em = ConfigJPA.getEntityManager()) {
            TypedQuery<Empleado> query = em.createQuery("SELECT p FROM empleados p", Empleado.class);
            return query.getResultList();
        }

    }

    public void update(Empleado actualizarEmpleado) {
        try (EntityManager em = ConfigJPA.getEntityManager()) {
            em.getTransaction().begin(); // Iniciar una transaccion
            em.merge(actualizarEmpleado);
            em.getTransaction().commit();
        }
    }

    public void delete(Integer idEliminar) {
        try (EntityManager em = ConfigJPA.getEntityManager()) {
            em.getTransaction().begin(); // Iniciar una transaccion
            Empleado empleado = em.find(Empleado.class, idEliminar);
            if (empleado != null) {
                em.remove(empleado);
            } else {
                System.err.println("El id " + idEliminar + " No existe.");
            }
            em.getTransaction().commit();
        }
    }
}
