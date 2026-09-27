/*Utilizando la jerarquía de empleados del ejercicio anterior, desarrollar un programa que permita
administrar distintos tipos de empleados utilizando referencias de tipo Empleado.
Crear un arreglo de empleados que contenga objetos EmpleadoPlanta y
EmpleadoContratado.
Recorrer el arreglo y mostrar el nombre y sueldo de cada empleado mediante el método
calcularSueldo().
El programa deberá funcionar utilizando polimorfismo, sin determinar mediante if o switch el
tipo concreto de cada empleado.
Analizar mediante pruebas qué implementación de calcularSueldo() ejecuta Java para cada
objeto.*/

package prog1_tp1.ej3;

public class main_ej4 {
    public static void main(String[] args) {
        // Creo un empleado de planta y otro contratado
        EmpleadoPlanta EP1 = new EmpleadoPlanta(/* sueldo */ 150000, /* antiguedad */ 15f, /* dni */ 46807349,
                /* nombre */"julian");
        // creo el contratado que tiene otro orden
        EmpleadoContratado EC1 = new EmpleadoContratado(897654, "robert", 160f, 2500f);
        EmpleadoPlanta EP2 = new EmpleadoPlanta(180000f, 3f, 30111222, "sofia");
        EmpleadoContratado EC2 = new EmpleadoContratado(30222333, "marco", 120f, 3000f);

        // Arreglo de tipo Empleado (el tipo PADRE/abstracto), que mezcla ambos tipos
        // concretos
        Empleado[] empleados = { EP1, EC1, EP2, EC2 };

        // Recorro el arreglo SIN preguntar de qué tipo es cada uno (sin if, sin switch)
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() + " - Sueldo: " + e.calcularSueldo());
        }

    }
}