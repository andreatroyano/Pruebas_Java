package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Empleado;

import java.util.List;


public class EmpleadoJPA {


    public void create(Empleado nuevoEmpleado) {
        EntityManager em = ConfigJPA.getEntityManager();

        try{
            // guardar algo en la DB
            em.getTransaction().begin(); // Iniciar una transaccion
            em.persist(nuevoEmpleado);
            em.getTransaction().commit();

        }finally {
            em.close();
        }
    }

    public Empleado findOne(String cargoBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            return em.find(Empleado.class, cargoBuscado);
        }finally {
            em.close();
        }

    }

    public List<Empleado> findAll() {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            TypedQuery<Empleado> query = em.createQuery("SELECT p FROM empleados p", Empleado.class);
            return query.getResultList();
        }finally {
            em.close();
        }

    }

    public void update(Empleado actualizarEmpleado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); // Inicia una transaccion
            em.merge(actualizarEmpleado);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public void delete(Integer idEliminar) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); // Iniciar una transaccion
            Empleado movie = em.find(Empleado.class, idEliminar);
            if (movie != null){
                em.remove(movie);
            }else{
                System.err.println("El id " + idEliminar + " No existe.");
            }
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
}
