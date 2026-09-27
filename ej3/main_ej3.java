/*  Ejercicio 3: Clases abstractas y
sobrescritura
El área de Recursos Humanos necesita calcular los sueldos de sus empleados.
Diseñar una jerarquía cuya clase base sea una clase abstracta Empleado, con los atributos
comunes que considere necesarios y un método abstracto:
public abstract double calcularSueldo();
Crear las clases EmpleadoPlanta y EmpleadoContratado, definiendo en cada una los
atributos necesarios y la forma de calcular el sueldo.
Para los empleados de planta, el sueldo se calculará como:
sueldoBase + (sueldoBase × 0.02 × antiguedadAnios)
Para los contratados:
horasTrabajadas × valorHora
Implementar los métodos correspondientes utilizando @Override.
Crear un programa que permita probar ambas clases. */
package prog1_tp1.ej3;

public class main_ej3 {
    public static void main(String[] args) {
        // Creo un empleado de planta y otro contratado
        EmpleadoPlanta EP1 = new EmpleadoPlanta(/* sueldo */ 150000, /* antiguedad */ 15f, /* dni */ 46807349,
                /* nombre */"julian");
        // creo el contratado que tiene otro orden
        EmpleadoContratado EC1 = new EmpleadoContratado(897654, "robert", 160f, 2500f);

        // muestro
        System.out.println("Informacion sobre el empleado de planta: " + EP1.getNombre() + " - Dni: " + EP1.getDni()
                + " - Sueldo: " + EP1.calcularSueldo());
        System.out.println("Informacion sobre el empleado contratado: " + EC1.getNombre() + " - Dni: " + EC1.getDni()
                + " - Sueldo: " + EC1.calcularSueldo());

    }
}
