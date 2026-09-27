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
public class EmpleadoPlanta extends Empleado{
    private float sueldoBase;
    private float antiguedad;
    //constructor
    public EmpleadoPlanta(float sueldoBase,float antiguedad,int dni,String nombre){
      super dni,nombre;
      this.sueldoBase=sueldoBase;
      



    }
}
