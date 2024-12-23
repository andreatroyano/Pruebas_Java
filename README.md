# Pruebas_Java

# Proyecto de Gestión de Empleados en Java

Este proyecto consiste en una aplicación backend para la gestión de empleados en una empresa. La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los empleados, usando JPA (Java Persistence API) para interactuar con una base de datos SQL.

---

## Requisitos

- **Java 17** o superior
- **JPA (Jakarta Persistence API)**
- **Hibernate** como proveedor de JPA
- **Base de datos SQL** (MySQL)
- **IntelliJ IDEA** o cualquier IDE compatible con Java

---

## Configuración

1. **Configuración de la base de datos:**
   - Crear una base de datos llamada empleados en mi sistema de base de datos SQL.
   - Crear una tabla empleados con los siguientes campos:
   
     CREATE TABLE empleados (
         id INT AUTO_INCREMENT PRIMARY KEY,
         nombre VARCHAR(55),
         apellido VARCHAR(55),
         cargo VARCHAR(55),
         salario DOUBLE,
         fecha_inicio DATE
     );
     

2. **Configuración de la conexión a la base de datos:**
   - Asegurarme de tener configurado un archivo persistence.xml en el proyecto para la conexión JPA con mi base de datos
     

---

## Estructura del Proyecto

La estructura básica de carpetas del proyecto es la siguiente:

src/
main/
java/
org/
example/
entities/ // Clases de entidad JPA (Empleado.java)
persistence/ // Clases de persistencia JPA (EmpleadoJPA.java, ConfigJPA.java)
Main.java // Clase principal para ejecutar el programa
resources/
META-INF/
persistence.xml // Configuración de JPA

---

## Pasos Realizados

### 1. **Creación de la clase `Empleado`**
   - La clase Empleado representa la entidad que se almacenará en la base de datos. Esta clase está anotada con @Entity y contiene los campos como id, nombre, apellido, cargo, salario y fecha_inicio.
   
   @Entity
   @Table(name = "empleados")
   public class Empleado {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Integer id;
       private String nombre;
       private String apellido;
       private String cargo;
       private Double salario;
       private LocalDate fechaInicio;
   }

### 2. Configuración de JPA (ConfigJPA)
Creé una clase ConfigJPA que gestiona la creación del EntityManagerFactory y la obtención de un EntityManager para interactuar con la base de datos.

public class ConfigJPA {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("empleadosPU");

   public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}

### 3. Creación de la clase EmpleadoJPA
La clase EmpleadoJPA contiene los métodos CRUD para gestionar los empleados, como:
create(Empleado nuevoEmpleado) - Para crear un nuevo empleado.
findOne(String cargoBuscado) - Para encontrar un empleado por su cargo.
findAll() - Para listar todos los empleados.
update(Empleado actualizarEmpleado) - Para actualizar los datos de un empleado.
delete(Integer idEliminar) - Para eliminar un empleado por su ID.
buscarPorCargo - Para buscar todos los empleados con un determinado cargo.


public class EmpleadoJPA {
    public void create(Empleado nuevoEmpleado) {
        EntityManager em = ConfigJPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(nuevoEmpleado);
        em.getTransaction().commit();
        em.close();
    }

   public List<Empleado> buscarPorCargo(String cargo) {
        EntityManager em = ConfigJPA.getEntityManager();
        List<Empleado> empleados = em.createQuery("SELECT * FROM empleados WHERE cargo = ?", Empleado.class)
                                      .setParameter("cargo", cargo)
                                      .getResultList();
        em.close();
        return empleados;
    }
}


### 4. Realización de pruebas
Implementé una clase Main para realizar pruebas, como agregar empleados a la base de datos y buscar empleados por su cargo.

public class Main {
    public static void main(String[] args) {
        EmpleadoJPA empleadoJPA = new EmpleadoJPA();
        List<Empleado> empleadosPorCargo = empleadoJPA.buscarPorCargo("Adjunta");
    }
}


### 5. Pruebas y Ajustes
Realicé la prueba para verificar que los empleados con el cargo "Gerente" sean correctamente recuperados de la base de datos.
Ejecuté el proyecto desde mi IDE (IntelliJ IDEA, Eclipse, etc.).
Inserté empleados en la base de datos usando el método create.
Consulté empleados por cargo utilizando el método buscarPorCargo y pasando el cargo deseado como parámetro.
Verifiqué los resultados en la consola.

### 6.Dependencias
Este proyecto utiliza las siguientes dependencias:

Hibernate (como proveedor de JPA)
Jakarta Persistence API (JPA)
Estas dependencias se gestionan a través del archivo pom.xml si estoy utilizando Maven para la gestión de dependencias.


### Conclusión
Este proyecto implementa una aplicación de gestión de empleados utilizando Java, JPA, Hibernate y una base de datos SQL. Con la implementación de los métodos CRUD, puedo gestionar fácilmente la información de los empleados en la base de datos.


