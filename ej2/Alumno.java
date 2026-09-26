
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

public class Alumno extends Persona{ //extend es herencia

    private float promedio;
    private int legajo;

    // CREO EL CONSTRUCTOR tengo que poner los heredados
    public Alumno(String nombre, int dni, float promedio, int legajo) {
       
        super (nombre,dni); //llama al constructor de la clase padre (Persona)
        this.promedio = promedio;
        this.legajo = legajo;
    }

    // getters
    public float getPromedio() {
        return promedio;
    }

    public int getLegajo() {
        return legajo;
    }

    // Sobrescribo mostrarDatos() para mostrar TODA la info (heredada + propia)
    @Override

    public void mostrardatos() {
        super.mostrardatos();//// super.mostrarDatos() ejecuta la versión ORIGINAL del método,
        System.out.println("Legajo: " + legajo);
        System.out.println("Promedio: " + promedio);
    }
}