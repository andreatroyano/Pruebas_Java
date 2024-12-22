package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity(name = "empleados")
public class Empleado {

    /*Crear columnas de la tabla Empleados*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column()
    private String nombre;

    @Column()
    private String apellido;

    @Column()
    private String cargo;

    @Column()
    private double salario;

    @Column()
    private int fechaDeInicio;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String apellido, String cargo, double salario, int fechaDeInicio) {
        this.id = id;
        this.fechaDeInicio = fechaDeInicio;
        this.salario = salario;
        this.cargo = cargo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFechaDeInicio() {

        return 0;
    }

    public void setFechaDeInicio(int fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", fechaDeInicio=" + fechaDeInicio +
                '}';
    }
}
