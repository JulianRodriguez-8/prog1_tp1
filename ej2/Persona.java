package prog1_tp1.ej2;

/*  Ejercicio 2: Herencia y constructores
Diseñar una jerarquía de clases para representar personas de una universidad.
Crear una clase Persona con los atributos privados nombre y dni, y una clase Alumno que
herede de ella y agregue legajo y promedio.
Implementar los constructores correspondientes utilizando super(...) para inicializar los
atributos heredados.
Crear un método mostrarDatos() que permita visualizar la información completa de un
alumno.
Probar el funcionamiento mediante un programa principal. */

public class Persona {
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) { // Un constructor es un método especial que se ejecuta automáticamente
                                             // cuando creás un objeto nuevo con new. Su trabajo es "armar" el objeto,
                                             // dándole sus valores iniciales.
        this.nombre = nombre;
        this.dni = dni;

    }

    // Los get (getters) son métodos que sirven para leer el valor de un atributo
    // privado desde afuera de la clase.
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    // MUESTRO
    public void mostrardatos() {

        System.out.println("nombre:" + nombre);

        System.out.println("Dni:" + dni);
    }
}
