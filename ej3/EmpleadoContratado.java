package prog1_tp1.ej3;
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
public class EmpleadoContratado extends Empleado {
    private float horasTrabajadas;
    private float valorHora;

    public EmpleadoContratado (int dni,String nombre, float horasTrabajadas,float valorHora){
        super (dni,nombre);
        this.horasTrabajadas=horasTrabajadas;
        this.valorHora=valorHora;
    }
    @Override 
    public double calcularSueldo(){
        return horasTrabajadas*valorHora;

    }

    
}
