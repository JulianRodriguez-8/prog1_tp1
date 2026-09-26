package prog1_tp1.ej2;

/*Ejercicio 2: Herencia y constructores
Diseñar una jerarquía de clases para representar personas de una universidad.
Crear una clase Persona con los atributos privados nombre y dni, y una clase Alumno que
herede de ella y agregue legajo y promedio.
Implementar los constructores correspondientes utilizando super(...) para inicializar los
atributos heredados.
Crear un método mostrarDatos() que permita visualizar la información completa de un
alumno.
Probar el funcionamiento mediante un programa principal.*/

public class main_ej2 {
    public static void main(String[] args) {

        // Creo dos alumnos usando el constructor de Alumno,
        // que por dentro llama a super(nombre, dni) para inicializar
        // la parte heredada de Persona
        Alumno alumno1 = new Alumno("Julián", 40123456, 9.5f,934554);
        Alumno alumno2 = new Alumno("Marco", 41234567, 6.7f, 63553);

        // Llamo a mostrarDatos() de cada uno.
        // Java ejecuta la versión de Alumno (la que tiene @Override),
        // que a su vez llama a super.mostrarDatos() por dentro
        // para mostrar también nombre y dni heredados de Persona
        alumno1.mostrardatos();
        System.out.println("-----");
        alumno2.mostrardatos();
    }
}